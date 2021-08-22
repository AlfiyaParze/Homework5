package Homework5;

public class Employee {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.printf(
                "Employee fio - %s, position - %s, email - %s, phone - %s, salary - %s age - %s%n",
                fio, position, email, phone, salary, age);
    }
}
