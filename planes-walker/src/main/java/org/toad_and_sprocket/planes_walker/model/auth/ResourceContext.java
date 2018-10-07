package org.toad_and_sprocket.planes_walker.model.auth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ResourceContext {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
}
