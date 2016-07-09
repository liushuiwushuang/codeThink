package com.shlg.chuang.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@SuppressWarnings("serial")
class LoggingException extends Exception {
	
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
