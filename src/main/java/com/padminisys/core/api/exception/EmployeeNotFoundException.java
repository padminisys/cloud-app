package com.padminisys.core.api.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long employeeID) {
        super("Could not find employee " + employeeID);
    }
}
