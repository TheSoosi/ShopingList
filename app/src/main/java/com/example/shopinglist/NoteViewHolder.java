package com.example.shopinglist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    public final TextView note;
    public final TextView important;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        note = itemView.findViewById(R.id.note);
        important = itemView.findViewById(R.id.important);
    }
}
