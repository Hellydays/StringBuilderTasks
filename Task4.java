package com.example.elenaskorodilo.tasksaboutstring;

public class Task4 {
    public static void main(String[] args) {

        String text = "FoxyRoxyCoxyDoxyBra";
        String insert = " ";
        int howMuch = (int) Math.ceil(text.length() / 4);

        StringBuilder stringBuilder = new StringBuilder(text);
        StringBuilder stringBuilderResult = new StringBuilder();

        for (int i = 4; i < stringBuilder.length(); i++) {
            stringBuilderResult = stringBuilder.insert(i, insert);
            i = i + 4;
        }

        System.out.println(stringBuilderResult.toString());


    }
}
