package com.epam.star.parser;

import com.epam.star.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Text parseText(String originalString) {

        String[] arrayParagraphs = originalString.split("\n");
        List<Paragraph> paragraphs = new ArrayList<>();

        for (String Paragraph : arrayParagraphs) {

            List<Char> chars = parseToChars(Paragraph);
            List<Word> words = parseToWords(chars);
            List<Sentence> sentences = parseToSenteces(words);

            paragraphs.add(new Paragraph(sentences));
        }
        Text parsedText = new Text(paragraphs);
        return parsedText;
    }

    private List<Char> parseToChars(String originalString) {
        List<Char> resultList = new ArrayList<>();
        String[] result = originalString.split("");
        for (String s : result) {
            resultList.add(new Char(s));
        }
        return resultList;
    }

    private List<Word> parseToWords(List<Char> chars) {
        List<Word> resultList = new ArrayList<>();
        List<Char> newWord = new ArrayList<>();
        Pattern pattern = Pattern.compile("[\\s\\p{Punct}]?");
        Matcher matcher;
        for (Char achar : chars) {
            if (!pattern.matcher(achar.toString()).matches())
                newWord.add(achar);
            else {
                Word word = new Word(newWord);
                word.setType(Word.Type.WORD);
                resultList.add(word);

                newWord = new ArrayList<>();
                newWord.add(achar);

                word = new Word(newWord);
                word.setType(Word.Type.SEPARATOR);
                resultList.add(word);

                newWord = new ArrayList<>();
            }
        }
        return resultList;
    }

    private List<Sentence> parseToSenteces(List<Word> words) {
        List<Sentence> resultList = new ArrayList<>();
        List<Word> newSentence = new ArrayList<>();
        Pattern pattern = Pattern.compile("[.!?]");
        for (Word word : words) {
            newSentence.add(word);
            if (pattern.matcher(word.toString()).matches()) {
                resultList.add(new Sentence(newSentence));
                newSentence = new ArrayList<>();
            }
        }
        return resultList;
    }
}
