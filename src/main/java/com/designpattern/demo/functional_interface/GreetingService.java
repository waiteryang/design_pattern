package com.designpattern.demo.functional_interface;


@FunctionalInterface
public interface GreetingService {

    void sayMessage(String message,Integer integer);

    boolean equals(Object object);

    static void  setXx(String xx){
    };

}
