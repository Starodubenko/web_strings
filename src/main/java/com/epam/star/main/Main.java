package com.epam.star.main;

import com.epam.star.entity.Text;
import com.epam.star.parser.Parser;

public class Main {

    public static void main(String[] args) {
        String s = "Say you’ve spent the first 10 years of your life sleeping under the stairs of a family who loathes you. Then, in an absurd, magical twist of fate you find yourself surrounded by wizards, a caged snowy owl, a phoenix-feather wand, and jellybeans that come in every flavor, including strawberry, curry, grass, and sardine. Not only that, but you discover that you are a wizard yourself! This is exactly what happens to young Harry Potter in J. K. Rowling’s enchanting, funny debut novel, Harry Potter and the Sorcerer’s Stone. In the nonmagic human world—the world of “Muggles”—Harry is a nobody, treated like dirt by the aunt and uncle who begrudgingly inherited him when his parents were killed by the evil Voldemort. But in the world of wizards, small, skinny Harry is famous as a survivor of the wizard who tried to kill him. He is left only with a lightning-bolt scar on his forehead, curiously refined sensibilities, and a host of mysterious powers to remind him that he’s quite, yes, altogether different from his aunt, uncle, and spoiled, piglike cousin Dudley.\n" +
                "\n" +
                "    A mysterious letter, delivered by the friendly giant Hagrid, wrenches Harry from his dreary, Muggle-ridden existence: “We are pleased to inform you that you have been accepted at Hogwarts School of Witchcraft and Wizardry.” Of course, Uncle Vernon yells most unpleasantly, “I AM NOT PAYING FOR SOME CRACKPOT OLD FOOL TO TEACH HIM MAGIC TRICKS!” Soon enough, however, Harry finds himself at Hogwarts with his owl Hedwig… and that’s where the real adventure—humorous, haunting, and suspenseful—begins. Harry Potter and the Sorcerer’s Stone, first published in England as Harry Potter and the Philosopher’s Stone, continues to win major awards in England. So far it has won the National Book Award, the Smarties Prize, the Children’s Book Award, and is short-listed for the Carnegie Medal, the U. K. version of the Newbery Medal.";

        Parser parser = new Parser();

        Text parsedText = parser.parseText(s);

//        String string[] = parser.parseTextTest(s);
//
//        for (int i = 0; i < parsedText.getSentence(0,0).getListWords().size(); i++) {
//            System.out.println(i+") "+
//                    parsedText.getParagraph(0).getListSentences().get(0).getListWords().get(i).toString() +" " +
//                    parsedText.getParagraph(0).getListSentences().get(0).getListWords().get(i).getType());
//        }
//
//          System.out.println(parsedText.getWord(0,0,5));

//        System.out.println(parsedText.getParagraph(0));
//        System.out.println(parsedText.getParagraph(1));
//        System.out.println(parsedText.getParagraph(2));
//
//        System.out.println(parsedText.getSentence(0,0));
//        System.out.println(parsedText.getSentence(0,1));
//        System.out.println(parsedText.getSentence(0,2));


//        string = parsedText.getParagraph(0).toString();
//        System.out.println(string);
//        string = parsedText.getParagraph(1).toString();
//        System.out.println(string);

//        for (int i = 0; i < parsedText.getListParagraphs().size();i++)
//        {
//            for (int j = 0; j < parsedText.getParagraph(i).getListSentences().size();j++)
//            {
//                for (int k = 0; k < parsedText.getSentence(i,j).getListWords().size();k++)
//                {
//                    System.out.println(parsedText.getWord(i,j,k));
//                }
//            }
//        }
//
//        string = parsedText.getListParagraphs().get(2).getListSentences().toString();
//        System.out.println(string);

//        string = parsedText.getSentence(0, 0).toString();
//        System.out.println(string);
//        string = parsedText.getWord(0, 0, 0).toString();
//        System.out.println(string);
//        string = parsedText.getChar(0, 0, 0, 0).toString();
//        System.out.println(string);
    }
}
