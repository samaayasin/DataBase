package Charity;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Month;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author USER
 */
public class donationpanel extends javax.swing.JPanel {  
  
    public donationpanel() {
        initComponents();
        this.setSize(1330, 930);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        donerssn = new javax.swing.JTextField();
        donationid = new javax.swing.JTextField();
        dtype = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        ddate = new datechooser.beans.DateChooserCombo();
        ADD = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        pic_event = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        ShowAll = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        donername = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        names = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1330, 930));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(70, 205, 235));
        table.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DonationI D", "Donation Type", "amount", "Emp ID", "Doner SSN", "Date"
            }
        ));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1340, 360));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Dnation  ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 30));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Donation Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 30));

        jLabel6.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel6.setText("Donation Date");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel7.setText("Doner SSN");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 30));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel8.setText("Amount");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        donerssn.setForeground(new java.awt.Color(153, 153, 153));
        add(donerssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 30));

        donationid.setEditable(false);
        donationid.setForeground(new java.awt.Color(153, 153, 153));
        add(donationid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, 30));

        dtype.setForeground(new java.awt.Color(153, 153, 153));
        add(dtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 30));
        add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, 30));

        ddate.setCurrentView(new datechooser.view.appearance.AppearancesList("n",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true),
            new datechooser.view.appearance.ViewAppearance("n",
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 255, 255),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 153),
                    0.4f),
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(153, 153, 255),
                    new java.awt.Color(255, 255, 0),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.BOLD, 14),
                    new java.awt.Color(0, 0, 102),
                    0.2f),
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(0, 0, 0),
                    new java.awt.Color(51, 255, 51),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 153),
                    0.5f),
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(204, 204, 204),
                    new java.awt.Color(0, 0, 102),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.ITALIC, 10),
                    new java.awt.Color(0, 0, 255),
                    0.4f),
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 255, 255),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.BOLD, 12),
                    new java.awt.Color(0, 0, 255),
                    0.4f),
                new datechooser.view.appearance.custom.CustomCellAppearance(new java.awt.Color(255, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    (javax.swing.border.Border)null,
                    new java.awt.Font("Serif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(255, 0, 0),
                    0.3f),
                new datechooser.view.BackRenderer( 1,
                    "/C:/Users/TestEnv/Documents/NetBeansProjects/OrphanCharity/OrphanCharity/ALLPIC/dona.jpeg"),
                true,
                true)));
    ddate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED,
        (java.awt.Color)null,
        (java.awt.Color)null,
        new java.awt.Color(255, 255, 255),
        new java.awt.Color(255, 255, 255)));
try {
    ddate.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2022, 11, 12),
        new java.util.GregorianCalendar(2022, 11, 12))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
e1.printStackTrace();
}
add(ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 30));

ADD.setBackground(new java.awt.Color(70, 205, 235));
ADD.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
ADD.setForeground(new java.awt.Color(255, 255, 255));
ADD.setText("ADD");
ADD.setFocusable(false);
ADD.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        ADDMouseEntered(evt);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        ADDMouseExited(evt);
    }
    });
    ADD.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ADDActionPerformed(evt);
        }
    });
    add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 120, 60));

    update.setBackground(new java.awt.Color(70, 205, 235));
    update.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    update.setForeground(new java.awt.Color(255, 255, 255));
    update.setText("Update");
    update.setFocusable(false);
    update.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            updateMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            updateMouseExited(evt);
        }
    });
    update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateActionPerformed(evt);
        }
    });
    add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 130, 60));

    jComboBox1.setBackground(new java.awt.Color(70, 205, 235));
    jComboBox1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donationid", "Dtype" }));
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jComboBox1ItemStateChanged(evt);
        }
    });
    jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jComboBox1MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jComboBox1MouseExited(evt);
        }
    });
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1ActionPerformed(evt);
        }
    });
    add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 120, 30));

    pic_event.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\dona.jpeg")); // NOI18N
    pic_event.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            pic_eventMouseEntered(evt);
        }
    });
    add(pic_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 500, -1));

    delete.setBackground(new java.awt.Color(70, 205, 235));
    delete.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    delete.setForeground(new java.awt.Color(255, 255, 255));
    delete.setText("Delete");
    delete.setFocusable(false);
    delete.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            deleteMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            deleteMouseExited(evt);
        }
    });
    delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteActionPerformed(evt);
        }
    });
    add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 130, 60));

    ShowAll.setBackground(new java.awt.Color(70, 205, 235));
    ShowAll.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    ShowAll.setForeground(new java.awt.Color(255, 255, 255));
    ShowAll.setText("Show all");
    ShowAll.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ShowAllMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ShowAllMouseExited(evt);
        }
    });
    ShowAll.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ShowAllActionPerformed(evt);
        }
    });
    add(ShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 120, 60));

    searchtxt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchtxtActionPerformed(evt);
        }
    });
    add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 120, 30));

    search.setBackground(new java.awt.Color(70, 205, 235));
    search.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    search.setForeground(new java.awt.Color(255, 255, 255));
    search.setText("Search");
    search.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            searchMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            searchMouseExited(evt);
        }
    });
    search.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchActionPerformed(evt);
        }
    });
    add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 120, 60));

    donername.setBackground(new java.awt.Color(70, 205, 235));
    donername.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
    donername.setForeground(new java.awt.Color(255, 255, 255));
    donername.setText("Show ALL Doners");
    donername.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            donernameActionPerformed(evt);
        }
    });
    add(donername, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 220, 40));

    names.setColumns(20);
    names.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
    names.setRows(5);
    jScrollPane2.setViewportView(names);

    add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 490, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
     String name=new String();
         // TODO add your handling code here:
         Loginpage L=new Loginpage();
        int empssn= L.idm();
        String Empssn=String.valueOf(empssn);
         try{
//String did=donationid.getText();
String evamount= amount.getText();
String dd=ddate.getText();
String dotype=dtype.getText();
String dssn=donerssn.getText();
int Donerssn=Integer.valueOf(dssn);
//int Did=Integer.valueOf(did);
int A=Integer.valueOf(evamount);

         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
     PreparedStatement stm= con.prepareStatement("insert into donation_BOX values (Donation_S.nextval,'"+dotype+"',"+A+","+empssn+","+Donerssn+",'"+dd+"')");
      stm.execute();
            
    }
      catch (Exception ex) {
         Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
     }
        if(donerssn.getText().equals("")||amount.getText().equals("")||ddate.getText().equals("")||dtype.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Please Enter All Data !");
             
   }
         else{

            try{
         String ID=new String();
             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
     PreparedStatement stm= con.prepareStatement(" select Donation_ID from donation_BOX");
     ResultSet rs=stm.executeQuery();
     while(rs.next()){
         int id=rs.getInt(1);
         ID=String.valueOf(id);
     }
String data[]={ ID,dtype.getText(),amount.getText(),Empssn,donerssn.getText(),ddate.getText(),name};
             DefaultTableModel df =(DefaultTableModel)table.getModel();
             df.addRow(data);
             JOptionPane.showMessageDialog(this,"Added successfully ^_^ ");
                             dtype.setText("");
                             donerssn.setText("");
                             amount.setText("");
                             ddate.setText("");
                                   
                                     
            } catch (Exception ex) {
         Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
     }
     
                    
         }                                       
       
  
    }//GEN-LAST:event_ADDActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
          try{
            
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
     String did= donationid.getText();
     int Did;
     Did=Integer.valueOf(did);
      PreparedStatement stm= con.prepareStatement("DELETE from Donation_box where Donation_id="+Did);
           stm.execute();
                }
      catch (Exception ex) {
         Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
     }
          DefaultTableModel df =(DefaultTableModel)table.getModel();
          
         if(table.getSelectedRowCount()==1){
             df.removeRow(table.getSelectedRow());
              JOptionPane.showMessageDialog(this,"Deleted successfully ^_^ ");
                            donationid.setText("");
                             dtype.setText("");                   
                             donerssn.setText("");
                             amount.setText("");
                             ddate.setText("");                           
         }
         else
         {
             if(table.getRowCount()==0){
             JOptionPane.showMessageDialog(this,"The table is empty -_- ");
             }
             else JOptionPane.showMessageDialog(this,"Please,select any row to delete *_* ");
                 
         }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
            String evo=donationid.getText();

         try{
            
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
         String url="jdbc:oracle:thin:@location:1521:orcl";
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
  String di= donationid.getText();
  int doid=Integer.valueOf(di);
String dt= dtype.getText();
String ds= donerssn.getText();
String da= amount.getText();
String dd=ddate.getText();
int A=Integer.valueOf(da);
      PreparedStatement stm= con.prepareStatement("UPDATE Donation_BOX SET DTYPE ='"+dt+"',AMOUNT="+A+",Donation_date='"+dd+"',DonerSSN="+ds+" where Donation_ID="+doid+"");
      stm.execute();
                }
      catch (Exception ex) {
         Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
         DefaultTableModel df =(DefaultTableModel)table.getModel();
         if(table.getSelectedRowCount()==1){
             Loginpage L=new Loginpage();
           int empssn=  L.idm();
           String Empssn =String.valueOf(empssn);
String did=donationid.getText();
String dt= dtype.getText();
String da= amount.getText();
String ds= donerssn.getText();
String dd=ddate.getText();

               df.setValueAt(did,table.getSelectedRow(),0);

                    df.setValueAt(dt,table.getSelectedRow(),1);

                         df.setValueAt(da,table.getSelectedRow(),2);
                                   
                                     df.setValueAt(Empssn,table.getSelectedRow(),3);
                                       df.setValueAt(ds,table.getSelectedRow(),4);
                                         df.setValueAt(dd,table.getSelectedRow(),5);
                                     
JOptionPane.showMessageDialog(this,"Updated successfully ^_^ ");
 donationid.setText("");
             dtype.setText("");      
                donerssn.setText("");
                    amount.setText("");
                        ddate.setText("");
                                    
         
         }
         else{
              if(table.getRowCount()==0){
                  JOptionPane.showMessageDialog(this,"The Table is empty -_- ");

              }
              else{
                  JOptionPane.showMessageDialog(this,"Please,select any row to update *_*");

              }
         }

    }//GEN-LAST:event_updateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
                  DefaultTableModel df =(DefaultTableModel)table.getModel();
String di=df.getValueAt(table.getSelectedRow(),0).toString();
String dt=df.getValueAt(table.getSelectedRow(),1).toString();
String da=df.getValueAt(table.getSelectedRow(),2).toString();
String demp=df.getValueAt(table.getSelectedRow(),3).toString();
String ds=df.getValueAt(table.getSelectedRow(),4).toString();
String dd=df.getValueAt(table.getSelectedRow(),5).toString();

      donationid.setText(di);
      dtype.setText(dt);
      donerssn.setText(ds);
      amount.setText(da);
      ddate.setText(dd);
    }//GEN-LAST:event_tableMouseClicked

    private void ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllActionPerformed
        try {
            // TODO add your handling code here:
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
                 Statement stm =con.createStatement();
                 String st="select * from Donation_BOX";
                   ResultSet rs=stm.executeQuery(st);
                   ResultSetMetaData rm=rs.getMetaData();
                 DefaultTableModel df =(DefaultTableModel)table.getModel();
                  int c=df.getColumnCount();
                  df.setRowCount(0);
                  while(rs.next()){ 
                      Vector v=new Vector();
                      for(int I=0;I<=c;I++){
                      v.add(rs.getString("Donation_ID"));
                      v.add(rs.getString("DTYPE"));
                      v.add(rs.getString("amount"));
                      v.add(rs.getString("EMPSSN"));
                      v.add(rs.getString("DONERSSN"));
                      v.add(rs.getString("DONATION_DATE"));

  
                  }
                      df.addRow(v);
                  }
                 
        } catch (Exception ex) {
            Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowAllActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:  
        
       
       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
                 Statement stm =con.createStatement();                
                    
                      if(jComboBox1.getSelectedIndex()==0){
                          String di=searchtxt.getText();
                  int id=Integer.valueOf(di);
                    String st="select * from Donation_Box where Donation_ID="+id;          
                   ResultSet rs=stm.executeQuery(st);
                    ResultSetMetaData rm=rs.getMetaData();   
                    DefaultTableModel df =(DefaultTableModel)table.getModel();
                  int c=df.getColumnCount();
                  df.setRowCount(0);
                  while(rs.next()){ 
                      Vector v=new Vector();
                      for(int I=0;I<=c;I++){
                      v.add(rs.getString("Donation_ID"));
                      v.add(rs.getString("DType"));
                      v.add(rs.getString("amount"));
                      v.add(rs.getString("EMPSSN"));
                      v.add(rs.getString("DonerSSN"));
                      v.add(rs.getString("Donation_Date"));
                  }
                      df.addRow(v);
                  }
                  
                      }
                     else if(jComboBox1.getSelectedIndex()==1){
                           String Type=searchtxt.getText();
                           String st="select * from Donation_BOX where DTYPE= '"+Type+"'";
                   ResultSet rs=stm.executeQuery(st);   
                    ResultSetMetaData rm=rs.getMetaData();   
                    DefaultTableModel df =(DefaultTableModel)table.getModel();
                  int c=df.getColumnCount();
                  df.setRowCount(0);
                  while(rs.next()){ 
                      Vector v=new Vector();
                      for(int I=0;I<=c;I++){
                       v.add(rs.getString("Donation_ID"));
                      v.add(rs.getString("DType"));
                      v.add(rs.getString("amount"));
                      v.add(rs.getString("EMPSSN"));
                      v.add(rs.getString("DonerSSN"));
                      v.add(rs.getString("Donation_Date"));
                  }
                      df.addRow(v);
                  }
                      }
                    
        }
        catch (Exception ex) {
            Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);
        
    }                                          
    }//GEN-LAST:event_searchActionPerformed

    private void pic_eventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_eventMouseEntered
        // TODO add your handling code here
    }//GEN-LAST:event_pic_eventMouseEntered

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        // TODO add your handling code here:
        delete.setBackground(Color.blue);
        delete.setForeground(Color.white);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         delete.setBackground(c);
    }//GEN-LAST:event_deleteMouseExited

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void ADDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseEntered
        // TODO add your handling code here:
         ADD.setBackground(Color.blue);
        ADD.setForeground(Color.white);
    }//GEN-LAST:event_ADDMouseEntered

    private void ADDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         ADD.setBackground(c);
    }//GEN-LAST:event_ADDMouseExited

    private void ShowAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAllMouseEntered
        // TODO add your handling code here:
         ShowAll.setBackground(Color.blue);
        ShowAll.setForeground(Color.white);
    }//GEN-LAST:event_ShowAllMouseEntered

    private void ShowAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAllMouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         ShowAll.setBackground(c);
    }//GEN-LAST:event_ShowAllMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
         update.setBackground(Color.blue);
        update.setForeground(Color.white);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         update.setBackground(c);
    }//GEN-LAST:event_updateMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        // TODO add your handling code here:
         search.setBackground(Color.blue);
        search.setForeground(Color.white);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         search.setBackground(c);
    }//GEN-LAST:event_searchMouseExited

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
        // TODO add your handling code here:
         jComboBox1.setBackground(Color.blue);
        jComboBox1.setForeground(Color.white);
    }//GEN-LAST:event_jComboBox1MouseEntered

    private void jComboBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseExited
        // TODO add your handling code here:
        Color c=new Color(70,205,235);
         jComboBox1.setBackground(c);
    }//GEN-LAST:event_jComboBox1MouseExited

    private void donernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donernameActionPerformed
        // TODO add your handling code here:
        try{
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
        PreparedStatement st= con.prepareStatement(" select FNAME,MNAME,LNAME from Visitors where VTYPE = 'Doner'");
     ResultSet rs=st.executeQuery();
     names.setText("\t<<< Our Dnores >>>\n______________________________________________________\n\n");
     int c=0;
     while(rs.next()){
         String fname =rs.getString(1);
         
         String mname =rs.getString(2);
         String lname =rs.getString(3);
         if(mname == null)
             mname= "";
c++;

         names.append(c+".  "+fname+"  "+mname+"  "+lname+"\n");
     }
        } catch (Exception ex) {
            Logger.getLogger(donationpanel.class.getName()).log(Level.SEVERE, null, ex);     
    }                                          
                
    }//GEN-LAST:event_donernameActionPerformed
       
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ShowAll;
    private javax.swing.JTextField amount;
    private datechooser.beans.DateChooserCombo ddate;
    private javax.swing.JButton delete;
    private javax.swing.JTextField donationid;
    private javax.swing.JButton donername;
    private javax.swing.JTextField donerssn;
    private javax.swing.JTextField dtype;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea names;
    private javax.swing.JLabel pic_event;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}