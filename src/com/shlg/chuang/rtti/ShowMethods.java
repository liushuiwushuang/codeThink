package com.shlg.chuang.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
	
	@SuppressWarnings("unused")
    private static String usage =
			"usage:\n" +
			"ShowMethods qualified.clas.name\n" +
			"To show all methods in class or:\n" +
			"ShowMethods qualified.class.name word\n" +
			"To search for methods involving 'word'";
	
	private static Pattern p = Pattern.compile("\\w+\\.");
	
	private static void process(String[] arguments) {
	    int lines = 0;
        try {
            Class<?> c = Class.forName(arguments[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();
            if(arguments.length == 1) {
                for(Method method: methods)
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                for(Constructor<?> ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for(Method method : methods) 
                    if(method.toString().indexOf(arguments[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor<?> ctor : ctors)
                    if(ctor.toString().indexOf(arguments[1]) != -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
        System.out.println(lines);
	}
	
	public static void main(String[] args) {
//		if(args.length < 1) {
//			System.out.println(usage);;
//			System.exit(0);
//		}
	    String[] className = { "com.shlg.chuang.rtti.ShowMethods" };
		process(className);
	}
}
