/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Charity;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.datasource.impl.OracleDataSource;

/**
 *
 * @author TestEnv
 */
public class VisPage extends javax.swing.JPanel {
 static int count=0;
  int choose=0;
    String type;
    /**
     * Creates new form EmpPage
     */
    
  public static Connection con;
  static {
       
     try {
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     } catch (SQLException ex) {
         Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
     }
    
             
     try {
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
     } catch (SQLException ex) {
         Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
  int mang;
    public VisPage(int mang) {   
     this.mang=mang;
        initComponents();
        this.setSize(1330,930);
       connect();
       se.setVisible(false);
    show.setVisible(false);
    int j=0;
       show.setSize(1090, n.size()*90);
       for(Integer i:n.keySet()){
          show.add( n.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0+(90*(j)), 1100, 90));
     j++;}
       // info.remove(reload);
     
    show.setVisible(true);
    }

    private void connect(){
                     
     try {
         String  m = null;
         if(Loginpage.idm()>0){
         PreparedStatement stm= con.prepareStatement("SELECT jobtype from employee where ssn=" +Loginpage.idm());
           ResultSet r2= stm.executeQuery();
        r2.next();
       type = r2.getString(1);
         type=type.trim();
         String manager= "manager";
          String e1= "ORPHAN_R";
          String e2= "EVENT_R";
             ResultSet r1 = null;
              ResultSet  r = null;
          if( type.equalsIgnoreCase(manager)){
              stm= con.prepareStatement("SELECT Count(*) from Visitors ");
        r1= stm.executeQuery();
         stm= con.prepareStatement("SELECT * from Visitors order by vSSN");
          r= stm.executeQuery();
          System.out.println(Loginpage.idm());
          }
          else if( type.equalsIgnoreCase(e1)){
                  stm= con.prepareStatement("SELECT Count(*) from Visitors where vtype='Doner' or vtype='Guardian' ");
        r1= stm.executeQuery();
         stm= con.prepareStatement("SELECT * from Visitors where vtype='Doner' or vtype='Guardian'  order by vSSN");
         r= stm.executeQuery();
           System.out.println(Loginpage.idm());
                  }
          else if( type.equalsIgnoreCase(e2)){
                  stm= con.prepareStatement("SELECT Count(*) from Visitors where vtype= 'Volunteer'");
        r1= stm.executeQuery();
        stm= con.prepareStatement("SELECT * from Visitors where vtype= 'Volunteer' order by vSSN");
         r= stm.executeQuery();
           System.out.println(Loginpage.idm());
                  }
              
          
         r1.next();
         count=r1.getInt(1);
      
         for(int i=0;i<count;i++){
             r.next();

             if(r.getString(3) == null)
                 m= " ";
             else m= r.getString(3);
           n.put(r.getInt(1), new Vis(r.getInt(1),r.getString(5),r.getString(2)+" "+m+" "+r.getString(4),r.getInt(6), r.getString(9),r.getString(8)+"-"+r.getString(7),r.getInt(13)));
          h.put(r.getInt(1),new Handler(r.getInt(1)));
         }
         
           for(Integer i:n.keySet()){
              n.get(i).setSize(1045, 79);
              n.get(i).addMouseListener(h.get(i));}
    }
     } catch (SQLException ex) {
         Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showemp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteemp = new javax.swing.JButton();
        updateemp = new javax.swing.JButton();
        Search = new javax.swing.JComboBox<>();
        searchresult = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        show = new javax.swing.JPanel();
        se = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        report = new javax.swing.JButton();

        setLayout(null);

        showemp.setBackground(new java.awt.Color(70, 205, 235));
        showemp.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        showemp.setForeground(new java.awt.Color(255, 255, 255));
        showemp.setText("Show Visitors");
        showemp.setFocusable(false);
        showemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showempActionPerformed(evt);
            }
        });
        add(showemp);
        showemp.setBounds(1080, 390, 170, 90);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 205, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(210, 250, 70, 30);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 205, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone");
        add(jLabel3);
        jLabel3.setBounds(350, 250, 80, 30);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 205, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Type");
        add(jLabel4);
        jLabel4.setBounds(460, 250, 80, 30);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 205, 235));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");
        add(jLabel5);
        jLabel5.setBounds(580, 250, 100, 30);

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 205, 235));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Account");
        add(jLabel7);
        jLabel7.setBounds(760, 270, 100, 30);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 205, 235));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SSN");
        add(jLabel8);
        jLabel8.setBounds(100, 250, 60, 30);

        deleteemp.setBackground(new java.awt.Color(70, 205, 235));
        deleteemp.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        deleteemp.setForeground(new java.awt.Color(255, 255, 255));
        deleteemp.setText("Delete");
        deleteemp.setFocusable(false);
        deleteemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteempActionPerformed(evt);
            }
        });
        add(deleteemp);
        deleteemp.setBounds(1080, 480, 170, 90);

        updateemp.setBackground(new java.awt.Color(70, 205, 235));
        updateemp.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        updateemp.setForeground(new java.awt.Color(255, 255, 255));
        updateemp.setText("Update");
        updateemp.setFocusable(false);
        updateemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateempActionPerformed(evt);
            }
        });
        add(updateemp);
        updateemp.setBounds(1080, 570, 170, 90);

        Search.setBackground(new java.awt.Color(70, 205, 235));
        Search.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSN", "Name", "Phone Number", " " }));
        Search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search.setFocusable(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        add(Search);
        Search.setBounds(380, 40, 170, 50);

        searchresult.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        searchresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchresultActionPerformed(evt);
            }
        });
        add(searchresult);
        searchresult.setBounds(550, 40, 180, 50);

        searchbutton.setBackground(new java.awt.Color(70, 205, 235));
        searchbutton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(255, 255, 255));
        searchbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\search.png")); // NOI18N
        searchbutton.setText("Search");
        searchbutton.setFocusable(false);
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        add(searchbutton);
        searchbutton.setBounds(460, 100, 190, 80);

        info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        info.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(info);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 300, 1050, 360);

        se.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(se);
        se.setBounds(220, 190, 20, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\add-friend (1).png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(1140, 80, 130, 120);

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 205, 235));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Visitor");
        add(jLabel10);
        jLabel10.setBounds(1110, 30, 180, 60);

        jLabel11.setBackground(new java.awt.Color(204, 204, 255));
        jLabel11.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 205, 235));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Bank");
        add(jLabel11);
        jLabel11.setBounds(760, 250, 80, 30);

        report.setBackground(new java.awt.Color(70, 205, 235));
        report.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("Visitors Report");
        report.setFocusable(false);
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        if(mang==1){
            add(report);
            report.setBounds(1080, 300, 170, 90);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void showempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showempActionPerformed

    se.setVisible(false);
  show.setVisible(false);
  show.removeAll();

        connect();
        
 show.setSize(1090, n.size()*90);
    int j=0;
        show.setSize(1090, n.size()*90);
       for(Integer i:n.keySet()){
          show.add( n.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0+(90*(j)), 1100, 90));
     j++;}
       // info.remove(reload);
     
    show.setVisible(true);
    }//GEN-LAST:event_showempActionPerformed

    private void deleteempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteempActionPerformed
       se.setVisible(false);
         show.setVisible(false);
     try {
         PreparedStatement stm= con.prepareStatement("DELETE from Visitors where vSSN= "+choose);
         stm.execute();
          n.get(choose).setBackground(Color.WHITE);
          n.remove(choose);
     } catch (SQLException ex) {
         Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
     }
    
     
    }//GEN-LAST:event_deleteempActionPerformed

    private void updateempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateempActionPerformed
    se.setVisible(false);
    show.setVisible(false);
    se.setSize(info.getSize());
        String FName,MName,LName;
         String [] address=n.get(choose).getAddress().split("-");
        String [] s=  n.get(choose).getname().split(" ");
          if(s.length<=2)
          {
              FName=s[0];
              MName=null;
              LName=s[1];
          }
          else if(s.length==3) {
               FName=s[0];
              MName= s[1];
              LName=s[2];
          }
          else {
               FName=s[0];
              MName= s[1]+s[2];
              LName=s[s.length-1];
          }
              
     try {
         PreparedStatement stm= con.prepareStatement( " UPDATE Visitors SET Fname = '" +FName+"',Mname = '" +MName+"',Lname ='" + LName
                 + "',Vtype ='" + n.get(choose).getType()+"',PHONENUMBER =" +n.get(choose).getPhone()+
                ",Bank_Account_number=" +  n.get(choose).getBank()+",ADDress_city ='" 
                 
                 
                 +address[1] +"',ADDress_street='" + address[0]+"' where vSSN= "+choose );
         stm.execute();
         n.get(choose).setBackground(Color.WHITE);
     } catch (SQLException ex) {
         Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
     }
    
     
    }//GEN-LAST:event_updateempActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void searchresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchresultActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
    ArrayList <Integer> select =new ArrayList();
   // for(Integer i : n.keySet() ){
     //    info.remove(n.get(i));
   
    //}
    //info.setVisible(false);
    show.setVisible(false);
    se.setVisible(false);
    se.removeAll();
    show.removeAll();
    switch (Search.getSelectedIndex()){
        
        case 0 -> {
            
            for(Integer i: n.keySet())
                if(searchresult.getText().equals(n.get(i).getSSN()+""))
                     select.add(i);
       }
        case 1 -> {
            
            for(Integer i : n.keySet() )
                if(searchresult.getText().equals(n.get(i).getname()))
                    select.add(i);
         }
        case 2 -> {
            for(Integer i : n.keySet() )
                if(searchresult.getText().equals(n.get(i).getPhone()))
                    select.add(i);
         }
        
     }
              // se.setSize(1090,select.size()*90);
               show.setSize(1090,select.size()*90);
            for(int i=0; i<select.size();i++){
             show.add( n.get(select.get(i)), new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0+(90*(i)), 1100, 90));
             //se
            }
         
            show.setVisible(true);
      //se
    
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
             // TODO add your handling code here:
       addVisitors add=new addVisitors(type);
        add.setVisible(true);
    add.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\d.png")); // NOI18N        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited

jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\add-friend (1).png")); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
    
         try {                                       
             
             Connection con = null;
             InputStream input;
             JasperDesign jasperDesign = null;
             JasperReport jasperReport = null;
             JasperPrint jasperPrint = null;
             OutputStream output;
             OracleDataSource ods = null;
             try {
                 ods=new OracleDataSource();
             } catch (SQLException ex) {
                 Logger.getLogger(eventpanel.class.getName()).log(Level.SEVERE, null, ex);
             }
             ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
             ods.setUser("c##Samaa_Yasin");
             ods.setPassword("654321");
             try {
                 con=ods.getConnection();
             } catch (SQLException ex) {
                 Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
             }
             input=new FileInputStream(new File("Simple_Blue_Table_Based.jrxml"));
             try {
                 jasperDesign=JRXmlLoader.load(input);
             } catch (JRException ex) {
                 Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 jasperReport=JasperCompileManager.compileReport(jasperDesign);
             } catch (JRException ex) {
                 Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
             } catch (JRException ex) {
                 Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
             }
             output= new FileOutputStream(new File("VisitorsReport.pdf"));
             try {
                 JasperExportManager.exportReportToPdfStream(jasperPrint,output);
             } catch (JRException ex) {
                 Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
             }
//you can also use the viewer, so replace the last two lines with
//the following code
JFrame frame = new JFrame("Report");
frame.getContentPane().add(new JRViewer(jasperPrint));
frame.pack();
frame.setVisible(true);

/* try {
Connection con;
InputStream input = null;
JasperDesign jasperDesign = null;
JasperReport jasperReport;
JasperPrint jasperPrint = null;
OutputStream output = null;
OracleDataSource ods = null;
try {
ods=new OracleDataSource();
} catch (SQLException ex) {
Logger.getLogger(eventpanel.class.getName()).log(Level.SEVERE, null, ex);
}
ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
ods.setUser("c##Tala_Yaseen");
ods.setPassword("123456");
con=ods.getConnection();
try {
input=new FileInputStream(new File("Leaf_Violet.jrxml"));
} catch (FileNotFoundException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
try {
jasperDesign=JRXmlLoader.load(input);
} catch (JRException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
try {
jasperReport=JasperCompileManager.compileReport(jasperDesign);
} catch (JRException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
try {
jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
} catch (JRException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
try {
output= new FileOutputStream(new File("EmployeeReport.pdf"));
} catch (FileNotFoundException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
try {
JasperExportManager.exportReportToPdfStream(jasperPrint,output);
} catch (JRException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
//you can also use the viewer, so replace the last two lines with
//the following code
JFrame frame = new JFrame("Report");
frame.getContentPane().add(new JRViewer(jasperPrint));
frame.pack();
frame.setVisible(true);
} catch (SQLException ex) {
Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
}
} catch (FileNotFoundException ex) {
Logger.getLogger(eventpanel.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
Logger.getLogger(eventpanel.class.getName()).log(Level.SEVERE, null, ex);
} catch (JRException ex) {
Logger.getLogger(eventpanel.class.getName()).log(Level.SEVERE, null, ex);
}*/
         } catch (FileNotFoundException ex) {
             Logger.getLogger(VisPage.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_reportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Search;
    private javax.swing.JButton deleteemp;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton report;
    private javax.swing.JPanel se;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchresult;
    private javax.swing.JPanel show;
    private javax.swing.JButton showemp;
    private javax.swing.JButton updateemp;
    // End of variables declaration//GEN-END:variables
private HashMap <Integer,Vis> n=new HashMap<>();
 private HashMap <Integer,Handler> h=new HashMap<>();

 private class Handler extends MouseAdapter
{ // process font style selections
    int v;
     public Handler(int i){
         v=i;
     }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            choose=v;
       
            for(Integer i: n.keySet()){
               n.get(i).setBackground(new Color(255,255,255));
           }
            n.get(v).setBackground(new Color(204,204,204));
           
           
            }
             
    }                                  

        
} 

 
