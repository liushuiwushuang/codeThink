package com.shlg.chuang.connection_4_7_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        BufferedReader br = null;
        PrintWriter pw = null;
        
        try {
            Socket socket = new Socket("localhost", 2000);
            // 获得输入流 与 输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            // 向服务器发送数据
            pw.println("Hello");
            String s = null;
            while (true) {
                s = br.readLine();
                if (s != null) {
                    break;
                }
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (Exception e) {
                
            }
        }
    }

}
