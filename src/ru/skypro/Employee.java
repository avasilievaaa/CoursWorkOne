package ru.skypro;

import java.util.Objects;

public class Employee {
    private static int count = 0;
    private String fullName;
    private String department;
    private int salary;
    public int id;

 public Employee (String fullName, String department, int salary) {
     this.fullName = fullName;
     this.department = department;
     this.salary = salary;
     this.id = count++;
 }
 public String getFullName () {return this.fullName;}
 public String getDepartment () {return this.department;}
 public int getSalary () {return this.salary;}
 public int getId () { return id;}

    public void setDepartment(String department) {this.department = department;}
    public void setSalary (int salary) {this.salary = salary;}

  public String toString () {
     return "id: " + id + "; ФИО: " + this.fullName + "; Отдел: " + this.department + "; Зарплата: " + this.salary;
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}

