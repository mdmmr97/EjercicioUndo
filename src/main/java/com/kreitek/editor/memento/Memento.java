package com.kreitek.editor.memento;

import java.util.Map;
import java.util.Objects;

public class Memento {
    private Map<String, Object> state;
    public Memento (Map<String, Object> state) {
        this.state=state;
    }
    public Map<String, Object> getState() {return state;}
}
