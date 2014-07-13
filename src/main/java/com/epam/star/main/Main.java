package com.epam.star.main;

import com.epam.star.exercise.First;
import com.epam.star.entity.Text;
import com.epam.star.parser.Parser;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Say you’ve spent the first 10 years of your life sleeping under the stairs of a family who loathes you. Then, in an absurd, magical twist of fate you find yourself surrounded by wizards, a caged snowy owl, a phoenix-feather wand, and jellybeans that come in every flavor, including strawberry, curry, grass, and sardine. Not only that, but you discover that you are a wizard yourself! This is exactly what happens to young Harry Potter in J. K. Rowling’s enchanting, funny debut novel, Harry Potter and the Sorcerer’s Stone. In the nonmagic human world—the world of “Muggles”—Harry is a nobody, treated like dirt by the aunt and uncle who begrudgingly inherited him when his parents were killed by the evil Voldemort. But in the world of wizards, small, skinny Harry is famous as a survivor of the wizard who tried to kill him. He is left only with a lightning-bolt scar on his forehead, curiously refined sensibilities, and a host of mysterious powers to remind him that he’s quite, yes, altogether different from his aunt, uncle, and spoiled, piglike cousin Dudley.\n" +
                "\n" +
                "    A mysterious letter, delivered by the friendly giant Hagrid, wrenches Harry from his dreary, Muggle-ridden existence: “We are pleased to inform you that you have been accepted at Hogwarts School of Witchcraft and Wizardry.” Of course, Uncle Vernon yells most unpleasantly, “I AM NOT PAYING FOR SOME CRACKPOT OLD FOOL TO TEACH HIM MAGIC TRICKS!” Soon enough, however, Harry finds himself at Hogwarts with his owl Hedwig… and that’s where the real adventure—humorous, haunting, and suspenseful—begins. Harry Potter and the Sorcerer’s Stone, first published in England as Harry Potter and the Philosopher’s Stone, continues to win major awards in England. So far it has won the National Book Award, the Smarties Prize, the Children’s Book Award, and is short-listed for the Carnegie Medal, the U. K. version of the Newbery Medal.";

        Parser parser = new Parser();

    Text parsedText = parser.parseText(s);

    First ft = new First(parsedText);

    System.out.println(ft.createUnicWordList());

    System.out.println(Arrays.toString(ft.createRepetitionsWordList(ft.createUnicWordList())));

    System.out.println(ft.getIndexMaxCountRepitition(ft.createRepetitionsWordList(ft.createUnicWordList())));

    System.out.println(ft.doFirstTask().toString());
    }
}
