package org.toad_and_sprocket.planes_walker.config;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class OAuth2ResourceDetails implements OAuth2ProtectedResourceDetails {

	private String clientId;
	private String accessTokenUri;
	@Id
	private String id;
	private boolean scoped;
	private List<String> scope;
	private boolean authenticationRequired;
	private String clientSecret;
	private AuthenticationScheme clientAuthenticationScheme;
	private String grantType;
	private AuthenticationScheme authenticationScheme;
	private String tokenName;
	private boolean clientOnly;
	
}
