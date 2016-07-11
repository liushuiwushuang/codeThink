package com.shlg.chuang.generic;

public class LatenReflection {

	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Mime());
	}
}
