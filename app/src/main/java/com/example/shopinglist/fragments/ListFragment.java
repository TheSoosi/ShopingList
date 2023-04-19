package com.example.shopinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopinglist.NoteListAdapter;
import com.example.shopinglist.R;
import com.example.shopinglist.Storage;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Storage storage = Storage.getInstance();

        View v = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView rv = v.findViewById(R.id.noteList);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new NoteListAdapter(storage.getNotes(), getActivity()));
        return v;
    }
}