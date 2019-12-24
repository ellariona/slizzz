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
        assertEquals(SomeStrings.containIndexInSomeArray("abcdabc", "abc"), 4, 0.0001);
        assertEquals(SomeStrings.containIndexInSomeArray("abcddabc", "abc"), 5, 0.0001);
        assertEquals(SomeStrings.containIndexInSomeArray("abcdabcabc", "ab"), 7, 0.0001);
    }
}