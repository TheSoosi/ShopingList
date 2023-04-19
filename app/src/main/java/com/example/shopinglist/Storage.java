package com.example.shopinglist;

import java.util.ArrayList;

public class Storage {
    private static Storage instance = null;
    private ArrayList<Note> list;
    private Storage() {
        list = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void add(Note note) {
        list.add(note);
    }

    public ArrayList<Note> getNotes() {
        return list;
    }
}


