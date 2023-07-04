package com.overcome.cona.functions;

import java.util.logging.Logger;

import com.overcome.cona.ServiceFactory;
import com.overcome.cona.service.ExampleEntityService;

public class ExampleEntityFunctions {
	private ExampleEntityService exampleEntityService = ServiceFactory.getInstance().getExampleEntityService();
	private static final Logger logger = Logger.getLogger(ExampleEntityFunctions.class.getName());
	
	
}
