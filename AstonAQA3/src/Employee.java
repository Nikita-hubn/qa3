public class Employee {
    private String surName;
    private String name;
    private String middleName;
    private String position;
    private String Email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String surname, String name, String middleName, String position, String Email, String phoneNumber, int salary, int age) {
        this.surName = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Фамилия: " + surName);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + Email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}

//