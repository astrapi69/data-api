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
package de.alpharogroup.db.entity.pair;

import java.io.Serializable;

import de.alpharogroup.db.entity.Identifiable;

/**
 * The interface {@link IdentifiableKeyValueOwner} is a combination of the
 * interfaces {@link Identifiable} and {@link KeyValueOwner}.
 *
 * @param <PK> the generic type of the identifier
 * @param <O> the generic type of the owner
 * @param <K> the generic type of the key
 * @param <V> the generic type of the value
 */
public interface IdentifiableKeyValueOwner<PK extends Serializable, O, K, V>
		extends Identifiable<PK>, KeyValueOwner<O, K, V> {
}
