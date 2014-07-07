package com.epam.star.entity;

import java.util.List;

public class Text extends CompoundText<Paragraph> {

    public Text(List<Paragraph> components) {
        super(components);
    }

    public Paragraph getParagraph(int numberParagraph) {
        return components.get(numberParagraph);
    }

    public Sentence getSentence(int numberParagraph, int numberSentence) {
        return components.get(numberParagraph)
              .getListSentences().get(numberSentence);
    }

    public Word getWord(int numberParagraph,  int numberSentence,  int numberWord) {
        return components.get(numberParagraph)
                .getListSentences().get(numberSentence)
                .getListWords().get(numberWord);
    }

    public Char getChar(int numberParagraph,  int numberSentence,  int numberWord,  int numberChar) {
        return components.get(numberParagraph)
                .getListSentences().get(numberSentence)
                .getListWords().get(numberWord)
                .getListChars().get(numberChar);
    }

//    @Override
//    public String toString() {
//        String result = "";
//        for (Paragraph paragraph : components) {
//            result += paragraph.getParagraph();
//        }
//        return result;
//    }
}
