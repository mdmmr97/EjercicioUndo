package com.kreitek.editor.commands;

import com.kreitek.editor.memento.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;

public class AppendCommand implements Command {
    private final String text;

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(ArrayList<String> documentLines, Caretaker caretaker) {
        caretaker.push(ConsoleEditor.getState());
        documentLines.add(text);
    }
}
