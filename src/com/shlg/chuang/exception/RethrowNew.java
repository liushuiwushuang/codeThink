package com.shlg.chuang.exception;

public class RethrowNew {
    
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("throw fron f()");
    }

    public static void main(String[] args) {
        try {
           try { 
               f();
           } catch (OneException e) {
               System.out.println("Caught in inner try, e.printStackTrace()");
               e.printStackTrace(System.out);
               throw new TwoException("from inner try");
           }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}

class OneException extends Exception {
    
    private static final long serialVersionUID = 7544197851322341708L;

    public OneException(String s) {
        super(s);
    }
    
}

class TwoException extends Exception {
    
    private static final long serialVersionUID = 8283357028085826487L;

    public TwoException(String s) {
        super(s);
    }
    
}
