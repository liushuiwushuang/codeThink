package com.shlg.chuang.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferTo {

    private static final String testFileName = "src/com/shlg/chuang/io/Data.txt";
    
    private static final String javaFileName = "src/com/shlg/chuang/io/TransferTo.java";
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        String[] arguments = { javaFileName, testFileName };
        if (arguments.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel
            in = new FileInputStream(arguments[0]).getChannel(),
            out = new FileOutputStream(arguments[1]).getChannel();
        in.transferTo(0, in.size(), out);
    }

}
