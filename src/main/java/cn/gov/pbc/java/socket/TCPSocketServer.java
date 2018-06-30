package cn.gov.pbc.java.socket;  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
public class TCPSocketServer extends Thread {  
    private Socket client;  
  
    public TCPSocketServer(Socket c) {  
        this.client = c;  
    }  
  
    public void run() {  
        try {  
            BufferedReader in = new BufferedReader(new InputStreamReader(  
                    client.getInputStream()));  
            PrintWriter out = new PrintWriter(client.getOutputStream());  
            // Mutil User but can't parallel  
  
            while (true) {  
                String str = in.readLine();  
                System.out.println(str);  
                out.println("has receive....");  
                out.flush();  
                if (str.equals("end"))  
                    break;  
            }  
            client.close();  
        } catch (IOException ex) {  
        } finally {  
        }  
    }  
  
    public static void main(String[] args) throws IOException {  
        ServerSocket server = new ServerSocket(5678);  
        while (true) {  
            // transfer location change Single User or Multi User  
        	TCPSocketServer mc = new TCPSocketServer(server.accept());  
            mc.start();  
        }  
    }  
}  