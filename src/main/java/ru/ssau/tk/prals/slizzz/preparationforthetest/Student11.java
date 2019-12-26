package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student11 {
    private String name;
    private int zachetkaNum;
    private Date birthDate;
    private String birthCity;

    public Student11() {

    }

    private Student11(String name, int zachetkaNum, Date birthDate, String birthCity) {
        this.name = name;
        this.zachetkaNum = zachetkaNum;
        this.birthCity = birthCity;
        this.birthDate = birthDate;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getZachetkaNum() {
        return zachetkaNum;
    }

    public void setZachetkaNum(int zachetkaNum) {
        this.zachetkaNum = zachetkaNum;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    private static Map<Student11, Integer> getMap() {
        Student11[] students = new Student11[]{new Student11("Ivanov", 116, new Date(2001, Calendar.MARCH, 1), "Moscow"),
                new Student11("Alexandra", 113, new Date(1999, Calendar.JUNE, 2), "Samara")};
        return Stream.of(students).collect(Collectors.toMap(stud -> stud, Student11::getZachetkaNum));
    }

}

