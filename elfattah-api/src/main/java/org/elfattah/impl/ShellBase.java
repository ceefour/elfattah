/**
 * 
 */
package org.elfattah.impl;

import java.util.List;

import org.elfattah.Shell;
import org.elfattah.ShellListener;

/**
 * Base class for {@link Shell} implementors.
 * 
 * @author ceefour
 */
public abstract class ShellBase implements Shell {

	private List<ShellListener> listeners;

	/**
	 * @return the listeners
	 */
	@Override
	public List<ShellListener> getListeners() {
		return listeners;
	}

	/**
	 * @param listeners the listeners to set
	 */
	@Override
	public void setListeners(List<ShellListener> listeners) {
		this.listeners = listeners;
	}
	
	/**
	 * Notifies all listeners with output text.
	 */
	protected void notifyOutputText(String text) {
		for (ShellListener listener : listeners) {
			listener.outputText(text);
		}
	}

}
