/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mychatappp.gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mychatappp.networking.MessageListener;
import mychatappp.networking.MessageTransmitter;
import mychatappp.networking.WritableGUI;

public class MainScreen extends javax.swing.JFrame implements WritableGUI {

    /**
     * Creates new form MainScreen
     */
    
    public MainScreen() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(10, 48, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipTextField = new javax.swing.JTextField();
        targetPort = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        message = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        listenButton = new javax.swing.JButton();
        receivePort = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        key = new javax.swing.JTextField();
        history = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ipTextField.setText("localhost");
        ipTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTextFieldActionPerformed(evt);
            }
        });

        targetPort.setText("88880");
        targetPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetPortActionPerformed(evt);
            }
        });

        chat.setColumns(20);
        chat.setRows(5);
        jScrollPane1.setViewportView(chat);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        listenButton.setLabel("Listen");
        listenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listenButtonActionPerformed(evt);
            }
        });

        receivePort.setText("88888");

        user.setText("User Name");

        key.setText("0");

        history.setText("Chat History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(history)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listenButton)
                        .addGap(18, 18, 18)
                        .addComponent(receivePort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(targetPort, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listenButton)
                    .addComponent(receivePort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(history)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MessageListener listener;
    String chatHistory="";

    private void listenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listenButtonActionPerformed

        listener = new MessageListener(this, Integer.parseInt(receivePort.getText()), Integer.parseInt(key.getText()));
        listener.start();
    }//GEN-LAST:event_listenButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed

        MessageTransmitter transmitter
                = new MessageTransmitter(message.getText(), ipTextField.getText(), Integer.parseInt(targetPort.getText()), Integer.parseInt(receivePort.getText()), user.getText(), Integer.parseInt(key.getText()));
        transmitter.start();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void ipTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTextFieldActionPerformed

    }//GEN-LAST:event_ipTextFieldActionPerformed

    private void targetPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetPortActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed

        WritableGUI gui = this;
        try {

            File file = new File(".\\ChatHistory.txt");

            if (!file.exists()) {
                {
                    file.createNewFile();
                    BufferedWriter out = null;
                    FileWriter fstream = new FileWriter(".\\ChatHistory.txt", true);
                    out = new BufferedWriter(fstream);
                    out.write(chatHistory + System.lineSeparator());
                    out.close();
                }

            } else {

                try {
                    BufferedWriter out = null;
                    FileWriter fstream = new FileWriter(".\\ChatHistory.txt", true); //true tells to append data.
                    out = new BufferedWriter(fstream);
                    out.write(chatHistory + System.lineSeparator());
                    out.close();
                } catch (IOException e) {
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        gui.write("Chat history downloaded in your project folder named as :: ChatHistory.txt");

    }//GEN-LAST:event_historyActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chat;
    private javax.swing.JButton history;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JButton listenButton;
    private javax.swing.JTextField message;
    private javax.swing.JTextField receivePort;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField targetPort;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    @Override
    public void write(String s) {

        
        chat.append(s + System.lineSeparator());
        chatHistory += s + System.lineSeparator();
        
        
        //System.out.println(chatHistory);
    }
}
