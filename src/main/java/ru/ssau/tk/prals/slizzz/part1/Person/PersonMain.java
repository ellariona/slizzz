package ru.ssau.tk.prals.slizzz.part1.Person;

public class PersonMain {
    private static Person firstHuman = new Person();
    private static Person secondHuman = new Person();
    private static Person thirdHuman = new Person();

    public static void main(String[] args) {
        firstHuman.setFirstName("Ivan");
        firstHuman.setLastName("Ivanov");
        firstHuman.setPassportId(135635);

        secondHuman.setFirstName("Kate");
        secondHuman.setLastName("Frolova");
        secondHuman.setPassportId(6833526);

        thirdHuman.setFirstName("Maksim");
        thirdHuman.setLastName("Udin");
        thirdHuman.setPassportId(1917624);

        System.out.println(firstHuman.getFirstName() + " " + firstHuman.getLastName() + ", passport ID: " + firstHuman.getPassportId());
        System.out.println(secondHuman.getFirstName() + " " + secondHuman.getLastName() + ", passport ID: " + secondHuman.getPassportId());
        System.out.println(thirdHuman.getFirstName() + " " + thirdHuman.getLastName() + ", passport ID: " + thirdHuman.getPassportId());

    }
}
