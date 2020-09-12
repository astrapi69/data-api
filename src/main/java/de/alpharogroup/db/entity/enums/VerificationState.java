package de.alpharogroup.db.entity.enums;

/**
 * The enum {@link VerificationState} holds the state of a verifiable object
 */
public enum VerificationState
{

	/**
	 * The state {@link VerificationState#INITIAL_BROKEN} signals that a verifiable object
	 * has been manipulated and therefore not processable anymore. An investigation have to be 
	 * started to find the cause of the manipulation
	 */
	INITIAL_BROKEN,
	
	/**
	 * The state {@link VerificationState#EVALUATE} signals an investigation has 
	 * started to find the cause of the manipulation
	 */
	EVALUATE,

	/**
	 * The state {@link VerificationState#RESET} signals that the investigation has 
	 * finished and the signature of the verifiable object can be new generated and set
	 */
	RESET,

	/**
	 * The state {@link VerificationState#VERIFIED} signals that the verifiable object 
	 * is verified and is processable
	 */
	VERIFIED;
}
