package com.example.elenaskorodilo.tasksaboutstring;

import java.util.Arrays;

public class Task7C {
    public static void main(String[] args) {


        String a = "1177"; // ['2','3']

        char[] digits = new char[a.length()];
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder encryptionBuilder = new StringBuilder();

        char number = 0;

        Task7CLogic task7CLogic = new Task7CLogic();


        for (int i = 0; i < a.length(); i++) {
            digits[i] = a.charAt(i);
            number = digits[i];

            encryptionBuilder = task7CLogic.fromNumberToEncryption(number, emptyBuilder);

        }

        String[] compare = encryptionBuilder.toString().split(" ");

        System.out.println(Arrays.toString(compare));
        StringBuilder maxElementBuilder = new StringBuilder();

        int maxLength = 0;
        int index = 0;

        for (int i = 0; i < compare.length; i++) {

            if (compare[i].length() > maxLength) {
                maxLength = compare[i].length();
                index = i;
            }
        }

        char resultNumber = task7CLogic.fromEncryptionToNumber(compare[index]);

        System.out.println(resultNumber);

    }


}
