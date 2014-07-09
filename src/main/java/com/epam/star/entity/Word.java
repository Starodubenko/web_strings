package com.epam.star.entity;


import java.util.List;

public class Word extends CompoundText<Char> {

    private Type type;

    public Word(List<Char> components) {
        super(components);
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
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

    public enum Type {
        WORD, SEPARATOR
    }
}
