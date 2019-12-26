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

    //Task9
    static int lastContainIndexInFirstHalfInSomeStrings(String stringOne, String stringTwo) {
        if (stringOne.contains(stringTwo)) {
            return stringOne.lastIndexOf(stringTwo, stringOne.length() / 2);
        } else if (stringTwo.contains(stringOne)) {
            return stringTwo.lastIndexOf(stringOne, stringTwo.length() / 2);
        } else {
            return -1;
        }
    }

    //Task10
    static int stringsStartsEndsWithInSomeStrings(String[] strings, String prefix, String suffix) {
        int k = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) && string.endsWith(suffix)) {
                k++;
            }
        }
        return k;
    }

    //Task11
    static int stringsStartsEndsInSomeStrings(String[] strings, String prefix, String suffix) {
        int k = 0;
        for (String string : strings) {
            if (string.trim().startsWith(prefix) && string.trim().endsWith(suffix)) ;
            k++;
        }
        return k;
    }

    //Task12
    static String replaceSomeArray(String oneString, String twoString, String threeString) {
        for (int i = 0; i < 100; i++) {
            if (oneString.contains(twoString)) {
                oneString = oneString.replaceAll(twoString, threeString);
            } else {
                break;
            }
        }
        return oneString;
    }

    //Task13
    static String fromToInSomeString(String string, int from, int to) {
        if (to <= from) {
            return "";
        } else if (from < 0) {
            from = 0;
        }
        if (to > string.length()) {
            to = string.length();
        }
        return string.substring(from, to);
    }

    //Task18
    static void printsObjectInSomeStrings(Object object) {
        System.out.println("Описание объекта: " + object);
    }

    //Task19
    static String[] getSingleInSomeStrings(String source) {
        String[] words = source.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                if (Character.isLetter(words[i].charAt(0))) {
                    words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                }
            }
        }
        return words;
    }

    //Task20
    static String buildStringInSomeArray(String[] subStrings) {
        return String.join(", ", subStrings);
    }

    //Task21
    static String buildStringCharToIndexInSomeArray(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                builder.replace(i, i + 1, Integer.toString(i));
            }
        }
        return builder.toString();
    }
}
