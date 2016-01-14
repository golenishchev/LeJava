package com.sseraphim.javalessons;

public class ComputerAccessException extends Exception {
    // Default constructor
    public ComputerAccessException() {
    }

    // Constructor that accepts a message
    public ComputerAccessException(String message) {
        super(message);
    }

}
