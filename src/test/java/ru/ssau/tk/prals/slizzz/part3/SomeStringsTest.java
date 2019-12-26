package ru.ssau.tk.prals.slizzz.part3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeStringsTest {
    private String string = "когда каникулы :(";


    //Task1
    @Test
    public void testEachCharacterSomeStrings() {
        SomeStrings.eachCharacterSomeStrings(string);
    }

    //Task2
    @Test
    public void testPrintBytesSomeStrings() {
        SomeStrings.printBytesSomeStrings(string);
        System.out.println();
    }

    //Task3
    @Test
    public void testCompareSomeStrings() {
        SomeStrings.compareSomeStrings();
    }

    //Task4
    @Test
    public void testPalindromeSomeStrings() {
        assertTrue(SomeStrings.palindromeSomeStrings("bzzb"));
        assertFalse(SomeStrings.palindromeSomeStrings("Liza"));
    }

    //Task5
    @Test
    public void testIsEqualsCaseSomeArray() {
        assertTrue(SomeStrings.isEqualsCaseSomeArray("abc", "ABC"));
        assertFalse(SomeStrings.isEqualsCaseSomeArray(null, "ABC"));
        assertFalse(SomeStrings.isEqualsCaseSomeArray("abc", "abc"));
    }

    //Task7
    @Test
    public void testFirstContainIndexInSomeStrings() {
        assertEquals(SomeStrings.firstContainIndexInSomeStrings("abcdeabcde", "de"), 3, 0.001);
        assertEquals(SomeStrings.firstContainIndexInSomeStrings("abcabcabc", "ca"), 2, 0.001);
        assertEquals(SomeStrings.firstContainIndexInSomeStrings("aacvav", "el"), -1, 0.001);
    }

    //Task8
    @Test
    public void testContainIndexInSomeArray() {
        assertEquals(SomeStrings.containIndexInSomeArray("abcdabc", "abc"), 4, 0.001);
        assertEquals(SomeStrings.containIndexInSomeArray("abcddabc", "abc"), 5, 0.001);
        assertEquals(SomeStrings.containIndexInSomeArray("abcdabcabc", "ab"), 7, 0.001);
    }

    //Task9
    @Test
    public void testLastContainIndexInFirstHalfInSomeStrings() {
        assertEquals(SomeStrings.lastContainIndexInFirstHalfInSomeStrings("abcdabc", "abc"), 0, 0.001);
        assertEquals(SomeStrings.lastContainIndexInFirstHalfInSomeStrings("abcabdbabcabc", "ab"), 3, 0.001);
        assertEquals(SomeStrings.lastContainIndexInFirstHalfInSomeStrings("cabcca", "ol"), -1, 0.001);
    }

    //Task10
    @Test
    public void testStringsStartsEndsWithInSomeArray() {
        assertEquals(SomeStrings.stringsStartsEndsWithInSomeStrings(new String[]{"abcde", "abbde", "abbde", "abfde"}, "ab", "de"), 4, 0.001);
        assertEquals(SomeStrings.stringsStartsEndsWithInSomeStrings(new String[]{"abcde", "abbde", "abbe", "abfe"}, "ab", "de"), 2, 0.001);
    }

    //Task11
    @Test
    public void testStringsStartsEndsInSomeStrings() {
        assertEquals(SomeStrings.stringsStartsEndsInSomeStrings(new String[]{"abbde, abbde, abfe"}, "ab", "de"), 1, 0.001);
        assertEquals(SomeStrings.stringsStartsEndsInSomeStrings(new String[]{"abcde", "abbde", "abbe", "abfe"}, "ab", "de"), 4, 0.001);
    }

    //Task12
    @Test
    public void testReplaceSomeArray() {
        assertEquals(SomeStrings.replaceSomeArray("ороророро", "оро", "ро"), "роррро");
        assertEquals(SomeStrings.replaceSomeArray("abcsde", "sd", "aa"), "abcaae");
    }

    //Task13
    @Test
    public void testFromToInSomeString() {
        assertEquals(SomeStrings.fromToInSomeString("abc", 0, 2), "ab");
        assertEquals(SomeStrings.fromToInSomeString("abcsgrha", 3, 4), "s");
        assertEquals(SomeStrings.fromToInSomeString("abc", -1, 100), "abc");
        assertEquals(SomeStrings.fromToInSomeString("abc", 3, 2), "");
    }
}