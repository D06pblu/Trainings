package jat_tasks;

import java.util.Arrays;

/*
Find the sentence containing the largest number of words in some given text.
The text is specified as a string S consisting of N characters: letters, spaces, dots, question marks and exclamation marks.
The text can be divided into sentences by splitting it at dots, question marks and exclamation marks.
A sentence can be divided into words by splitting it at spaces. A sentence without words is valid,
but a valid word must contain at least one letter.
For example, given S = “We are the best test coders. Give us a try? !“, there are three sentences:
“We are the best test coders“, “ Give us a try” and “ “.
The first sentence contains six words: “We“,“are”, “the”, “best”, “test” and “coders“.
The second sentence contains four words: “Give“, “us“, “a” and “try“.
The third sentence is space.
Write a function that returns the maximum number of words in a sentence.
For example, given S = “We are the best test coders. Give us a try? !“, the function should return 6, as explained above.
Implement 2 solutions with array and split.
 */
public class IXLargestSentence {
    public static void main(String[] args) {
        String text = "Some sentence. We are the best test coders and so on. Give us a try? ! Some.";

        wordCounterThroughChars(text);
        wordCounterThroughSplit(text);
    }

    public static int wordCounterThroughChars(String text) {
        int maxWordsNumber = 0;
        int currentWordsNumber = 0;
        int wordLength = 0;

        char[] textCharSequence = text.toCharArray();

        for (char c : textCharSequence) {
            if (c == '!' || c == '?' || c == '.') {
                if (wordLength != 0) {
                    currentWordsNumber++;
                }
                if (currentWordsNumber > maxWordsNumber) {
                    maxWordsNumber = currentWordsNumber;
                }
                currentWordsNumber = 0;
                wordLength = 0;
            } else if (c == ' ') {
                if (wordLength != 0){
                    currentWordsNumber++;
                }
                wordLength = 0;
            }
            else {
                wordLength++;
            }
        }
        System.out.println("При подсчете с помощью Char результат - " + maxWordsNumber + " слов.");
        return maxWordsNumber;
    }

    public static int wordCounterThroughSplit(String text) {
        String[] sentences = text.split("[.?!]");
        int maxWordsNumber = 0;

        for (String s : sentences) {
            if (wordsCount(s) > maxWordsNumber)
                maxWordsNumber = wordsCount(s);
        }
        System.out.println("При подсчете с помощью StringSplit результат - " + maxWordsNumber + " слов.");
        return maxWordsNumber;
    }
    public static int wordsCount (String sentence) {
        String[] words = sentence.split(" ");
//        int notEmptyWordsCount = 0;
//        for (String word : words){
//            if (!"".equals(word)){
//                notEmptyWordsCount++;
//            }
//        }
        return (int) Arrays.stream(words).filter(word -> !"".equals(word)).count();
    }
}

