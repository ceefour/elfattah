package org.elfattah.shell.internal;

import org.elfattah.Shell;
import org.elfattah.impl.ShellBase;

/**
 * Shell used to query the El-Fattah knowledge base.
 */
public final class QueryShell extends ShellBase
    implements Shell
{

	public void receiveInput(String command) {
		notifyOutputText("Thank you for saying '"+ command + "'");
	}
}

