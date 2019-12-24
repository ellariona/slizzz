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

    //Task4
    static boolean palindromeSomeStrings(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //Task5
    static boolean isEqualsCaseSomeArray(String stringOne, String stringTwo) {
        return stringOne != null && stringTwo != null && !(stringOne.equals(stringTwo)) && stringOne.equalsIgnoreCase(stringTwo);
    }

    //Task7
    static int firstContainIndexInSomeStrings(String stringOne, String stringTwo) {
        if (stringOne.contains(stringTwo)) {
            return stringOne.indexOf(stringTwo);
        } else if (stringTwo.contains(stringOne)) {
            return stringTwo.indexOf(stringOne);
        } else {
            return -1;
        }
    }

    //Task8
    static int containIndexInSomeArray(String stringOne, String stringTwo) {
        if (stringOne.contains(stringTwo)) {
            return stringOne.indexOf(stringTwo, stringOne.length() / 2);
        } else if (stringOne.contains(stringOne)) {
            return stringTwo.indexOf(stringOne, stringTwo.length() / 2);
        } else {
            return -1;
        }
    }
}
