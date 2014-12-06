package com.tool.ws.resource;

import java.util.HashSet;
import java.util.Set;


public class ResourceConfig {
	
	public ResourceConfig(){
		final Set<Class<?>> resource = new HashSet<Class<?>>();
		resource.add(com.tool.ws.resource.Resource.class);
	}

}
