package de.eberle.microswarm;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import de.eberle.microswarm.qualifiers.Logged;

/**
 * @author Tobias Eberle
 */
@Path("/")
@ApplicationScoped
public class PersonResource {

	@Inject
	private EntityManager em;

	@GET
	@Logged
	@Produces("application/json")
	public List<Person> get() {
		return em.createNamedQuery("Person.findAll", Person.class).getResultList();
	}

}