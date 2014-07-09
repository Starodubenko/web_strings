package com.epam.star.util.firstExercise;

import com.epam.star.entity.Sentence;
import com.epam.star.entity.Text;
import com.epam.star.entity.Word;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {
    private Text parsedText;

    public Exercise(Text parsedText) {
        this.parsedText = parsedText;
    }

    public Set<Sentence> doFirstTask (){

        List<String> unicWordList = createUnicWordList();
        int[] repititionWords = createRepetitionsWordList(unicWordList);
        List<Integer> indexMaxRepititionValue = getIndexMaxCountRepitition(repititionWords);
        Set<Sentence> result = createSentenceList(unicWordList, indexMaxRepititionValue);
        return result;
    }

    public List<String> createUnicWordList() {
        List<String> diferentWords = new ArrayList<>();

        for (int i = 0; i < parsedText.getListParagraphs().size(); i++)
            for (int j = 0; j < parsedText.getParagraph(i).getListSentences().size(); j++)
                for (int k = 0; k < parsedText.getParagraph(i).getListSentences().get(j).getListWords().size(); k++) {
                    Word currentWord = parsedText.getParagraph(i).getListSentences().get(j).getListWords().get(k);
                    if (currentWord.getType() != Word.Type.SEPARATOR) {
                        String stringCurrentWord = currentWord.toString();
                        if (!diferentWords.contains(stringCurrentWord) &&
                                               stringCurrentWord != "" &&
                                    currentWord.getType() == Word.Type.WORD)
                            diferentWords.add(stringCurrentWord);
                    }
                }
        return  diferentWords;
    }

    public int[] createRepetitionsWordList(List<String> unicWordList) {
        int[] repititionWords = new int[unicWordList.size()];

        for (int q = 0; q < unicWordList.size(); q++)
            for (int i = 0; i < parsedText.getListParagraphs().size(); i++)
                for (int j = 0; j < parsedText.getParagraph(i).getListSentences().size(); j++)
                    for (int k = 0; k < parsedText.getParagraph(i).getListSentences().get(j).getListWords().size(); k++) {
                        Word currentWord = parsedText.getParagraph(i).getListSentences().get(j).getListWords().get(k);
                        if (currentWord.toString().equals(unicWordList.get(q))) {
                            repititionWords[q] += 1;
                            break;
                        }
                    }
        return repititionWords;
    }

    public List<Integer> getIndexMaxCountRepitition(int[] repititionWords) {
        int max = 0;
        List<Integer> indexMaxCountRepitition = new ArrayList<>();
        for (int i = 0; i < repititionWords.length; i++) {
            if (repititionWords[i] > max){
                max = repititionWords[i];
                indexMaxCountRepitition = new ArrayList<>();
            }
            if (repititionWords[i] == max) {
                indexMaxCountRepitition.add(i);
            }
        }
        return indexMaxCountRepitition;
    }

    private Set<Sentence> createSentenceList(List<String> unicWordList, List<Integer> indexMaxRepititionValue) {
        Set<Sentence> result = new HashSet<>();
        for (int i = 0; i < parsedText.getListParagraphs().size(); i++)
            for (int j = 0; j < parsedText.getParagraph(i).getListSentences().size(); j++)
                for (int k = 0; k < parsedText.getParagraph(i).getListSentences().get(j).getListWords().size(); k++) {
                    Sentence currentSentence = parsedText.getParagraph(i).getListSentences().get(j);
                    Word currentWord = parsedText.getParagraph(i).getListSentences().get(j).getListWords().get(k);
                    for (int p = 0; p < indexMaxRepititionValue.size(); p++)
                        if (currentWord.toString().equals(unicWordList.get(indexMaxRepititionValue.get(p)))) {
                            result.add(currentSentence);
                         break;
                         }
                }
        return result;
    }
}
