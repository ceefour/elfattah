package org.elfattah.shell.internal;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.MessageDriven;
import org.apache.camel.ProducerTemplate;
import org.elfattah.impl.ShellBase;
import org.springframework.stereotype.Service;

/**
 * Shell used to query the El-Fattah knowledge base.
 */
@Service("queryShell")
public final class QueryShell extends ShellBase
{

	@Override
	@MessageDriven(uri="seda:shellIn")
	public void process(String message) {
		reply("Thank you for saying '"+ message + "'");
		reply("Seriously, this is good...!");
	}
	
	@Override
	@EndpointInject(uri="seda:shellOut")
	public void setProducer(ProducerTemplate<Exchange> responseEndpoint) {
		super.setProducer(responseEndpoint);
	}
}

