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
public class UpdateInfo1 extends javax.swing.JFrame {

    /**
     * Creates new form UpdateInfo1
     */
    public UpdateInfo1(String a) {
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
                    
                    String query="Select * from Coach where CID="+h+"";
                    ResultSet rs=st.executeQuery(query);
                    
                     while(rs.next()){
                        C1.setText(rs.getString("CID"));
                        C2.setText(rs.getString("Name"));
                        C3.setText(rs.getString("Gender"));
                        C4.setText(rs.getString("Designation"));
                        C5.setText(rs.getString("Salary"));
                        C6.setText(rs.getString("Age"));
                        C7.setText(rs.getString("Length_of_Contract"));
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

        C3 = new javax.swing.JTextField();
        C4 = new javax.swing.JTextField();
        C5 = new javax.swing.JTextField();
        C6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        C7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        C1 = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        C3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        getContentPane().add(C3);
        C3.setBounds(459, 435, 300, 35);

        C4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(C4);
        C4.setBounds(459, 520, 300, 35);

        C5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        getContentPane().add(C5);
        C5.setBounds(459, 605, 300, 35);

        C6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(C6);
        C6.setBounds(459, 690, 300, 35);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LENGTH OF CONTRACT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 780, 253, 27);

        C7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        getContentPane().add(C7);
        C7.setBounds(459, 775, 300, 35);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/update.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(860, 760, 211, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    COACH DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(800, 80, 300, 42);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CID");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 270, 132, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 360, 132, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENDER");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 440, 132, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESIGNATION");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 530, 162, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALARY");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 610, 132, 27);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 700, 132, 27);

        C1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(459, 265, 300, 35);

        C2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(459, 350, 300, 35);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1390, 270, 270, 90);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmshome/united1.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 2011, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
                    Class.forName("java.sql.Driver");
                    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/football_management_team?&useSSL=false","root","root");
                    Statement stmt=conn.createStatement();
        
        
        
        String query="update Coach set Name= '" + C2.getText() + "',Gender='" + C3.getText()  + "',Designation='" + C4.getText() +"',Salary='" + C5.getText() +"',Age='" + C6.getText() +"',Length_of_Contract='" + C7.getText() +"' where CID='" + C1.getText() + "';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Updation Complete");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.getMessage());
         }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField C1;
    public javax.swing.JTextField C2;
    public javax.swing.JTextField C3;
    public javax.swing.JTextField C4;
    public javax.swing.JTextField C5;
    public javax.swing.JTextField C6;
    public javax.swing.JTextField C7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
