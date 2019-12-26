package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student13 {
    private String name;
    private int zachetkaNum;
    private Date birthDate;
    private String birthCity;

    public Student13() {

    }

    private Student13(String name, int zachetkaNum, Date birthDate, String birthCity) {
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

    public static List getCollection() {
        Student13[] students = new Student13[]{new Student13("Ivanov", 115, new Date(2001, Calendar.FEBRUARY, 1), "Samara"),
                new Student13("Dinev", 114, new Date(2002, Calendar.FEBRUARY, 1), "Moscow"),
                new Student13("Zimkin", 113, new Date(1992, Calendar.FEBRUARY, 1), "Moscow"),
                new Student13("Rimkin", 112, new Date(1992, Calendar.FEBRUARY, 1), "Moscow")
        };
        return Stream.of(students)
                .sorted(new Comparator<Student13>() {
                    @Override
                    public int compare(Student13 t1, Student13 t2) {
                        if (t1.getBirthDate().equals(t2.getBirthDate())) {
                            return t1.getName().compareTo(t2.getName());
                        }
                        return t1.getBirthDate().compareTo(t2.getBirthDate());
                    }
                })
                .collect(Collectors.toList());
    }

    public static List getCollectionReverse() {
        Student13[] students = new Student13[]{new Student13("Ivanov", 115, new Date(2001, Calendar.FEBRUARY, 1), "Samara"),
                new Student13("Dinev", 114, new Date(2002, Calendar.FEBRUARY, 1), "Moscow"),
                new Student13("Zimkin", 113, new Date(1992, Calendar.FEBRUARY, 1), "Moscow"),
                new Student13("Rimkin", 112, new Date(1992, Calendar.FEBRUARY, 1), "Moscow")
        };
        return Stream.of(students)
                .sorted(new Comparator<Student13>() {
                    @Override
                    public int compare(Student13 t1, Student13 t2) {
                        if (t1.getBirthDate().equals(t2.getBirthDate())) {
                            return t1.getName().compareTo(t2.getName());
                        }
                        return t1.getBirthDate().compareTo(t2.getBirthDate());
                    }
                }.reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List studs = Student13.getCollection();
        for (Object stud : studs) {
            System.out.println(((Student13) stud).getName());
        }
        List studOne = Student13.getCollectionReverse();
        for (Object stud : studOne) {
            System.out.println(((Student13) stud).getName());
        }
    }
}
