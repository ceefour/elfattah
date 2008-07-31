/**
 * 
 */
package org.elfattah;

/**
 * Gets messages from a {@link Shell}.
 * 
 * @author ceefour
 */
public interface ShellListener {

	/**
	 * Notifies the listener with a text output.
	 * 
	 * @param text
	 */
	void outputText(String text);
	
}