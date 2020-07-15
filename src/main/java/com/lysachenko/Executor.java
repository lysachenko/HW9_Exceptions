package com.lysachenko;

import com.lysachenko.division.SafeDivision;
import com.lysachenko.exception.ExceptionA;
import com.lysachenko.exception.ExceptionB;
import com.lysachenko.rethrowing.RethrowingDemo;

import java.io.IOException;

public class Executor {

    public void run() {

        try {
            throw new ExceptionA();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }

        try {
            throw new ExceptionB();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        new SafeDivision().division();

        try {
            new RethrowingDemo().someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
