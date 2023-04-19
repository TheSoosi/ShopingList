package com.example.shopinglist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteListAdapter extends RecyclerView.Adapter<NoteViewHolder>{
    private final ArrayList<Note> notes;
    private final Activity context;

    public NoteListAdapter(ArrayList<Note> notes, Activity context) {
        this.notes = notes;
        this.context = context;
    }


    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.note_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.note.setText(note.text);
        holder.important.setText(note.priority ? "!" : "");
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
