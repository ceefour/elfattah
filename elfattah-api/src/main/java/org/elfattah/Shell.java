package org.elfattah;

import java.util.List;

/**
 * Public API of a Shell service.
 */
public interface Shell
{
	/**
	 * Receives input from the user.
	 * @param command
	 */
    void receiveInput(String command);
    
    /**
     * Returns listeners.
     * @return
     */
    List<ShellListener> getListeners();
    
    /**
     * Sets listeners.
     * @param listeners
     */
    void setListeners(List<ShellListener> listeners);
}

