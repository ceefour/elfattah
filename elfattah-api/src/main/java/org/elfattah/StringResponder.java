package org.elfattah;

public interface StringResponder {

	/**
	 * Returns response processor.
	 * @return
	 */
	public abstract StringProcessor getResponseProcessor();

	/**
	 * Sets the response processor.
	 * @param responseProcessor
	 */
	public abstract void setResponseProcessor(StringProcessor responseProcessor);

}