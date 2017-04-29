package com.shlg.chuang.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
    
    private static final int BSIZE = 1024;
    
    private static final String testFileName = "src/com/shlg/chuang/io/Data.txt";
    
    private static final String javaFileName = "src/com/shlg/chuang/io/ChannelCopy.java";
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException{
        String[] arguments = { javaFileName, testFileName };
        if (arguments.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel
            in = new FileInputStream(arguments[0]).getChannel(),
            out = new FileOutputStream(arguments[1]).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        while (in.read(byteBuffer) != -1) {
            byteBuffer.flip(); // Prepare for writing
            out.write(byteBuffer);
            byteBuffer.clear();  // Prepare for reading
        }
    }

}
