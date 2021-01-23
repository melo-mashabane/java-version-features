package com.iwalksoftware.demo;

public interface InterfaceOne {
    void methodOne(String var1);

    default void log(String str) {
        System.out.println("Interface One logging - " + str);
    }

    static void print(String str) {
        System.out.println("Printing from InterfaceOne " + str);
    }
}
