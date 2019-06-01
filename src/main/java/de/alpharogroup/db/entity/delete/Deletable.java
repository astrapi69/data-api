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
package de.alpharogroup.db.entity.delete;

/**
 * The interface {@link Deletable} can be implemented from an entity that needs the data of the
 * point of time from its deletion
 *
 * @param <T>
 *            the generic type of time measurement
 * @param <U>
 *            the generic type of the user or account
 */
public interface Deletable<T, U>
{

	/**
	 * Gets the point of time from deletion
	 *
	 * @return the point of time from deletion
	 */
	T getDeleted();

	/**
	 * Gets the user or account that deleted this entity
	 *
	 * @return the user or account that deleted this entity
	 */
	U getDeletedBy();

	/**
	 * Sets the point of time from deletion
	 *
	 * @param created
	 *            the point of time from deletion
	 */
	void setDeleted(T created);

	/**
	 * Sets the user or account that deleted this entity
	 *
	 * @param user
	 *            the user or account that deleted this entity
	 */
	void setDeletedBy(U user);
}
