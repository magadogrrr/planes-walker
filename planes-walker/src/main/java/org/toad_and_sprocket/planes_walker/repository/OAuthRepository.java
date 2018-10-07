package org.toad_and_sprocket.planes_walker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toad_and_sprocket.planes_walker.config.OAuth2ResourceDetails;

public interface OAuthRepository extends JpaRepository<OAuth2ResourceDetails, String> {

	
}
