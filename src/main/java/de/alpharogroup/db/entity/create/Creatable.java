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
package de.alpharogroup.db.entity.create;

/**
 * The interface {@link Creatable} can be implemented from an entity that needs the data of the
 * point of time from its creation
 *
 * @param <T>
 *            the generic type of time measurement
 * @param <U>
 *            the generic type of the user or account
 */
public interface Creatable<T, U>
{

	/** The Constant for the column name 'created'. */
	String COLUMN_NAME_CREATED = "created";

	/** The Constant for the column name 'active'. */
	String COLUMN_NAME_CREATED_BY = "createdBy";

	/**
	 * Gets the point of time from creation
	 *
	 * @return the point of time from creation
	 */
	T getCreated();

	/**
	 * Gets the user or account that created this entity
	 *
	 * @return the user or account that created this entity
	 */
	U getCreatedBy();

	/**
	 * Sets the point of time from creation
	 *
	 * @param created
	 *            the point of time from creation
	 */
	void setCreated(T created);

	/**
	 * Sets the user or account that created this entity
	 *
	 * @param user
	 *            the user or account that created this entity
	 */
	void setCreatedBy(U user);
}
