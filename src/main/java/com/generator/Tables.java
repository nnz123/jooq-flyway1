/*
 * This file is generated by jOOQ.
*/
package com.generator;


import com.generator.tables.Author;
import com.generator.tables.Book;
import com.generator.tables.SchemaVersion;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jooq_flyway
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jooq_flyway.author</code>.
     */
    public static final Author AUTHOR = com.generator.tables.Author.AUTHOR;

    /**
     * The table <code>jooq_flyway.book</code>.
     */
    public static final Book BOOK = com.generator.tables.Book.BOOK;

    /**
     * The table <code>jooq_flyway.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.generator.tables.SchemaVersion.SCHEMA_VERSION;
}
