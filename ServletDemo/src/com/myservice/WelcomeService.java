package com.myservice;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	
	public List<String> getMessages(String name) {
		
		List<String> msgs = new ArrayList<String>();
		msgs.add("Hello");
		msgs.add(name);
		msgs.add(", ");
		msgs.add("Welcome to my First Servlet");
		
		return msgs;
		
	}

}
