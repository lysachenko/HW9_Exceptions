package com.lysachenko.rethrowing;

public class RethrowingDemo {

    public void someMethod() throws ClassNotFoundException {
        someMethod2();
    }

    public void someMethod2() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
