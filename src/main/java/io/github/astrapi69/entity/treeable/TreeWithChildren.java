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
package io.github.astrapi69.entity.treeable;

import java.util.Collection;

/**
 * The interface {@link TreeWithChildren} can keep information for a tree structure with its
 * children.
 *
 * @param <T>
 *            the generic type of the value from this tree entity
 * @param <TR>
 *            the generic type of the concrete entity that will implement this interface
 */
public interface TreeWithChildren<T, TR extends TreeWithChildren> extends Treeable<T, TR>
{

	/**
	 * Gets the children of this tree node
	 *
	 * @return a collection with the children of this tree node
	 */
	Collection<TR> getChildren();

	/**
	 * Sets the children of this tree node
	 *
	 * @param children
	 *            the new children
	 */
	void setChildren(Collection<TR> children);

	/**
	 * Adds the given child to the children collection
	 *
	 * @param child
	 *            the child to add
	 */
	void addChild(TR child);

	/**
	 * Removes the given child from the children collection
	 *
	 * @param child
	 *            the child to remove
	 */
	void removeChild(TR child);

}
