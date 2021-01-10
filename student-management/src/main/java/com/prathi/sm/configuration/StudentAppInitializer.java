package com.prathi.sm.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class [] configFile = {StudentManagementAppConfiguration.class};
		
		return configFile;
	}

	@Override
	protected String[] getServletMappings() {
		
		String [] mappingUrls = {"/"};
		
		return mappingUrls;
	}

}
