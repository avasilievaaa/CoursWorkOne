package ru.skypro;

import java.util.Arrays;

public class Main {
    //создание поля типа Employee[10]
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        // write your code here
        //«хранилище» сотрудников
        employee[0] = new Employee("Петров Николай Иванович", "1", 25000);
        employee[1] = new Employee("Иванова Кристина Викторовна", "1", 34000);
        employee[2] = new Employee("Васильева Ирина Андреевна", "2", 43000);
        employee[3] = new Employee("Плошкина Зинаида Михайловна", "2", 48000);
        employee[4] = new Employee("Игнатов Павел Олегович", "3", 46000);
        employee[5] = new Employee("Игнатов Олег Николаевич", "3", 47000);
        employee[6] = new Employee("Певчий Григорий Александрович", "4", 54000);
        employee[7] = new Employee("Терентьева Любовь Алексеевна", "4", 55000);
        employee[8] = new Employee("Маркина Ангелина Викторовна", "5", 23000);
        employee[9] = new Employee("Сорокин Георгий Константинович", "5", 69000);
    }
    //Получить список всех сотрудников
    public static void printEmployees () {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }
    //сумма затрат на зарплаты в месяц
    public static int salary () {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee [i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составила: " + sum + " рублей");
        // средняя зарплата
        float averageValue = sum/employee.length;
        System.out.println("Средняя зарплата составила: " + sum + " рублей");
        return sum;
    }
    //сотрудник с минимальной зарплатой
    public static Employee minSalary () {
        Employee result = employee [0];
        int minSalary = employee [0].getSalary();
        for (Employee employee : employee) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    //сотрудник с максимальной зарплатой
    public static Employee maxSalary () {
        Employee result = employee [0];
        int maxSalary = employee [0].getSalary();
        for (Employee employee : employee) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    //ФИО всех сотрудников
    public static void printFullName () {
        for (Employee employee : employee) {
            System.out.println(employee.getFullName());
        }
    }
}