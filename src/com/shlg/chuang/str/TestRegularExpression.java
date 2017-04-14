package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    
    private static void process(String[] arguments) {
        System.out.println("Input: \"" + arguments[0] + "\"");
        for(String arg : arguments) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(arguments[0]);
            while(m.find()) {
                System.out.println("Match \"" + m.group() +"\" at positions "+
                        m.start() + "-" +(m.end()-1));
            }
        }
    }

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression " +
								"characterSequence regularExpression+");
//			System.exit(0);
		}
		String[] arguments = { "abcabcdefabc", "abc+", "(abc)+", "(abc){2,}" };
		process(arguments);
	}

}
