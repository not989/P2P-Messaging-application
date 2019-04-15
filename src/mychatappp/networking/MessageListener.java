/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychatappp.networking;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MessageListener extends Thread {

    ServerSocket server;
    int port,key;
    WritableGUI gui;

    public MessageListener(WritableGUI gui, int port,int key) {
        this.port = port;
        this.gui = gui;
        this.key = key;
        try {
            server = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MessageListener() {
        try {
            server = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {

        Socket clientSocket;

        try {
            while ((clientSocket = server.accept()) != null) {
                InputStream is = clientSocket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = br.readLine();
                if (line != null) {

                    

                    //System.out.println("Recieved Message:" + line );

                    char[] ch = line.toCharArray();
                    for (int i = 0; i < ch.length; i++) {
                        ch[i] = (char) (ch[i] - key);

                    }
                   // System.out.println(ch);
                       
                    line="";
                        
                    for (int x = 0; x < ch.length; x++) {
                        Character d;
                        d = ch[x];
                        line += d.toString();
                    }
                    
                    //System.out.println("Last line before write:" + line);

                    gui.write(line);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MessageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
