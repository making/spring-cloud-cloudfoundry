package org.springframework.cloud.cloudfoundry.discovery;

/**
 * {@link ServiceIdToHostnameConverter} implementation that simply appends app.internal
 * domain.
 *
 * @author Toshiaki Maki
 */
public class DefaultServiceIdToHostnameConverter implements ServiceIdToHostnameConverter {
	@Override
	public String toHostname(String serviceId) {
		return serviceId + "." + INTERNAL_DOMAIN;
	}
}
