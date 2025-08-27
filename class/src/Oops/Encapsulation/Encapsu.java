package Oops.Encapsulation;

import java.lang.reflect.Field;

class Employee{
   private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
public class Encapsu {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
        Employee emp= new Employee();
        Field fsalary = Employee.class.getDeclaredField("salary");
        fsalary.setAccessible(true);
        System.out.println(fsalary.get(emp));

    }
}
