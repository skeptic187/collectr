package de.eberle.microswarm;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Tobias Eberle
 */
@Path("/")
@ApplicationScoped
public class PersonResource {

	@Inject
	PersistenceHelper helper;

	@GET
	@Produces("application/json")
	public List<Person> get() {
		return helper.getEntityManager().createNamedQuery("Person.findAll", Person.class).getResultList();
	}

}