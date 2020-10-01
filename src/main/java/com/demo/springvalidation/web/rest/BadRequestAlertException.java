/*
 *
 */
package com.demo.springvalidation.web.rest;

// TODO: Auto-generated Javadoc
/**
 * The Class BadRequestAlertException.
 */
public class BadRequestAlertException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The message. */
    private final String message;

    /** The entity name. */
    private final String entityName;

    /** The error key. */
    private final String errorKey;

    /**
     * Instantiates a new bad request alert exception.
     *
     * @param defaultMessage the default message
     * @param entityName     the entity name
     * @param errorKey       the error key
     */
    public BadRequestAlertException(String defaultMessage, String entityName, String errorKey) {
	message = defaultMessage;
	this.entityName = entityName;
	this.errorKey = errorKey;
    }

    /**
     * Gets the entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
	return entityName;
    }

    /**
     * Gets the error key.
     *
     * @return the error key
     */
    public String getErrorKey() {
	return errorKey;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    @Override
    public String getMessage() {
	return message;
    }

}
