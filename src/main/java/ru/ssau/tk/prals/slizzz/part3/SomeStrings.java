package ru.ssau.tk.prals.slizzz.part3;

public class SomeStrings {
    //Task1
    static void eachCharacterSomeStrings(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    //Task2
    static void printBytesSomeStrings(String string) {
        var bytes = string.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }

    //Task3
    static void compareSomeStrings() {
        String string = "Поставьте, пожалуйста, зачет";
        String stringOne = new String(string);
        System.out.println(string == stringOne);
        System.out.println(string.equals(stringOne));
    }
}
