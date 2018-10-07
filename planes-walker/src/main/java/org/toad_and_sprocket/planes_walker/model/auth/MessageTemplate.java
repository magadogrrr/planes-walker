package org.toad_and_sprocket.planes_walker.model.auth;

import java.util.List;

import javax.annotation.Resource.AuthenticationType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MessageTemplate {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String description;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id")
	private ResourceContext context;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id")
	private ResourceDetails details;
	
	@Enumerated(EnumType.STRING)
	private AuthenticationType authType;
	
	private List<String> tags;
}
