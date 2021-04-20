package io.github.astrapi69.entity.enums;

/**
 * The enum {@link VerificationState} holds the state of a verifiable object
 */
public enum VerificationState
{

	/**
	 * This state signals that a verifiable object
	 * has been manipulated and therefore not processable anymore. An investigation have to be 
	 * started to find the cause of the manipulation
	 */
	INITIAL_BROKEN,
	
	/**
	 * This state signals an investigation has
	 * started to find the cause of the manipulation
	 */
	EVALUATE,

	/**
	 * This state signals that the investigation has
	 * finished and the signature of the verifiable object can be new generated and set
	 */
	RESET,

	/**
	 * This state signals that the verifiable object
	 * is verified and is processable
	 */
	VERIFIED
}
