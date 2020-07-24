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
package de.alpharogroup.db.entity.traceable;

import de.alpharogroup.db.entity.Identifiable;
import de.alpharogroup.db.entity.creatable.ByCreatable;
import de.alpharogroup.db.entity.deletable.ByDeletable;
import de.alpharogroup.db.entity.deletable.Deletable;
import de.alpharogroup.db.entity.modifiable.ByLastModified;
import de.alpharogroup.db.entity.modifiable.LastModified;
import de.alpharogroup.db.entity.versionable.Versionable;

import java.io.Serializable;

/**
 * The interface {@link IdentifiableTraceableVersionable} is a combination of the interfaces
 * {@link Identifiable},{@link ByCreatable}, {@link ByLastModified}, {@link ByDeletable} and
 * {@link Versionable}.
 *
 * @param <T>
 *            the generic type of time measurement
 * @param <U>
 *            the generic type of the user or account
 */
public interface IdentifiableTraceableVersionable<PK extends Serializable, T, U>
	extends
		Identifiable<PK>,
		ByCreatable<T, U>,
		ByLastModified<T, U>,
		ByDeletable<T, U>,
		Versionable
{
}
