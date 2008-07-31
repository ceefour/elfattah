package org.elfattah;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface Startable {

	/**
	 * Starts the shell.
	 */
	@PostConstruct
	public abstract void start();

	/**
	 * Stops the shell.
	 * 
	 * This method may be called multiple times.
	 */
	@PreDestroy
	public abstract void stop();

}