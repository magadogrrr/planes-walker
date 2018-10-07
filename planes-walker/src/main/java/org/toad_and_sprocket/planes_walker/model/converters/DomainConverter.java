package org.toad_and_sprocket.planes_walker.model.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.toad_and_sprocket.planes_walker.model.auth.PlanesWalkerDomain;

@Converter(autoApply=true)
public class DomainConverter implements AttributeConverter<PlanesWalkerDomain, String> {

	@Override
	public String convertToDatabaseColumn(PlanesWalkerDomain attribute) {
		return attribute.getLongDomainCode();
	}

	@Override
	public PlanesWalkerDomain convertToEntityAttribute(String dbData) {
		return PlanesWalkerDomain.domain4longcode(dbData);
	}

}
