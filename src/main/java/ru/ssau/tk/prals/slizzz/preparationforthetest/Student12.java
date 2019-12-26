package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student12 {
    private String name;
    private int zachetkaNum;
    private Date birthDate;
    private String birthCity;

    public Student12() {

    }

    private Student12(String name, int zachetkaNum, Date birthDate, String birthCity) {
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

    public static Collection getCollection() {
        Student12[] students = new Student12[]{new Student12("Ivanov", 116, new Date(2001, Calendar.MARCH, 1), "Moscow"),
                new Student12("Alexandra", 113, new Date(1999, Calendar.JUNE, 2), "Samara"),
                new Student12("Varya", 113, new Date(1980, Calendar.AUGUST, 13), "Samara")
        };
        return Stream.of(students).filter(e -> !(e.getBirthCity().equals("Moscow")) && e.getBirthDate().after(new Date(200, Calendar.FEBRUARY, 1))).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Collection studs = Student12.getCollection();
        for (Object stud : studs) {
            System.out.println(((Student12) stud).getName());
        }
    }
}
