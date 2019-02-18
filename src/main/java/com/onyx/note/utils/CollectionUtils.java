package com.onyx.note.utils;

import java.util.Collection;

/**
 * Created by User on 2019/2/15.
 */
public class CollectionUtils {
    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotNullOrEmpty(Collection collection) {
        return collection != null && !collection.isEmpty();
    }
}
