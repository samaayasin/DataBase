/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Charity;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author TestEnv
 */
public class OrphPage extends javax.swing.JPanel {
 static int count=0;
  int choose=0;
    /**
     * Creates new form EmpPage
     */
  public static Connection con;
  static {
  
     try {
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
     }
       
             
     try {
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
    public OrphPage() {   
     
        initComponents();
       this.setSize(1330, 930);
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
              
     //   "select * from event where name='"+search.getText()+"'";
       
     try {
         String  m = null;
         
         PreparedStatement stm= con.prepareStatement("SELECT Count(*) from Orphan");
         ResultSet r1= stm.executeQuery();
         r1.next();
         count=r1.getInt(1);
         
         ResultSet  r= stm.executeQuery("SELECT * from Orphan order by Child_id");
         for(int i=0;i<count;i++){
             r.next();
       stm= con.prepareStatement("SELECT Fname,LName from Visitors where VSSN="+r.getInt(13));
       r1=stm.executeQuery();
       r1.next();
             if(r.getString(3) == null)
                 m= "";
             else m= r.getString(3);
          
           n.put(r.getInt(1), new orphpanel(r.getInt(1),r.getString(5),r.getString(2)+" "+m+" "+r.getString(4),r.getString(7),r.getDate(6), r.getString(8),r.getDate(9),r.getString(11)+"-"+r.getString(10),r1.getString(1)+" "+r1.getString(2)));

          h.put(r.getInt(1),new Handler(r.getInt(1)));
         }
         
           for(Integer i:n.keySet()){
              n.get(i).setSize(1045, 79);
              n.get(i).addMouseListener(h.get(i));
    }
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(70, 205, 235));
        setLayout(null);

        showemp.setBackground(new java.awt.Color(70, 205, 235));
        showemp.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        showemp.setForeground(new java.awt.Color(255, 255, 255));
        showemp.setText("Show Orphans");
        showemp.setFocusable(false);
        showemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showempActionPerformed(evt);
            }
        });
        add(showemp);
        showemp.setBounds(1080, 360, 170, 90);

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
        deleteemp.setBounds(1080, 450, 170, 90);

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
        updateemp.setBounds(1080, 540, 170, 90);

        Search.setBackground(new java.awt.Color(70, 205, 235));
        Search.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Child ID", "Name", "Guardian Name" }));
        Search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search.setFocusable(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        add(Search);
        Search.setBounds(410, 40, 190, 50);

        searchresult.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        searchresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchresultActionPerformed(evt);
            }
        });
        add(searchresult);
        searchresult.setBounds(600, 40, 200, 50);

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
        searchbutton.setBounds(510, 110, 220, 80);

        info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        info.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(info);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 310, 1050, 380);

        se.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(se);
        se.setBounds(240, 280, 20, 30);

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
        jLabel9.setBounds(1130, 80, 130, 120);

        jLabel10.setBackground(new java.awt.Color(70, 205, 235));
        jLabel10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 205, 235));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Orphan");
        add(jLabel10);
        jLabel10.setBounds(1100, 30, 180, 60);

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 205, 235));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Name");
        add(jLabel13);
        jLabel13.setBounds(190, 260, 70, 30);

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 205, 235));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Religion");
        add(jLabel14);
        jLabel14.setBounds(320, 260, 100, 30);

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(70, 205, 235));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" Date");
        add(jLabel15);
        jLabel15.setBounds(400, 280, 120, 30);

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(70, 205, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Address");
        add(jLabel16);
        jLabel16.setBounds(540, 270, 100, 30);

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(70, 205, 235));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(" Date");
        add(jLabel17);
        jLabel17.setBounds(650, 280, 140, 30);

        jLabel18.setBackground(new java.awt.Color(204, 204, 255));
        jLabel18.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(70, 205, 235));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Name");
        add(jLabel18);
        jLabel18.setBounds(900, 280, 130, 30);

        jLabel19.setBackground(new java.awt.Color(204, 204, 255));
        jLabel19.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(70, 205, 235));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ID");
        add(jLabel19);
        jLabel19.setBounds(90, 260, 60, 30);

        jLabel20.setBackground(new java.awt.Color(204, 204, 255));
        jLabel20.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(70, 205, 235));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Birth");
        add(jLabel20);
        jLabel20.setBounds(410, 260, 100, 30);

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));
        jLabel21.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(70, 205, 235));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Join ");
        add(jLabel21);
        jLabel21.setBounds(680, 260, 80, 30);

        jLabel22.setBackground(new java.awt.Color(204, 204, 255));
        jLabel22.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(70, 205, 235));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Guardian");
        add(jLabel22);
        jLabel22.setBounds(900, 260, 130, 30);

        jLabel23.setBackground(new java.awt.Color(204, 204, 255));
        jLabel23.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(70, 205, 235));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Health ");
        add(jLabel23);
        jLabel23.setBounds(770, 260, 130, 30);

        jLabel24.setBackground(new java.awt.Color(204, 204, 255));
        jLabel24.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(70, 205, 235));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(" Problems");
        add(jLabel24);
        jLabel24.setBounds(770, 280, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void showempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showempActionPerformed

    se.setVisible(false);
  show.setVisible(false);
  show.removeAll();
 // show.setSize(info.getSize());
 show.setSize(1090, n.size()*90);
        connect();
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
         PreparedStatement stm= con.prepareStatement("DELETE from Orphan where Child_ID= "+choose);
         stm.execute();
          n.get(choose).setBackground(Color.WHITE);
          n.remove(choose);
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
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
         PreparedStatement stm= con.prepareStatement( " UPDATE ORPHAN SET Fname = '" +FName+"',Mname = '" +MName+"',Lname ='" + LName
                 + "',Birth_date='" + n.get(choose).getDateb()+"',REligion ='" +n.get(choose).getReg()+
                 "',Health_problems ='" +n.get(choose).getHealth()+"',Date_of_JOINING_THE_CHARITY ='" +
              n.get(choose).getDatej()+"',ADDress_city ='"
                 +address[0] +"',ADDress_street='" + address[1]+"' where child_id="+choose);
         stm.execute();
         n.get(choose).setBackground(Color.WHITE);
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
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
                if(searchresult.getText().equals(n.get(i).getId()+""))
                     select.add(i);
       }
        case 1 -> {
            
            for(Integer i : n.keySet() )
                if(searchresult.getText().equals(n.get(i).getname()))
                    select.add(i);
         }
        case 2 -> {
            for(Integer i : n.keySet() )
                if(searchresult.getText().equals(n.get(i).getGname()))
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
     try {
         HashMap <Integer,String> s=new HashMap< >();
         PreparedStatement stm=  con.prepareStatement("SELECT DISTINCT VSSN,Fname, LName from Visitors where guardianf= 1");
         ResultSet r1= stm.executeQuery();
         while(r1.next()){
             s.put(r1.getInt(1),r1.getString(2)+" "+r1.getString(3));
         }
         addOrphan add=new addOrphan(s);
         add.setVisible(true);
         add.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
     } catch (SQLException ex) {
         Logger.getLogger(OrphPage.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\d.png")); // NOI18N        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited

jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\add-friend (1).png")); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Search;
    private javax.swing.JButton deleteemp;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel se;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchresult;
    private javax.swing.JPanel show;
    private javax.swing.JButton showemp;
    private javax.swing.JButton updateemp;
    // End of variables declaration//GEN-END:variables
private HashMap <Integer,orphpanel> n=new HashMap<>();
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

 