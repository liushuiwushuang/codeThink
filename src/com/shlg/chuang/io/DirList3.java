package com.shlg.chuang.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList3 {
    
    public static void main(String[] args) {
        final String[] arguments = { "D([\\s\\S]*?).java" };
        File path = new File("src/com/shlg/chuang/io/.");
        String[] list;
        list = path.list();
        if (arguments.length == 0) 
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                
                private Pattern pattern = Pattern.compile(arguments[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
                
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }

}
