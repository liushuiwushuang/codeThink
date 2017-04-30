package com.shlg.chuang.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {

    private static final int BSIZE = 1024;
    
    private static final String testFileName = "src/com/shlg/chuang/io/Data.txt";
    
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream(testFileName).getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream(testFileName).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fc.read(byteBuffer);
        byteBuffer.flip();
        // Don't work
        System.out.println(byteBuffer.asCharBuffer());
        // Decode using this system's default Charset
        byteBuffer.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decode using " + encoding + ": " + Charset.forName(encoding).decode(byteBuffer));
        // Or, we could encode with someting that will print:
        fc = new FileOutputStream(testFileName).getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        // Now reading again:
        fc = new FileInputStream(testFileName).getChannel();
        byteBuffer.clear();
        fc.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());
        // Use a CharBuffer to write through:
        fc = new FileOutputStream(testFileName).getChannel();
        byteBuffer = ByteBuffer.allocate(24); //  More than need
        byteBuffer.asCharBuffer().put("Some text");
        fc.write(byteBuffer);
        fc.close();
        // Read and display
        fc = new FileInputStream(testFileName).getChannel();
        byteBuffer.clear();
        fc.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());
    }
}
