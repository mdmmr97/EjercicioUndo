package com.kreitek.editor.commands;

import com.kreitek.editor.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;

public class UndoCommand implements Command {

    public UndoCommand (){}

    public void execute(ArrayList<String> documentLines, Caretaker caretaker) {
        Memento memento = caretaker.pop();
        if (memento != null){
            documentLines.clear();
            documentLines.addAll((ArrayList<String>) memento.getState().get("documentLines"));
        }
    }
}
