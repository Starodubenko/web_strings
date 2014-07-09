package com.epam.star.entity;

import java.util.List;

public class Text extends CompoundText<Paragraph> {

    public Text(List<Paragraph> components) {
        super(components);
    }

    public List<Paragraph> getListParagraphs (){ return components;}

    public Paragraph getParagraph(int numberParagraph) {
        return components.get(numberParagraph);
    }

    public Sentence getSentence(int numberParagraph, int numberSentence) {
        return components.get(numberParagraph)
              .getListSentences().get(numberSentence);
    }

    public Word getWord(int numberParagraph,  int numberSentence,  int numberWord) {
        numberWord = correctNumberWord(numberParagraph,numberSentence,numberWord);
        return components.get(numberParagraph)
                .getListSentences().get(numberSentence)
                .getListWords().get(numberWord);
    }

    public Char getChar(int numberParagraph,  int numberSentence,  int numberWord,  int numberChar) {
        numberWord = correctNumberWord(numberParagraph,numberSentence,numberWord);
        return components.get(numberParagraph)
                .getListSentences().get(numberSentence)
                .getListWords().get(numberWord)
                .getListChars().get(numberChar);
    }

    private int correctNumberWord (int numberParagraph,  int numberSentence,  int numberWord){
        int currentIndex = 0;
        int wordsCount = components.get(numberParagraph).getListSentences().get(numberSentence).getListWords().size();
        for (int i = 0; i < wordsCount; i++) {
            if (components.get(numberParagraph).getListSentences().get(numberSentence).getListWords().get(i).getType() == Word.Type.WORD)
                currentIndex += 1;
            if (currentIndex == numberWord+1){
                numberWord += currentIndex-1;
                break;
            }
        }
        return numberWord;
    }

    @Override
    public String toString() {
        String result = "";
        for (Paragraph paragraph : components) {
            result += paragraph.toString();
        }
        return result;
    }
}
