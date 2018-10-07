package org.toad_and_sprocket.planes_walker.model.auth;

import java.util.Arrays;
import java.util.function.Function;

public enum PlanesWalkerDomain {

	CLIENT_API("C", "CAPI", "Http communication to other api's."),
	GAME_API("G", "GAPI", "Http communication specific to gameplay."),
	AUTHENTICATION("A", "AUTH", "Roles, Permissions, general data security."),
	BREW_DOMAIN("B", "BREW", "Building decks."),
	COLLECTORS("M", "TRADE", "Collecting and trading.");
	
	private final String domainCode;
	private final String longDomainCode;
	private final String domainTitle;
	
	private PlanesWalkerDomain(final String domainCode, final String longDomainCode, final String domainTitle) {
		this.domainCode = domainCode;
		this.longDomainCode = longDomainCode;
		this.domainTitle = domainTitle;
	}
	
	public Function<PlanesWalkerDomain, String> dbCode = PlanesWalkerDomain::getDomainCode;
	public Function<String, PlanesWalkerDomain> savedEntity = c->domain4longcode(c);
	
	public static PlanesWalkerDomain domain4code(final String code) {
		return Arrays.stream(PlanesWalkerDomain.values())
				.filter(d->d.getDomainCode().equalsIgnoreCase(code))
				.findFirst().get(); 
	}
	
	public static PlanesWalkerDomain domain4longcode(final String code) {
		return Arrays.stream(PlanesWalkerDomain.values())
				.filter(d->d.getLongDomainCode().equalsIgnoreCase(code))
				.findFirst().get(); 
	}

	public String getDomainCode() {
		return domainCode;
	}

	public String getLongDomainCode() {
		return longDomainCode;
	}

	public String getDomainTitle() {
		return domainTitle;
	}
	
	
}
