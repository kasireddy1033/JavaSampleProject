package com.nexus.sample.java.serviceimpl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nexus.sample.java.domain.History;
import com.nexus.sample.java.service.HistoryService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

	public History getHistory() {
		Client client = Client.create();
		WebResource webResource = client.resource("http://history.muffinlabs.com/date/12/25");
		ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
		String output = response.getEntity(String.class);

		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonElement jsonTree = parser.parse(output);
		if (jsonTree.isJsonObject()) {
			JsonObject jsonObject = jsonTree.getAsJsonObject();

			History history = gson.fromJson((jsonObject), History.class);

			return history;

		}
		return null;
	}

}
