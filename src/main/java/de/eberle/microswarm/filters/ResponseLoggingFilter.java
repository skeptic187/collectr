package de.eberle.microswarm.filters;

import java.io.IOException;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import de.eberle.microswarm.qualifiers.Logged;

@Logged
@Provider
public class ResponseLoggingFilter implements ContainerResponseFilter {

	@Inject
	private Logger log;

	@Context
	private HttpServletRequest request;

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		log.info(request.getRemoteAddr());
	}
}