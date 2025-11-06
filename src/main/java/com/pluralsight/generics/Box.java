package com.pluralsight.generics;

import java.util.List;

public class Box<T> {
    private List<T> value;

    public List<T> get() {
        return value;
    }

    public Box(List<T> value) {
        this.value = value;
    }
}
