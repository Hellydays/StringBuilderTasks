package com.example.elenaskorodilo.tasksaboutstring;

public class Task7CLogic {

    public StringBuilder fromNumberToEncryption(char number, StringBuilder encryptionBuilder) {

        switch (number) {
            case '2': encryptionBuilder.append("TWO ");
                break;
            case '3': encryptionBuilder.append("THREE ");
                break;
            case '4': encryptionBuilder.append("FOUR ");
                break;
            case '5': encryptionBuilder.append("FIVE ");
                break;
            case '6': encryptionBuilder.append("SIX ");
                break;
            case '7': encryptionBuilder.append("SEVENFOLD ");
                break;
            case '8': encryptionBuilder.append("EIGHT ");
                break;
        }

        return encryptionBuilder;

    }

    public char fromEncryptionToNumber(String string) {
        char c = 0;
        switch (string) {
            case "TWO": c = '2';
                break;
            case "THREE": c = '3';
                break;
            case "FOUR": c = '4';
                break;
            case "FIVE": c = '5';
                break;
            case "SIX": c = '6';
                break;
            case "SEVENFOLD": c = '7';
                break;
            case "EIGHT": c = '8';
                break;
        }

        return c;
    }

}
