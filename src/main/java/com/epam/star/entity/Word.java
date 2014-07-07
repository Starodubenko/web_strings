package com.epam.star.entity;


import java.util.List;

public class Word extends CompoundText<Char> {

    public Word(List<Char> components) {
        super(components);
    }

    public List<Char> getListChars() {
        return components;
    }

    @Override
    public String toString() {
        String result = "";
        for (Char aChar : components) {
            result += aChar.toString();
        }
        return result;
    }
}
