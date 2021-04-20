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
package io.github.astrapi69.entity.validatable;

/**
 * The interface {@link Validatable}.
 *
 * @param <T>
 *            the generic type of time measurement
 */
public interface Validatable<T>
{

	/** The Constant for the column name 'validFrom'. */
	String COLUMN_NAME_VALID_FROM = "validFrom";

	/** The Constant for the column name 'validTill'. */
	String COLUMN_NAME_VALID_TILL = "validTill";

	/**
	 * Gets the valid from.
	 *
	 * @return the valid from
	 */
	T getValidFrom();

	/**
	 * Gets the valid till.
	 *
	 * @return the valid till
	 */
	T getValidTill();

	/**
	 * Sets the valid from.
	 *
	 * @param validFrom
	 *            the new valid from
	 */
	void setValidFrom(T validFrom);

	/**
	 * Sets the valid till.
	 *
	 * @param validTill
	 *            the new valid till
	 */
	void setValidTill(T validTill);
}
