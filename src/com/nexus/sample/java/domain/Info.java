package com.nexus.sample.java.domain;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Info {
private ArrayList<Event> Events;
private ArrayList<Event> Births;
private ArrayList<Event> Deaths;
}
