/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychatappp.networking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import mychatappp.gui.MainScreen;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class MessageTransmitter extends Thread {
    
    
    
    String message, hostname, user;
    int targetport, receivePort,key;

    public MessageTransmitter() {
    }

    public MessageTransmitter(String message, String hostname, int targetport, int receivePort, String user,int key) {
        this.message = message;
        this.hostname = hostname;
        this.targetport = targetport;
        this.user = user;
        this.receivePort = receivePort;
        this.key = key;

    }
   

    @Override
    public void run() {
        String line1,line2 = "",line3="";
        int i ;
        char[] a = new char[1000];
        
        line1 = user + " : " + message;
        line3 = line1 ;
        //System.out.println("First Message:" + line1);
        
        for(i=0;i<line1.length();i++)
       {  
           int ascii = line1.charAt(i);
           int temp = ascii;
           
           ascii = ascii + key;
           
           
             a[i] = (char) (ascii);
                      
       }
       
      
     
        for (int x=0; x<i; x++)
        {
            Character d;
            d = a[x];
            line2 += d.toString();
        }

  
        line1 = line2;
        
        
        
        //System.out.println("Sent Message:" + line1);
        
        try {

            Socket s1 = new Socket(hostname, targetport);
            Socket s2 = new Socket("localhost", receivePort);

            s1.getOutputStream().write(line1.getBytes());
            s2.getOutputStream().write(line1.getBytes());

            s1.close();
            s2.close();

        } catch (IOException ex) {
            Logger.getLogger(MessageTransmitter.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
