package com.shlg.chuang.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

    public static void main(String[] args) {
        String[] arguments = { "B([\\s\\S]*?).java" };  // 匹配以B开头.java结尾
        File path = new File("src/com/shlg/chuang/io/.");
        String[] list;
        list = path.list();
        if (arguments.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(arguments[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) 
            System.out.println(dirItem);
    }

}

class DirFilter implements FilenameFilter {
    
    private Pattern pattern;
    
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
    
}
