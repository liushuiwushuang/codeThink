package com.shlg.chuang.generic;

import java.lang.reflect.Method;


class CommunicateReflectively {

	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch(NoSuchMethodException e) {
				System.out.println(speaker + " connot speak");
			}
			
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch(NoSuchMethodException e) {
				System.out.println(speaker + " connot sit");
			}
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString(),e);
		}
	}

}
