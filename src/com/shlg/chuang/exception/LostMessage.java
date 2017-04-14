package com.shlg.chuang.exception;

public class LostMessage {
    
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void display() throws HoHumException {
        throw new HoHumException();
    }
    
    public static void main(String[] args) {
        try {
            LostMessage lostMessage = new LostMessage();
            try {
                lostMessage.f();
            } finally {
                lostMessage.display();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class VeryImportantException extends Exception {
    
    private static final long serialVersionUID = -5776512447168205033L;

    public String toString() {
        return "A very important exception";
    }
    
}

class HoHumException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public String toString() {
        return "A trivial exception";
    }
    
}
