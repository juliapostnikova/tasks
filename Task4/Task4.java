package Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String sentence = console.nextLine();

        int vowelCount = 0;

        String[] arrayWords = sentence.split(" ");

        class Words {
            String word;
            int count = 0;
        }

        class SortWords implements Comparator<Words> {
            public int compare(Words a, Words b) {
                return a.count - b.count;
            }
        }

        Words listWordsAndCount[];
        listWordsAndCount = new Words[arrayWords.length];

        for (int i = 0; i < listWordsAndCount.length; i++) {
            listWordsAndCount[i] = new Words();
        }


        for (int i = 0; i < arrayWords.length; i++) {
            Pattern pattern = Pattern.compile("(?i)[аеиоуыэюяАЕИОУЫЭЮЯ]");
            Matcher matcher = pattern.matcher(arrayWords[i]);
            int index = 0;
            Boolean matchChar = false;
            if (matcher.find()) {
                matchChar = true;
                index = matcher.start();
            }
            int countVowels = arrayWords[i].length() - arrayWords[i].replaceAll("(?i)[аеиоуыэюяАЕИОУЫЭЮЯ]", "").length();
            String word = !matchChar ? arrayWords[i].toLowerCase(Locale.ROOT) : arrayWords[i].substring(0, index).toLowerCase(Locale.ROOT) + arrayWords[i].substring(index, index + 1).toUpperCase(Locale.ROOT) + arrayWords[i].substring(index + 1).toLowerCase(Locale.ROOT);
            listWordsAndCount[i].word = word;
            listWordsAndCount[i].count = countVowels;
            vowelCount += countVowels;
        }



        Arrays.sort(listWordsAndCount, new SortWords());
        System.out.println("Количество гласных");
        System.out.println(vowelCount);

        for (int i = listWordsAndCount.length - 1; i >= 0; i--) {
            System.out.println(listWordsAndCount[i].word);
        }

    }


}
