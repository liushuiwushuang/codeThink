package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    
    final static public String POEM = 
            "Twa brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumoius Bandersnatch.";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        while (matcher.find()) {
            for (int j = 0; j <= matcher.groupCount(); j++)
                System.out.println("[" + matcher.group(j) + "]");
            System.out.println();
        }
    }

}
