/**
 * 
 */
package org.elfattah;

/**
 * Provides a service that handles SPARQL queries.
 * 
 * @author ceefour
 */
public interface SemanticQueryService {

	/**
	 * Executes a SPARQL query and returns results as N3.
	 * 
	 * @param query
	 * @return
	 */
	String query(String query);

}
