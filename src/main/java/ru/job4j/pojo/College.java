package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup(" d17 ");
        student.setDateOfReceipt("20.12.2020.");
        System.out.println("Студент "
                + student.getFio()
                + " поступил в группу"
                + student.getGroup()
                + student.getDateOfReceipt());
    }
}