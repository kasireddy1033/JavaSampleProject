package com.nexus.sample.java.domain;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Event {
private String year;
private String text;
private String html;
private ArrayList<Link> links;
}
