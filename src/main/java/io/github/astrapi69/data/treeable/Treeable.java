/**
 * The MIT License
 * <p>
 * Copyright (C) 2018 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.data.treeable;

/**
 * The interface {@link Treeable} can keep information for a tree structure.
 *
 * @param <T>
 *            the generic type of the value from this tree data
 * @param <TR>
 *            the generic type of the concrete data that will implement this interface
 */
public interface Treeable<T, TR extends Treeable<T, TR>>
{

	/** The Constant for the column name 'depth'. */
	String COLUMN_NAME_DEPTH = "depth";

	/** The Constant for the column name 'node'. */
	String COLUMN_NAME_NODE = "node";

	/** The Constant for the column name 'parent'. */
	String COLUMN_NAME_PARENT = "parent";

	/** The Constant for the column name 'value'. */
	String COLUMN_NAME_VALUE = "value";

	/**
	 * Gets the depth of this tree node
	 *
	 * @return the depth of this tree node
	 */
	int getDepth();

	/**
	 * Sets the new depth of this tree node
	 *
	 * @param depth
	 *            the new depth
	 */
	void setDepth(int depth);

	/**
	 * Gets the parent of this tree node
	 *
	 * @return the parent of this tree node
	 */
	TR getParent();

	/**
	 * Sets the parent of this tree node
	 *
	 * @param parent
	 *            the new parent of this tree node
	 */
	void setParent(TR parent);

	/**
	 * Gets the value
	 *
	 * @return the value
	 */
	T getValue();

	/**
	 * Sets the value
	 *
	 * @param value
	 *            the new value
	 */
	void setValue(T value);

	/**
	 * Checks if this is a node or a leaf
	 *
	 * @return true, if it is a node otherwise false if it is a leaf
	 */
	boolean isNode();

	/**
	 * Sets the node flag
	 *
	 * @param node
	 *            the new node flag
	 */
	void setNode(boolean node);

}
