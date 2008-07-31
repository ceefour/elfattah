/**
 * 
 */
package org.elfattah.shell;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.elfattah.Shell;
import org.elfattah.shell.internal.QueryShell;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ceefour
 *
 */
public class ShellRouteBuilder extends RouteBuilder {

	@Autowired
	private QueryShell queryShell;
	
	@Autowired
	private CamelContext camelContext;
	
	@Override
	public void configure() throws Exception {
		from("stream:in?delay=1000").to("seda:shellIn");
		from("seda:shellOut").to("log:org.elfattah.shell");
		//camelContext.createProducerTemplate().
		//queryShell.setProducer( camelContext.getEndpoint("seda:shellOut").createProducer()
				
	}

}
