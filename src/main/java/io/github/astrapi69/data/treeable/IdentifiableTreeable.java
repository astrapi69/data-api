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
package io.github.astrapi69.data.treeable;

import java.io.Serializable;

import io.github.astrapi69.data.identifiable.Identifiable;

/**
 * The interface {@link IdentifiableTreeable} is a combination of the interfaces
 * {@link Identifiable} and {@link Treeable}
 *
 * @param <PK>
 *            the generic type of the technical primary key
 * @param <T>
 *            the generic type of the value from this tree data
 * @param <TR>
 *            the generic type of the concrete data that will implement this interface
 */
public interface IdentifiableTreeable<PK extends Serializable, T, TR extends IdentifiableTreeable<PK, T, TR>>
	extends
		Identifiable<PK>,
		Treeable<T, TR>
{
}
