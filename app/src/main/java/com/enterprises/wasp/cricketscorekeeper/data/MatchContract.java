package com.enterprises.wasp.cricketscorekeeper.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class MatchContract {

    public static final String CONTENT_AUTHORITY = "com.enterprises.wasp.cricketscorekeeper";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_MATCH = "match";

    public static final String CONTENT_MATCH_TYPE =
            ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MATCH;

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private MatchContract() {
    }

    /**
     * Inner class that defines constant values for the matches database table.
     * Each entry in the table represents a single match
     */
    public static final class MatchEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_MATCH);

        /**
         * Name for the database table for matches
         */
        public static final String TABLE_NAME = "match";

        /**
         * Unique ID number for said match ( only for use in the database table )
         * Type: TEXT
         */
        public static final String _ID = BaseColumns._ID;
    }
}

