package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shlg.chuang.io.TextFile;

public class JGrep {
    
    private static void process(String[] arguments) {
        Pattern pattern = Pattern.compile(arguments[1]);
        int index= 0;
        Matcher matcher = pattern.matcher("");
        for (String line : new TextFile(arguments[0])) {
            matcher.reset(line);
            while (matcher.find())
                System.out.println(index++ + ": " + matcher.group() + ": " + matcher.start());
        }
    }

    public static void main(String[] args) throws Exception{
//        if (args.length < 2) {
//            System.out.println("Usage: java JGrep file regex");
//            System.exit(0);
//        }
        String[] s = { "src/com/shlg/chuang/str/JGrep.java", "\\b[Ssct]\\w+" };
        process(s);
    }

}
