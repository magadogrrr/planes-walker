package org.toad_and_sprocket.planes_walker.model.auth;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class AuthenticationTypeConverter implements AttributeConverter<AuthenticationStrategyType, String> {

	@Override
	public String convertToDatabaseColumn(AuthenticationStrategyType attribute) {
		return attribute.getCode();
	}

	@Override
	public AuthenticationStrategyType convertToEntityAttribute(String dbData) {
		return AuthenticationStrategyType.forCode(dbData);
	}

}
