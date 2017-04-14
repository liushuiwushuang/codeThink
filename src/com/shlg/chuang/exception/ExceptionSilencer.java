package com.shlg.chuang.exception;

public class ExceptionSilencer {
    
    @SuppressWarnings("finally")
    public static int process() {
        try {
            int i = 1;
//            return i;
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("--------------------");
            System.out.println(e.getLocalizedMessage());
            System.out.println("++++++++++++++++++++");
            System.out.println(e.toString());
            System.out.println("********************");
            System.out.println(e.getStackTrace());
            System.out.println("%%%%%%%%%%%%%%%%%%%%%");
            e.printStackTrace();
            System.out.println("--------------------");
        } finally {
            int j = 0;
            throw new RuntimeException();  // 会使异常丢失 // 使try 都return 丢失
//            return;  // 会使异常丢失
        }
    }

    
    public static void main(String[] args) {
        
        System.out.println(process());
    }

}
