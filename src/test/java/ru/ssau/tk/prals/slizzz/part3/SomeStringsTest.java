package ru.ssau.tk.prals.slizzz.part3;

import org.testng.annotations.Test;
import ru.ssau.tk.prals.slizzz.part1.Person.Person;
import ru.ssau.tk.prals.slizzz.part1.Point.NamedPoint;
import ru.ssau.tk.prals.slizzz.part1.Point.Point;
import ru.ssau.tk.prals.slizzz.part2.Matrix;

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

    //Task18
    @Test
    public void testPrintsObjectInSomeArray() {
        SomeStrings.printsObjectInSomeStrings(new Person("Liza", "Serebrykova"));
        SomeStrings.printsObjectInSomeStrings(new Point(1, 2, 3));
        SomeStrings.printsObjectInSomeStrings(new NamedPoint(8, 1, 10, "First"));
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(1, 1, 10);
        firstMatrix.setAt(1, 2, 10);
        firstMatrix.setAt(2, 1, 10);
        firstMatrix.setAt(2, 2, 10);
        SomeStrings.printsObjectInSomeStrings(firstMatrix);
    }

    //Task19
    @Test
    public void testGetSingleInSomeStrings() {
        assertEquals(SomeStrings.getSingleInSomeStrings("hello i am 5 liza")[0], "Hello");
        assertEquals(SomeStrings.getSingleInSomeStrings("hello i am 5 liza")[1], "I");
        assertEquals(SomeStrings.getSingleInSomeStrings("hello i am 5 liza")[2], "Am");
        assertEquals(SomeStrings.getSingleInSomeStrings("hello i am 5 liza")[4], "Liza");
    }

    //Task20
    @Test
    public void testBuildStringInSomeStrings() {
        assertEquals(SomeStrings.buildStringInSomeStrings(new String[]{"ab", "ac"}), "ab, ac");
        assertEquals(SomeStrings.buildStringInSomeStrings(new String[]{"ab", "ac", ""}), "ab, ac, ");
        assertEquals(SomeStrings.buildStringInSomeStrings(new String[]{}), "");
        assertEquals(SomeStrings.buildStringInSomeStrings(new String[]{null, "ab"}), "null, ab");
    }

    //Task21
    @Test
    public void testBuildStringCharToIndexInSomeStrings() {
        assertEquals(SomeStrings.buildStringCharToIndexInSomeStrings("liza"), "0i2a");
        assertEquals(SomeStrings.buildStringCharToIndexInSomeStrings("qwertyuiop"), "0w2r4y6i8p");
        assertNull(SomeStrings.buildStringCharToIndexInSomeStrings(null));
    }

    //Task22
    @Test
    public void testIntInSomeStrings() {
        assertEquals(SomeStrings.intInSomeStrings(10), "0 1 2 3 4 5 6 7 8 9");
        assertEquals(SomeStrings.intInSomeStrings(-1), "");
        System.out.println(SomeStrings.intInSomeStrings(10000));
    }

    //Task 23
    @Test
    public void testCodeInSomeStrings()
    {
        System.out.println(SomeStrings.codeInSomeStrings("abzABZ01239"));
    }
}