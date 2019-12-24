package ru.ssau.tk.prals.slizzz.part3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeStringsTest {
    private String string = "когда каникулы :(";

    @Test
    public void testEachCharacterSomeStrings() {
        SomeStrings.eachCharacterSomeStrings(string);
    }
}