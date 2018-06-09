package com.example.elenaskorodilo.tasksaboutstring;

public class Task9 {
    public static void main(String[] args) {

        String text = "Bear Car Bear Cat Car Dog Bear";
        String[] arrayResults = text.split(" ");

        StringBuilder stringBuilderUnique = new StringBuilder();

        for (int i = 0; i < arrayResults.length; i++) {
           if (!in(arrayResults[i], stringBuilderUnique)) {
               stringBuilderUnique.append(arrayResults[i] + " ");
           }
        }

        String[] arrayUnique = stringBuilderUnique.toString().split(" ");

        for (int i = 0; i < arrayUnique.length; i++) {
            String s = arrayUnique[i];
            int counter = 0;

            for (int j = 0; j < arrayResults.length; j++) {
                if (arrayResults[j].equals(s)) {
                    counter++;
                }
            }

            System.out.println(s + " : " + counter);

        }

    }



    public static boolean in (String word, StringBuilder builder) {

        String s = builder.toString();
        String[] arrayResult = s.split(" ");

        for (int i = 0; i < arrayResult.length; i++) {
            if (arrayResult[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}
