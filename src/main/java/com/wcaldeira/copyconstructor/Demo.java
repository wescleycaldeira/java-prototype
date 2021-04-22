package com.wcaldeira.copyconstructor;

public class Demo {

    public static void main(String[] args) {
        Employee john = new Employee("John", new Address("123 London Road", "London", "UK"));

        Employee chris = new Employee(john);

        chris.name = "Chris";

        System.out.println(john);
        System.out.println(chris);

        System.out.println("----------------");

        Employee employeeFactory = Employee.newInstance(john);
        employeeFactory.name = "Factory";
        System.out.println(employeeFactory);
    }

}
