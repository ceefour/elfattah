package org.elfattah;

import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;

public interface Responder {

	/**
	 * Returns the producer for sending responses.
	 * @return
	 */
	public abstract ProducerTemplate<Exchange> getProducer();

	/**
	 * Sets the producer for sending responses.
	 * @param producer
	 */
	public abstract void setProducer(ProducerTemplate<Exchange> producer);

}