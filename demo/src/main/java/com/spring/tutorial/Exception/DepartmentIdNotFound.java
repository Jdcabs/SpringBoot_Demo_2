package com.spring.tutorial.Exception;

public class DepartmentIdNotFound extends Exception {

    public DepartmentIdNotFound() {
    }

    public DepartmentIdNotFound(String arg0) {
        super(arg0);
    }

    public DepartmentIdNotFound(Throwable arg0) {
        super(arg0);
    }

    public DepartmentIdNotFound(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public DepartmentIdNotFound(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    
}
