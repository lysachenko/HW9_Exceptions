package com.lysachenko.rethrowing;

public class RethrowingDemo {

    public void someMethod() throws NullPointerException {
        someMethod2();
    }

    public void someMethod2() {
        throw new NullPointerException();
    }
}
