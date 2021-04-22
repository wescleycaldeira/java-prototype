package com.wcaldeira.copyserial;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {

    public static void main(String[] args) {
        Foo foo = new Foo(20, "Street");
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);
    }

}
