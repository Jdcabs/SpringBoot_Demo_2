package com.spring.tutorial.Exception;

public class DepartmentNotFound extends Exception {

    public DepartmentNotFound() {
    }

    public DepartmentNotFound(String arg0) {
        super(arg0);
    }

    public DepartmentNotFound(Throwable arg0) {
        super(arg0);
    }

    public DepartmentNotFound(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public DepartmentNotFound(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
}
