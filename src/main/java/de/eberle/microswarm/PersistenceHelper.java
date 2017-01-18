package de.eberle.microswarm;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Tobias Eberle
 */
@ApplicationScoped
public class PersistenceHelper {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}
}
