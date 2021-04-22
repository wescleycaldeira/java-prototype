package com.wcaldeira.cloneable;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Person john = new Person(new String[]{"John", "Smith"}, new Address("SHCIN QL 10", 123));

        Person marie = (Person) john.clone();
        marie.names[0] = "Marie";
        marie.address.houseNumber = 456;

        System.out.println(john);
        System.out.println(marie);
    }

}
