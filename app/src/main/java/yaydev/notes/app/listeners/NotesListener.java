package yaydev.notes.app.listeners;

import yaydev.notes.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
