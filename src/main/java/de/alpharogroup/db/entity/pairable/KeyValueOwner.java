/**
 * The MIT License
 *
 * Copyright (C) 2018 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.db.entity.pairable;

/**
 * The interface {@link KeyValueOwner} can be implemented from an entity that needs the data of a
 * generic key value pair with his owner which can be also the parent if it is from the same type.
 *
 * @param <O>
 *            the generic type of the owner
 * @param <K>
 *            the generic type of the key
 * @param <V>
 *            the generic type of the value
 */
public interface KeyValueOwner<O, K, V>
{

	/** The Constant for the column name 'key'. */
	String COLUMN_NAME_KEY = "key";

	/** The Constant for the column name 'owner'. */
	String COLUMN_NAME_OWNER = "owner";

	/** The Constant for the column name 'value'. */
	String COLUMN_NAME_VALUE = "value";

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	K getKey();

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	O getOwner();

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	V getValue();

	/**
	 * Sets the key.
	 *
	 * @param key
	 *            the new key
	 */
	void setKey(final K key);

	/**
	 * Sets the owner.
	 *
	 * @param owner
	 *            the new owner
	 */
	void setOwner(final O owner);

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	void setValue(final V value);
}
