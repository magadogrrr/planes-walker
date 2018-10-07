package org.toad_and_sprocket.planes_walker.model.auth;

import java.util.Arrays;

public enum AuthenticationStrategyType {

	OATH("OAUTH"),
	OUATH2("OAUTH2"),
	BASIC("BASIC"),
	SSO("SSO"),
	ACKHEAD("ACK");
	
	private String code;
	
	private AuthenticationStrategyType(String code) {
		this.code  = code;
	}
	
	public static AuthenticationStrategyType forCode(String code) {
		return Arrays.stream(AuthenticationStrategyType.values()).filter(a->a.getCode().equals(code)).findFirst().get();
	}
	
	public String getCode() {
		return this.code;
	}
}
