package com.example.switchyard.sy_authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.switchyard.component.bean.Service;

@Service(MembersService.class)
public class MembersServiceBean implements MembersService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MembersServiceBean.class);
	
	@Override
	public void callMembersV1(String payload) {
		LOGGER.info("Members v1 called with " + payload);

	}

	@Override
	public void callMembersV2(String payload) {
		LOGGER.info("Members v2 called with " + payload);

	}

}
