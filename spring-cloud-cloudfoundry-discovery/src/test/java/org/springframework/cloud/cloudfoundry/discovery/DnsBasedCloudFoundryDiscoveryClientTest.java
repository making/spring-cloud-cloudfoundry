package org.springframework.cloud.cloudfoundry.discovery;

import org.apache.directory.server.dns.DnsServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DnsBasedCloudFoundryDiscoveryClientTest {
	private static final DnsServer dnsServer = new DnsServer();

	@BeforeClass
	public static void init() throws Exception {
		dnsServer.start();
	}

	@AfterClass
	public static void destroy() {
		dnsServer.stop();
	}

	@Test
	public void getInstances() {
	}
}