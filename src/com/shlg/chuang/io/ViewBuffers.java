package com.shlg.chuang.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class ViewBuffers {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, 0, 0, 0, 'a' });
        byteBuffer.rewind();
        System.out.print("ByteBuffer ");
        while (byteBuffer.hasRemaining())
            System.out.print(byteBuffer.position() + " -> " + byteBuffer.get() + ", ");
        System.out.println();
        
        CharBuffer cb = ((ByteBuffer) byteBuffer.rewind()).asCharBuffer();
        System.out.println("CharBuffer ");
        while (cb.hasRemaining())
            System.out.print(cb.position() + " -> " + cb.get() + ", ");
        System.out.println();
        
        FloatBuffer fb = ((ByteBuffer) byteBuffer.rewind()).asFloatBuffer();
        System.out.println("FloatBuffer ");
        while (fb.hasRemaining())
            System.out.print(fb.position() + " -> " + fb.get() + ", ");
        System.out.println();
        
        IntBuffer ib = ((ByteBuffer) byteBuffer.rewind()).asIntBuffer();
        System.out.println("IntBuffer ");
        while (ib.hasRemaining())
            System.out.print(ib.position() + " -> " + ib.get() + ", ");
        System.out.println();
        
        LongBuffer lb = ((ByteBuffer) byteBuffer.rewind()).asLongBuffer();
        System.out.println("IntBuffer ");
        while (lb.hasRemaining())
            System.out.print(lb.position() + " -> " + lb.get() + ", ");
        System.out.println();
        
        ShortBuffer sb = ((ByteBuffer) byteBuffer.rewind()).asShortBuffer();
        System.out.println("ShortBuffer ");
        while (sb.hasRemaining())
            System.out.print(sb.position() + " -> " + sb.get() + ", ");
        System.out.println();
        
        DoubleBuffer db = ((ByteBuffer) byteBuffer.rewind()).asDoubleBuffer();
        System.out.println("DoubleBuffer ");
        while (db.hasRemaining())
            System.out.print(db.position() + " -> " + db.get() + ", ");
        System.out.println();
                
    }

}
