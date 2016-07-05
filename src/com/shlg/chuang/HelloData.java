package com.shlg.chuang;

//: object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
 * Display a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloData {
	char c;

	/** Entry point to class & application.
	 * @param args array of string arguments
	 * @throws exception No exception thrown
	 */
	public static void main(String[] args) {
		System.out.println("hello,it's: ");
		System.out.println(new Date());
	}

}/* Output: (55% match)
Hello,it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~
