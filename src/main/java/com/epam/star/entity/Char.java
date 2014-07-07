package com.epam.star.entity;

import java.util.ArrayList;
import java.util.List;

public class Char {

    private String aChar;

    public Char(String aChar) {
        this.aChar = aChar;
    }

    @Override
    public String toString() {
        return aChar;
    }
}
