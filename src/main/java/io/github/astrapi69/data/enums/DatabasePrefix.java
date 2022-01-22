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
package io.github.astrapi69.data.enums;

/**
 * The enum {@link DatabasePrefix} holds prefixes for sequences, sequence generators, unique
 * constraints, foreign keys and index names
 */
public enum DatabasePrefix
{
	/** The prefix for the foreign key name */
	FOREIGN_KEY_NAME(DatabasePrefix.FOREIGN_KEY_PREFIX),
	/** The prefix for the index */
	INDEX_NAME(DatabasePrefix.INDEX_PREFIX),
	/** The prefix for the sequence generator name */
	SEQUENCE_GENERATOR_NAME(DatabasePrefix.SEQUENCE_GENERATOR_PREFIX),
	/** The prefix for the sequence name */
	SEQUENCE_NAME(DatabasePrefix.SEQUENCE_PREFIX),
	/** The underscore for concat prefixes with names */
	UNDERLINE(DatabasePrefix.UNDERSCORE),
	/** The prefix for the unique constraint name */
	UNIQUE_CONSTRAINT_NAME(DatabasePrefix.UNIQUE_CONSTRAINT_PREFIX),
	/** The prefix for the postgres unique constraint name */
	UNIQUE_CONSTRAINT_PG_NAME(DatabasePrefix.UNIQUE_CONSTRAINT_PG_PREFIX);

	/**
	 * The constant for the default column name for the primary key
	 **/
	public static final String DEFAULT_COLUMN_NAME_PRIMARY_KEY = "id";

	/**
	 * The constant for the default referenced column name value
	 **/
	public static final String DEFAULT_REFERENCED_COLUMN_NAME_VALUE = DEFAULT_COLUMN_NAME_PRIMARY_KEY;

	/**
	 * The constant for the foreign key prefix
	 **/
	public static final String FOREIGN_KEY_PREFIX = "fk_";

	/**
	 * The constant for the index prefix
	 **/
	public static final String INDEX_PREFIX = "idx_";

	/**
	 * The constant for the sequence generator prefix
	 **/
	public static final String SEQUENCE_GENERATOR_PREFIX = "seq_gen_";

	/**
	 * The constant for the sequence prefix
	 **/
	public static final String SEQUENCE_PREFIX = "seq_";

	/**
	 * The constant for the underscore
	 **/
	public static final String UNDERSCORE = "_";

	/**
	 * The constant for the unique constraint for postgres prefix
	 **/
	public static final String UNIQUE_CONSTRAINT_PG_PREFIX = "uk_";

	/**
	 * The constant for the unique constraint prefix
	 **/
	public static final String UNIQUE_CONSTRAINT_PREFIX = "uc_";

	/** The name */
	private final String name;

	DatabasePrefix(final String name)
	{
		this.name = name;
	}

	/**
	 * Gets the specific name
	 *
	 * @return the specific name
	 */
	public String getName()
	{
		return name;
	}
}
