package com.epam.star.parser;

import com.epam.star.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Text parseText(String originalString){
        List<Char> chars = parseToChars(originalString);
        List<Word> words = parseToWords(chars);
        List<Sentence> sentences = parseToSenteces(words);
        List<Paragraph> paragraphs = parseToParagraphs(sentences);

        Text parsedText = new Text(paragraphs);
        return parsedText;
    }

    private List<Char> parseToChars(String originalString){
        List<Char> resultList = new ArrayList<>();
        String[] result = originalString.split("");
        for (String s : result) {
            resultList.add(new Char(s));
        }
        resultList.add(new Char("\n"));
        return resultList;
    }

    private List<Word> parseToWords(List<Char> chars) {
        List<Word> resultList = new ArrayList<>();
        List<Char> newWord = new ArrayList<>();
        Pattern pattern = Pattern.compile("([' '-.,!?||[\n]]){0,}");
        Matcher matcher;
        for (Char achar : chars) {
            if (!pattern.matcher(achar.toString()).matches()) {
                newWord.add(achar);
            }
            else{
                resultList.add(new Word(newWord));
                newWord = new ArrayList<>();
                if (achar.toString().toCharArray()[0] == '\n') newWord.add(new Char("†"));
                else
                newWord.add(achar);
                resultList.add(new Word(newWord));
                newWord = new ArrayList<>();
            }
        }
        return resultList;
    }

    private List<Sentence> parseToSenteces(List<Word> words) {
        List<Sentence> resultList = new ArrayList<>();
        List<Word> newSentence = new ArrayList<>();
        Pattern pattern = Pattern.compile("[.!?†]");
        Matcher matcher;
        boolean check = false;
        for (Word word : words) {
            if (!pattern.matcher(word.toString()).matches()) {
                newSentence.add(word);
            }
            else{
                   newSentence.add(word);
                    resultList.add(new Sentence(newSentence));
                    newSentence = new ArrayList<>();
            }
       //     check = false;
       //     if (word.getStringWord().length() < 2) check = true;
        }
        return resultList;
    }

    private List<Paragraph> parseToParagraphs(List<Sentence> sentences) {
        List<Paragraph> resultList = new ArrayList<>();
        List<Sentence> newParagraph = new ArrayList<>();
        Pattern pattern = Pattern.compile("[†]");
        Matcher matcher;
        for (Sentence sentence : sentences) {
            if (!pattern.matcher(sentence.toString()).matches()) {
                newParagraph.add(sentence);
      //          System.out.println(sentence);
            }
            else{
                resultList.add(new Paragraph(newParagraph));
//                newParagraph = new ArrayList<>();
//                newParagraph.add(sentence);
//                resultList.add(new Paragraph(newParagraph));
                newParagraph = new ArrayList<>();
            }
        }
        return resultList;
    }
}
