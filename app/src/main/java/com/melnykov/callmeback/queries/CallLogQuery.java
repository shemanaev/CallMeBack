package com.melnykov.callmeback.queries;

import android.net.Uri;
import android.provider.CallLog.Calls;

/**
 * The query for the call log table.
 */
public class CallLogQuery {

    public static final Uri CONTENT_URI = Calls.CONTENT_URI;
    public static final String SELECTION = Calls.NUMBER + " IS NOT NULL AND " + Calls.NUMBER + " != '' ";
    public static final String SORT_ORDER = Calls.DEFAULT_SORT_ORDER;

    public static final String[] PROJECTION = new String[]{
        Calls.NUMBER,
        Calls.CACHED_NAME
    };

    public static final int NUMBER = 0;
    public static final int CACHED_NAME = 1;
}