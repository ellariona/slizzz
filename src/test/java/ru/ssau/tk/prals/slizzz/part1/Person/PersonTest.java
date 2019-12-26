package ru.ssau.tk.prals.slizzz.part1.Person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PersonTest {
    Person firstPerson = new Person();
    Person secondPerson = new Person("Liza", "Serebrykova", 2322);
    Person thirdPerson = new Person(3321);
    Person fourthPerson = new Person();

    @Test
    void testSetFirstName() {
        fourthPerson.setFirstName(null);
        firstPerson.setFirstName("Ivan");
        assertEquals(firstPerson.getFirstName(), "Ivan");
    }

    @Test
    void testSetLastName() {
        fourthPerson.setLastName(null);
        firstPerson.setLastName("Ivanov");
    }

    @Test
    void testSetPassportId() {
        thirdPerson.setPassportId(334562);
        assertEquals(thirdPerson.getPassportId(), 334562);
    }

    @Test
    void testGetFirstName() {
        assertNull(fourthPerson.getFirstName());
        assertNull(thirdPerson.getFirstName());
        assertEquals(secondPerson.getFirstName(), "Liza");
    }

    @Test
    void testGetLastName() {
        assertNull(fourthPerson.getLastName());
        assertNull(thirdPerson.getLastName());
        assertEquals(secondPerson.getLastName(), "Serebrykova");
    }

    @Test
    void testGetPassportId() {
        assertEquals(firstPerson.getPassportId(), 0);
        assertEquals(thirdPerson.getPassportId(), 3321);
    }

    @Test
    void testGetGender() {
        thirdPerson.setGender(Gender.MALE);
        assertEquals(thirdPerson.getGender(), Gender.MALE);
        fourthPerson.setGender(Gender.FEMALE);
        assertEquals(fourthPerson.getGender(), Gender.FEMALE);
    }

    @Test
    public void testSetGender() {
        firstPerson.setGender(Gender.MALE);
        assertEquals(firstPerson.getGender(), Gender.MALE);
        secondPerson.setGender(Gender.FEMALE);
        assertEquals(secondPerson.getGender(), Gender.FEMALE);
    }

    @Test
    public void testToString() {
        assertEquals(secondPerson.toString(), "Liza Serebrykova");
    }
}
