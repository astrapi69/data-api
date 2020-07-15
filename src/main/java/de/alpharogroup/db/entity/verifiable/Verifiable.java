package de.alpharogroup.db.entity.verifiable;

/**
 * The interface {@link Verifiable} is for entities that can be signed and verified
 */
public interface Verifiable
{

	/**
	 * Gets the signature
	 *
	 * @return the signature
	 */
	String getSignature();

	/**
	 * Sets the given signature
	 *
	 * @param signature the signature to set
	 */
	void setSignature(String signature);

}