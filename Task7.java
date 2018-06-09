package com.example.elenaskorodilo.tasksaboutstring;

public class Task7 {
    public static void main(String[] args) {

        String input = "bla.bLa. bla.";
        StringBuilder stringBuilderResult = new StringBuilder();
        char[] allowed = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'L', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                            'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};


        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (in(letter, allowed)) {
                stringBuilderResult.append(letter);
            }

            else stringBuilderResult.append(' ');
        }

        System.out.println(stringBuilderResult.toString());

    }

    public static boolean in (char letter, char[] allowedLetters) {
        for (int i = 0; i < allowedLetters.length; i++) {
            if (allowedLetters[i] == letter) {
                return true;
            }
        }
        return false;
    }

}
