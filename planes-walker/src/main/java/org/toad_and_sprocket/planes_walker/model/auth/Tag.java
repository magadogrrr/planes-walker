package org.toad_and_sprocket.planes_walker.model.auth;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Tag {

	@Id
	private String label;
	private PlanesWalkerDomain domain;
}
