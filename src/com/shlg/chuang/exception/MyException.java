package com.shlg.chuang.exception;

@SuppressWarnings("serial")
class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}
