/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.frontend;

import static com.mycompany.frontend.First.loginid;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdullah Maqsood
 */
public class Welcome extends javax.swing.JFrame {
     
    /**
     * Creates new form Login
     */
    public Welcome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        docname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        seeavailibility = new javax.swing.JButton();
        dayselect = new javax.swing.JComboBox<>();
        book = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Find a doctor");

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARDIOLOGY", "DERMATOLOGY", "GASTROENTEROLOGY", "NEURO SURGERY", "ONCOLOGY" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Speciality");

        jLabel3.setText("Doctor Name");

        docname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnameActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID #", "Name", "Years of Experience", "Specialization", "Qualification", "Days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Doctor ID #");

        seeavailibility.setBackground(new java.awt.Color(0, 204, 204));
        seeavailibility.setText("See Availibilty");
        seeavailibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeavailibilityActionPerformed(evt);
            }
        });

        book.setBackground(new java.awt.Color(0, 204, 204));
        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(179, 179, 179)))
                        .addComponent(jButton4)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id)
                                    .addComponent(dayselect, 0, 127, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(seeavailibility)
                                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 374, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeavailibility))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        String selected=jComboBox1.getSelectedItem().toString();
            try {
                Scanner sc=new Scanner(new FileReader("Doctor.txt"));
                while(sc.hasNextLine()){
                    String line=sc.nextLine();
                    String[] a=line.split(",");
                    String id=a[0];
                    String fname=a[1];
                    String lname=a[2];
                    String yoe =a[3];
                    String spec=a[4];
                    String qual=a[5];
                    String days=a[6];
                    
                    if(a[4].matches(selected.toLowerCase())){
                    String tbdata[]={id,fname.toUpperCase()+" "+lname.toUpperCase(),yoe,spec.toUpperCase(),qual.toUpperCase(),days};
                    DefaultTableModel tbmode=(DefaultTableModel)jTable1.getModel();
                    tbmode.addRow(tbdata);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void docnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
       // String selected=jComboBox1.getSelectedItem().toString();
        boolean found=false;
            try {
                Scanner sc=new Scanner(new FileReader("Doctor.txt"));
                while(sc.hasNextLine()){
                    
                    String line=sc.nextLine();
                    String[] a=line.split(",");
                    String id=a[0];
                    String fname=a[1];
                    String lname=a[2];
                    String yoe =a[3];
                    String spec=a[4];
                    String qual=a[5];
                     String days=a[6];
                    String name=this.docname.getText();
                    String[] divide=name.split(" ");
                    String one=divide[0];
                    String two=divide[1];
                    name=one+two;
                    if(name.matches(fname.toLowerCase()+lname.toLowerCase())){
                    String tbdata[]={id,fname.toUpperCase()+" "+lname.toUpperCase(),yoe,spec.toUpperCase(),qual.toUpperCase(),days};
                    DefaultTableModel tbmode=(DefaultTableModel)jTable1.getModel();
                    tbmode.addRow(tbdata);
                    found=true;
                    }
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(found==false){
             try {
                 throw new CustomException();
             } catch (CustomException ex) {
                  JFrame f=new JFrame();  
           JOptionPane.showMessageDialog(f,ex);
             }
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void seeavailibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeavailibilityActionPerformed
        // TODO add your handling code here:
        dayselect.removeAllItems();
        String id_no=this.id.getText();
        try {
            String availibility="";
                Scanner sc=new Scanner(new FileReader(id_no+".txt"));
                while(sc.hasNext()){
          
                    String mon=sc.next();
                    String tue=sc.next();
                    String wed =sc.next();
                    String thur=sc.next();
                    String fri=sc.next();
                    String sat=sc.next();
                   String sun=sc.next();
                   String fname=sc.next();
                   String lname=sc.next();
                   availibility+="Dr. "+fname.toUpperCase()+" "+lname.toUpperCase()+" is available on these days:\n";
                  
                   if(mon.matches("t")){
                       availibility+="Monday\n";
                        dayselect.addItem("Monday");
                   }
                   if(tue.matches("t")){
                       availibility+="Tuesday\n";
                        dayselect.addItem("Tuesday");
                   }if(wed.matches("t")){
                       availibility+="Wednesday\n";
                        dayselect.addItem("Wednesday");
                   }if(thur.matches("t")){
                       availibility+="Thursday\n";
                        dayselect.addItem("Thursday");
                   }if(fri.matches("t")){
                       availibility+="Friday\n";
                        dayselect.addItem("Friday");
                   }if(sat.matches("t")){
                       availibility+="Saturday\n";
                        dayselect.addItem("Saturday");
                   }if(sun.matches("t")){
                       availibility+="Sunday\n";
                       dayselect.addItem("Sunday");
                   }
                  
                   
                    
                }
                JFrame f=new JFrame();  
           JOptionPane.showMessageDialog(f,availibility);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_seeavailibilityActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        String id=this.id.getText();
        String selected=dayselect.getSelectedItem().toString();
       String[] days=new String[9];
        try {
          
                Scanner sc=new Scanner(new FileReader(id+".txt"));
                while(sc.hasNextLine()){
          
                    days[0]=sc.nextLine();
                    days[1]=sc.nextLine();
                    days[2]=sc.nextLine();
                    days[3]=sc.nextLine();
                    days[4]=sc.nextLine();
                    days[5]=sc.nextLine();
                    days[6]=sc.nextLine();
                    days[7]=sc.nextLine();
                    days[8]=sc.nextLine();
             
                   if(selected.matches("Monday")){
                       days[0]="f";
                   }if(selected.matches("Tuesday")){
                       days[1]="f";
                   }if(selected.matches("Wednesday")){
                       days[2]="f";
                   }if(selected.matches("Thursday")){
                       days[3]="f";
                   }if(selected.matches("Friday")){
                       days[4]="f";
                   }if(selected.matches("Saturday")){
                       days[5]="f";
                   }if(selected.matches("Sunday")){
                       days[6]="f";
                   }
                   
                }
                sc.close();
                JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Congrats your appointment has been booked with Dr."+days[7].toUpperCase()+" "+days[8].toUpperCase()+" on "+dayselect.getSelectedItem().toString());
                dayselect.removeAllItems();
                if(days[0].matches("t")){
                        dayselect.addItem("Monday");
                   }
                   if(days[1].matches("t")){
                        dayselect.addItem("Tuesday");
                   }if(days[2].matches("t")){
                       
                        dayselect.addItem("Wednesday");
                   }if(days[3].matches("t")){
                        dayselect.addItem("Thursday");
                   }if(days[4].matches("t")){
                        dayselect.addItem("Friday");
                   }if(days[5].matches("t")){
                        dayselect.addItem("Saturday");
                   }if(days[6].matches("t")){
                       dayselect.addItem("Sunday");
                   }
                FileWriter fw=new FileWriter(id+".txt");
                PrintWriter pw=new PrintWriter(fw);
                for(int i=0;i<9;i++){
                    pw.println(days[i]);
                   
                
            }
               // pw.println(fname);
               // pw.println(lname);
                fw.close();
                pw.close();
                
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
            }
                
    
         catch (IOException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       Patient pat;
    
         FileInputStream fis;
        try {
            fis = new FileInputStream(loginid+".ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
        if(loginid>=500){
          pat=(Adult)ois.readObject();
          ois.close();
        fis.close(); 
          pat.addRecord(days[7]+" "+days[8],selected);
          pat.setFees(((Adult)pat).CalculatePrice());
         }
         else{
         pat=(Child)ois.readObject(); 
         ois.close();
        fis.close();
         pat.addRecord(days[7]+" "+days[8],selected);
         pat.setFees(((Child)pat).CalculatePrice());
         }
        
         FileOutputStream fw = new FileOutputStream(loginid+".ser");
            ObjectOutputStream  pw=new ObjectOutputStream(fw);
            pw.writeObject(pat);
            pw.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
     
        
        
    }//GEN-LAST:event_bookActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        First fir=new First(loginid);
        fir.show();
        try {
                 fir.readObject();
                 fir.setText();
             } catch (IOException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JComboBox<String> dayselect;
    private javax.swing.JTextField docname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton seeavailibility;
    // End of variables declaration//GEN-END:variables
}