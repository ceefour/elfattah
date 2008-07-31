/**
 * 
 */
package org.elfattah;

import org.apache.camel.Body;

/**
 * Gets messages from a {@link Shell}.
 * 
 * @author ceefour
 */
public interface StringProcessor {

	/**
	 * Notifies the listener with a text output.
	 * 
	 * @param text
	 */
	void process(@Body String text);
	
}