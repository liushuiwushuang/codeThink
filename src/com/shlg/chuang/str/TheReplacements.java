package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shlg.chuang.io.TextFile;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    extracted block. !*/

public class TheReplacements {

    public static void main(String[] args) throws Exception {
        String s = TextFile.read("src/com/shlg/chuang/str/TheReplacements.java");
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find())
            s = mInput.group(1);
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer stringBuffer = new StringBuffer();
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            matcher.appendReplacement(stringBuffer, matcher.group().toUpperCase());
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer);
    }

}
