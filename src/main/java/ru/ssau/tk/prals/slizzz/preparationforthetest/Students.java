package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.io.Serializable;
import java.util.Arrays;

public class Students implements Serializable {

    private String surname;
    private String name;
    private String patronymic;
    private int studentsRecordBookNumber;
    private int[] mark;

    private Students(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Students() {

    }

    private String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    private int getStudentsRecordBookNumber() {
        return studentsRecordBookNumber;
    }

    private void setStudentsRecordBookNumber(int studentsRecordBookNumber) {
        this.studentsRecordBookNumber = studentsRecordBookNumber;
    }

    private int[] getMark() {
        return mark;
    }

    private void setMark(int[] mark) {
        this.mark = mark;
    }

    private void setMark(int index, int mark) {
        this.mark[index] = mark;
    }

    public static void main(String[] args) {
        int[] arrayOfScoresOfFirst = new int[]{4, 4, 4};
        Students first = new Students("Serebrykova", "Elizaveta", "Olegovna");
        System.out.println("information about the first student is:    " + first.getName() + "  " + first.getSurname() + "    " + first.getPatronymic());
        first.setStudentsRecordBookNumber(5);
        System.out.println("Number Of Scores is   " + first.getStudentsRecordBookNumber());
        first.setMark(arrayOfScoresOfFirst);
        first.setMark(1, 5);
        System.out.println(" Score for exam is   " + Arrays.toString(first.getMark()));

    }
}
