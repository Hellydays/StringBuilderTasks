package com.example.elenaskorodilo.tasksaboutstring;

public class Task5 {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer(
                "Не жалела мама мыла. Мама Милу мылом мыла. Мила мыла не любила, мыло Мила уронила.");
        String Word = " INSERTEDWORD ";

        String ending = "ла";
        int endingLength = ending.length();

        System.out.println(text);

        int i = 0, k = 0;

        while ((k = text.indexOf(ending, i)) != -1) {
            k = k + endingLength;
            text.insert(k, Word);
            i = k;
        }

        System.out.println(text);
    }

}
