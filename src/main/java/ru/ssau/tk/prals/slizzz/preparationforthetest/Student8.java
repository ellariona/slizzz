package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Student8 {
    private String name;
    private int zachetkaNum;
    private Date birthDate;
    private String birthCity;

    public Student8() {

    }

    private Student8(String name, int zachetkaNum, Date birthDate, String birthCity) {
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

    private static Collection nameCollection(Student8[] students) {
        Collection collection = new ArrayList();
        for (Student8 student : students) {
            collection.add(student.getName());
        }
        return collection;
    }

    public static void main(String[] args) {
        System.out.println("Student");
        Student8[] students = {
                new Student8("Liza", 11234, new Date(), "Samara"),
                new Student8("Dima", 22312, new Date(), "Moscow"),
                new Student8("Masha", 12345, new Date(), "Novocuba"),
                new Student8("Liza", 11224, new Date(), "Uralsk"),

        };
        System.out.println(Student8.nameCollection(students));
    }
}
