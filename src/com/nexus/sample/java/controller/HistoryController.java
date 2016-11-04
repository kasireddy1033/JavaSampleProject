package com.nexus.sample.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.sample.java.domain.History;
import com.nexus.sample.java.service.HistoryService;


@RestController
@RequestMapping(value = "/v1")
public class HistoryController {

	@Autowired
	private HistoryService historyService;

	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public History getHistory() {
		return historyService.getHistory();
	}
}
