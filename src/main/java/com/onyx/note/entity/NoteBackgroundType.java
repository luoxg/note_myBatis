package com.onyx.note.entity;


/**
 * Created by solskjaer49 on 16/7/1 16:58.
 */

public class NoteBackgroundType {

    public static final int EMPTY = 0;
    public static final int GRID = 1;
    public static final int LINE = 2;
    public static final int MATS = 3;
    public static final int MUSIC = 4;
    public static final int ENGLISH = 5;
    public static final int TABLE = 6;
    public static final int COLUMN = 7;
    public static final int LEFT_GRID = 8;
    public static final int GRID_POINT = 9;
    public static final int GRID_5_5 = 10;
    public static final int LINE_1_6 = 11;
    public static final int LINE_2_0 = 12;
    public static final int CALENDAR = 13;

    public static final int IMAGE_FILE = 26;
    public static final int PDF_FILE = 27;

    public static final int NEW_GRID = 1001;
    public static final int NEW_LINE = 1002;
    public static final int NEW_MATS = 1003;
    public static final int NEW_MUSIC = 1004;
    public static final int NEW_ENGLISH = 1005;
    public static final int NEW_TABLE = 1006;
    public static final int NEW_COLUMN = 1007;
    public static final int NEW_LEFT_GRID = 1008;
    public static final int NEW_GRID_POINT = 1009;
    public static final int NEW_GRID_5_5 = 1010;
    public static final int NEW_LINE_1_6 = 1011;
    public static final int NEW_LINE_2_0 = 1012;
    public static final int NEW_CALENDAR = 1013;

    public static final int MC_KINSEY = 1014;
    public static final int CORNELL = 1015;

    public static final int JD_LINE_POINT = 2000;
    public static final int JD_GRID_POINT = 2001;
    public static final int JD_LINE = 2002;
    public static final int JD_SMALL_GRID = 2003;
    public static final int JD_BIG_GRID = 2004;
    public static final int JD_MEETING_MINUTES = 2005;
    public static final int JD_MEETING_CONTENT = 2006;
    public static final int JD_TODO_LIST = 2007;
    public static final int JD_TODO_LIST_PAGE = 2008;
    public static final int JD_WEEK_PLAN = 2009;



    public static int defaultBackground() {
        return EMPTY;
    }

    public static boolean isOldBKGround(int type) {
        return type > EMPTY && type <= CALENDAR;
    }

    public static boolean isFileType(int type) {
        return type == IMAGE_FILE || type == PDF_FILE;
    }
}
