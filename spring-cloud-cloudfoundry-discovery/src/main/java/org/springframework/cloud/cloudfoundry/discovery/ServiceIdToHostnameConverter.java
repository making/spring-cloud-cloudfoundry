package org.springframework.cloud.cloudfoundry.discovery;

/**
 * @author Toshiaki Maki
 */
@FunctionalInterface
public interface ServiceIdToHostnameConverter {
	String INTERNAL_DOMAIN = "apps.internal";

	String toHostname(String serviceId);
}
