package Homework5;

public class Homework5 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", "Сотрудник1", "aa@a.ru", "555", 350, 33),
                new Employee("Петров П.П.", "Сотрудник2", "bb@a.ru", "355", 550, 23),
                new Employee("Сидоров С.С.", "Сотрудник3", "ss@a.ru", "222", 346, 55),
                new Employee("Кукуев К.К.", "Сотрудник4", "kk@a.ru", "112", 675, 60),
                new Employee("Бажов Б.Б.", "Сотрудник5", "bb@a.ru", "765", 876, 45),
        };

        printAgeFiltered(employees, 40);
    }

    static void printAgeFiltered(Employee[] employees, int age) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }

}