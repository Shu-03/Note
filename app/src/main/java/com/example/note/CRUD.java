package com.example.note;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CRUD {
    SQLiteOpenHelper dbHandler;
    SQLiteDatabase db;
    private static final String[] columns = {
            NoteDatabase.ID,
            NoteDatabase.CONTENT,
            NoteDatabase.TIME,
            NoteDatabase.MODE
    };

}
