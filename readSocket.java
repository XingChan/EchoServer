/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;


import java.io.*;
import java.net.*;

/**
 *
 * @author Xing
 */
public class readSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            ServerSocket sock = new ServerSocket(6013);
            while (true) {
                Socket client = sock.accept();
                
                InputStream in = client.getInputStream();
                
                String s;
                System.out.println(in.toString());

                PrintWriter pout = new PrintWriter(client.getOutputStream(),true);

                pout.println(in.toString());
                pout.println(client.toString());
                //System.out.println(in.read());
                client.close();       
            }      
        } 
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}
