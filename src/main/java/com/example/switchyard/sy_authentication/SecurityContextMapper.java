package com.example.switchyard.sy_authentication;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.switchyard.Context;
import org.switchyard.bus.camel.CamelExchangeProperty;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyContextMapper;
import org.switchyard.security.context.SecurityContext;
import org.switchyard.security.credential.Credential;
import org.switchyard.security.credential.NameCredential;

public class SecurityContextMapper extends RESTEasyContextMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityContextMapper.class); 
	
	@Override
	public void mapFrom(RESTEasyBindingData source, Context context) throws Exception {

		CamelExchangeProperty camelProperty= (CamelExchangeProperty)  context.getProperty("org.switchyard.security.context.SecurityContext");
		
		SecurityContext securityContext = (SecurityContext)camelProperty.getValue();
		Set<Credential> credentials = securityContext.getCredentials();
		
		for (Credential credential : credentials) {
			if (credential instanceof NameCredential) {
				String username = ((NameCredential) credential).getName();
				LOGGER.info("Adding \"username\" header with value: " + username);
				source.addHeader("username", username);				
			}
		}
		
		// This needs to be last
		super.mapFrom(source, context);
	}

}
