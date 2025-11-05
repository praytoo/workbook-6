package com.pluralsight;

import java.util.List;

public class Holder<T> {
    private List<T> value;

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }

    public Holder(List<T> value) {
        this.value = value;
    }
}
