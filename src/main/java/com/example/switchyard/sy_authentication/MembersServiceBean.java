package com.example.switchyard.sy_authentication;

import org.switchyard.component.bean.Service;

@Service(MembersService.class)
public class MembersServiceBean implements MembersService {

	@Override
	public void callMembersV1(String payload) {
		System.out.println("Members v1 called with " + payload);

	}

	@Override
	public void callMembersV2(String payload) {
		System.out.println("Members v2 called with " + payload);

	}

}
