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
package de.alpharogroup.db.entity.enums;

/**
 * The enum {@link DatabasePrefix} holds some useful prefixes for sequences, sequence generators,
 * unique constraints, foreign keys and indexes names
 */
public enum DatabasePrefix
{
	/** The prefix for the foreign key name */
	FOREIGN_KEY_NAME("fk_"),
	/** The prefix for the index */
	INDEX_NAME("idx_"),
	/** The prefix for the sequence generator name */
	SEQUENCE_GENERATOR_NAME("seq_gen_"),
	/** The prefix for the sequence name */
	SEQUENCE_NAME("seq_"),
	/** The underscore for concat prefixes with names */
	UNDERSCORE("_"),
	/** The prefix for the unique constraint name */
	UNIQUE_CONSTRAINT_NAME("uc_");

	/** The prefix. */
	private final String prefix;

	private DatabasePrefix(final String prefix){
		this.prefix = prefix;
	}

	/**
	 * Gets the specific prefix
	 *
	 * @return the specific prefix
	 */
	public String getPrefix()
	{
		return prefix;
	}
}
