package com.kreitek.editor;

import com.kreitek.editor.memento.Caretaker;

import java.util.ArrayList;

public interface Command {
    void execute(ArrayList<String> documentLines, Caretaker caretaker);
}
