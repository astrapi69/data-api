/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
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
package de.alpharogroup.db.entity.treeable;

import java.io.Serializable;

/**
 * The interface {@link Treeable} provides the data for keep information with in a tree structure.
 *
 * @param <PK>
 *            the generic type of the technical primary key
 * @param <T>
 *            the generic type of the value from this tree entity
 * @param <TR>
 *            the generic type of the concrete entity that will implement this interface
 */
@SuppressWarnings("rawtypes")
public interface Treeable<PK extends Serializable, T, TR extends Treeable>
{

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	T getValue();

	/**
	 * Checks if this is a node
	 *
	 * @return true, if it is a node
	 */
	boolean isNode();

	/**
	 * Gets the parent
	 *
	 * @return the parent
	 */
	TR getParent();

	/**
	 * Gets the depth of the node
	 *
	 * @return the depth of the node
	 */
	int getDepth();

	/**
	 * Sets the new depth of the node
	 *
	 * @param depth the new depth
	 */
	void setDepth(int depth);

	/**
	 * Sets the value
	 *
	 * @param value
	 *            the new value
	 */
	void setValue(T value);

	/**
	 * Sets the node flag
	 *
	 * @param node
	 *            the new node flag
	 */
	void setNode(boolean node);

	/**
	 * Sets the parent
	 *
	 * @param parent
	 *            the new parent
	 */
	void setParent(TR parent);

}
