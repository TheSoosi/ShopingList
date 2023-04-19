package com.example.shopinglist.fragments;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shopinglist.Note;
import com.example.shopinglist.R;
import com.example.shopinglist.Storage;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class AddNewFragment extends Fragment {
    private EditText noteText;
    private CheckBox important;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add_new, container, false);
        noteText = v.findViewById(R.id.editText);
        important = v.findViewById(R.id.cbIsImportant);
        Button button = v.findViewById(R.id.buttonAddNote);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Note note = new Note(noteText.getText().toString(), important.isChecked());
                Storage storage = Storage.getInstance();
                storage.add(note);
                noteText.setText("");
                important.setChecked(false);
                Toast.makeText(getContext(),"Note saved",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}