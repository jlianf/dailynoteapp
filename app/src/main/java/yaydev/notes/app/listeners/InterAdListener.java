package yaydev.notes.app.listeners;

import yaydev.notes.app.entities.Note;

public interface InterAdListener {
    void onClick(int position, Note note, String type);
}
