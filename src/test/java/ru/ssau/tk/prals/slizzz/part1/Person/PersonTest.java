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
    void setFirstName() {
        fourthPerson.setFirstName(null);
        firstPerson.setFirstName("Ivan");
        assertEquals(firstPerson.getFirstName(), "Ivan");
    }

    @Test
    void setLastName() {
        fourthPerson.setLastName(null);
        firstPerson.setLastName("Ivanov");
    }

    @Test
    void setPassportId() {
        thirdPerson.setPassportId(334562);
        assertEquals(thirdPerson.getPassportId(), 334562);
    }

    @Test
    void getFirstName() {
        assertNull(fourthPerson.getFirstName());
        assertNull(thirdPerson.getFirstName());
        assertEquals(secondPerson.getFirstName(), "Liza");
    }

    @Test
    void getLastName() {
        assertNull(fourthPerson.getLastName());
        assertNull(thirdPerson.getLastName());
        assertEquals(secondPerson.getLastName(), "Serebrykova");
    }

    @Test
    void getPassportId() {
        assertEquals(firstPerson.getPassportId(), 0);
        assertEquals(thirdPerson.getPassportId(), 3321);
    }

}
