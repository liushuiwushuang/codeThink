package com.shlg.chuang;

public class Hourly extends Employee implements Payable<Employee>{
    // <Employee> 替换成 <Hourly> 会报错
}

interface Payable<T> {

}

class Employee implements Payable<Employee> {
    
}
