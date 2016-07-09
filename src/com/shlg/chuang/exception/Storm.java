package com.shlg.chuang.exception;

interface Storm {
	
	public void event() throws RainedOut;
	
	public void rainHard() throws RainedOut;
}
