/**
 * 
 */
package org.elfattah.impl;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.elfattah.Shell;
import org.elfattah.StringProcessor;

/**
 * Base class for {@link Shell} implementors.
 * 
 * Can also be used directly as a Camel {@link Processor}, in which case
 * setListener should not be called.
 * 
 * @author ceefour
 */
public abstract class ShellBase implements Shell, Processor {
	private StringProcessor responseProcessor;
	
	private ProducerTemplate<Exchange> producer;
	
	@Override
	public ProducerTemplate<Exchange> getProducer() {
		return producer;
	}
	
	@Override
	public StringProcessor getResponseProcessor() {
		return responseProcessor;
	}

	/**
	 * If Message comes from a Camel {@link Exchange}, listener
	 * will be overridden.
	 */
	@Override
	public void process(final Exchange exchange) throws Exception {
		process(exchange.getIn().getBody(String.class));
	}

	/**
	 * Notifies the listener with output text.
	 */
	protected void reply(String text) {
		if (responseProcessor != null)
			responseProcessor.process(text);
		if (producer != null)
			producer.sendBody(text);
	}

	@Override
	public void setProducer(ProducerTemplate<Exchange> responseEndpoint) {
		this.producer = responseEndpoint;
	}

	@Override
	public void setResponseProcessor(StringProcessor replyProcessor) {
		this.responseProcessor = replyProcessor;
	}

	@Override
	public void start() {
		// dummy
	}
	
	@Override
	public void stop() {
		// dummy
	}

}
