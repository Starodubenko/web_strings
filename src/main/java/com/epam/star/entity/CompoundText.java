package com.epam.star.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class CompoundText<T> {

    protected List<T> components = new ArrayList<>();

    protected CompoundText(List<T> components) {
        this.components = components;
    }
}
