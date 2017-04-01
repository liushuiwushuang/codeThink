package com.shlg.chuang.duotai;

public class DriveBase extends Base{
    
    // 这里的 静态成员变量初始化子类，打破了先静态 后初始化子类的惯例。(实质还是先静态，只是这里触发了初始化而已)
    private static DriveBase drive = new DriveBase("drive member");
    
    static {
        System.out.println("Drive static code block");
    }

    {
        System.out.println("Drive normal code block");
    }
    
    public DriveBase() {
        System.out.println("Drive contructor");
    }
    
    public DriveBase(String string) {
        System.out.println(string);
    }
    
    public static void main(String[] args) {
        new DriveBase();
    }

}
