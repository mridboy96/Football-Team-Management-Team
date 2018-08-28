/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmshome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aksha
 */
public class UpdateInfo2 extends javax.swing.JFrame {

    /**
     * Creates new form UpdateInfo2
     */
    public UpdateInfo2(String a) {
        initComponents();
        
        setdata(a);
        this.setSize(1920,1080);
    }
     void setdata(String h)
    {
         
    
        try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement st=conn.createStatement();
                    
                    String query="Select * from Fixtures where FID="+h+"";
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        U1.setText(rs.getString("FID"));
                        U2.setText(rs.getString("Home_Team"));
                        U3.setText(rs.getString("Away_Team"));
                        U4.setText(rs.getString("Score"));
                        U5.setText(rs.getString("Date"));
                       
                        }           
                }
                     catch(Exception e)
                     {
                             JOptionPane.showMessageDialog(this,e.getMessage());
                     } 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        U3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        U4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        U5 = new javax.swing.JTextField();
        U1 = new javax.swing.JTextField();
        U2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/update.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(870, 750, 211, 91);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    FIXTURES DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 70, 350, 43);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FID");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 350, 116, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOME_TEAM");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 430, 144, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AWAY_TEAM");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 520, 144, 27);

        U3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        U3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U3ActionPerformed(evt);
            }
        });
        getContentPane().add(U3);
        U3.setBounds(430, 520, 300, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SCORE");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 610, 116, 27);

        U4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(U4);
        U4.setBounds(430, 610, 300, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 700, 116, 27);

        U5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        U5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U5ActionPerformed(evt);
            }
        });
        getContentPane().add(U5);
        U5.setBounds(430, 700, 300, 35);

        U1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        U1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U1ActionPerformed(evt);
            }
        });
        getContentPane().add(U1);
        U1.setBounds(430, 350, 300, 35);

        U2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        U2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U2ActionPerformed(evt);
            }
        });
        getContentPane().add(U2);
        U2.setBounds(430, 430, 300, 35);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/united1.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1972, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement stmt=conn.createStatement();
        
        
        
        String query="update Fixtures set Home_Team= '" + U2.getText() + "',Away_Team='" + U3.getText()  + "',Score='" + U4.getText() +"',Date='" + U5.getText() +"' where FID='" + U1.getText() + "';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Updation Complete");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.getMessage());
         }





        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void U3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U3ActionPerformed

    private void U5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U5ActionPerformed

    private void U1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U1ActionPerformed

    private void U2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(UpdateInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField U1;
    private javax.swing.JTextField U2;
    private javax.swing.JTextField U3;
    private javax.swing.JTextField U4;
    private javax.swing.JTextField U5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
