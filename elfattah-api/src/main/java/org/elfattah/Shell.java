package org.elfattah;




/**
 * Public API of a Shell service.
 * 
 * Shell can send arbitrary amount of text message
 * with or without user interaction.
 */
public interface Shell extends Responder, StringResponder, StringProcessor, Startable
{
    
}