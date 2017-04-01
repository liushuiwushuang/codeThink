package com.shlg.chuang.connection_4_7_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket serverSocket = new ServerSocket(2000);
            Socket socket = serverSocket.accept();
            // 获得输入流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 获得输出流
            pw = new PrintWriter(socket.getOutputStream(), true);
            
            String s = br.readLine();
            pw.println(s);   // 发送相同的数据给客户端
            
        } catch (Exception e) {
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
