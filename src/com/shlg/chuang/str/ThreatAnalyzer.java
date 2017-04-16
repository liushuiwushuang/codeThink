package com.shlg.chuang.str;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalyzer {
    
    static String threatData = 
            "58.27.82.161@02/10/2005\n" +
            "204.45.234.4@02/11/2005\n" +
            "58.27.82.161@02/11/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner in = new Scanner(threatData);
        String patternString = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        while (in.hasNext(patternString)) {
            in.next(patternString);
            MatchResult matchResult = in.match();
            String ip = matchResult.group(1);
            String date = matchResult.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
        in.close();
    }

}
