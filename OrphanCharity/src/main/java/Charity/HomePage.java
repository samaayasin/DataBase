/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Charity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author TestEnv
 */
public class HomePage extends javax.swing.JFrame {
   eventpanel e=new eventpanel();
      donationpanel d=new donationpanel();
      EmpPage ee=new EmpPage();
      OrphPage O=new OrphPage();
      VisPage V=new VisPage(1);
     Loginpage L=new Loginpage();

    public HomePage() {
        initComponents(); 
          ep.setSize(1330,930);
          dp.setSize(1330,930);
           EMPP.setSize(1330,930);
           OR.setSize(1330,930);
           Visp.setSize(1330,930);
          

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Big_Panel = new javax.swing.JPanel();
        Panel_pic = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        poweroff = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        counter = new javax.swing.JPanel();
        Orp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Vol = new javax.swing.JLabel();
        Don = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ep = new javax.swing.JPanel();
        dp = new javax.swing.JPanel();
        EMPP = new javax.swing.JPanel();
        OR = new javax.swing.JPanel();
        Visp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        donation = new javax.swing.JLabel();
        event_lable = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        orphan_lable1 = new javax.swing.JLabel();
        Visitor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Big_Panel.setBackground(new java.awt.Color(70, 205, 235));
        Big_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_pic.setBackground(new java.awt.Color(255, 255, 255));
        Panel_pic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\l.png")); // NOI18N
        Panel_pic.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, 100, 100));

        poweroff.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\po.png")); // NOI18N
        poweroff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poweroffMouseClicked(evt);
            }
        });
        Panel_pic.add(poweroff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 60, 50));

        Home.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\icons8-home-page-48.png")); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Panel_pic.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, 50, 50));

        counter.setBackground(new java.awt.Color(255, 255, 255));
        counter.setLayout(null);

        Orp.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        Orp.setText("0");
        counter.add(Orp);
        Orp.setBounds(140, 100, 14, 30);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Orphans");
        counter.add(jLabel5);
        jLabel5.setBounds(140, 140, 120, 30);

        Vol.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        Vol.setText("0");
        counter.add(Vol);
        Vol.setBounds(70, 100, 14, 30);

        Don.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Don.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Don.setText("0$");
        counter.add(Don);
        Don.setBounds(80, 40, 70, 50);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Volunteers");
        counter.add(jLabel8);
        jLabel8.setBounds(20, 140, 120, 30);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Donations");
        counter.add(jLabel9);
        jLabel9.setBounds(70, 0, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\counter.jpeg")); // NOI18N
        jLabel2.setText(" ");
        counter.add(jLabel2);
        jLabel2.setBounds(40, 30, 188, 120);

        Panel_pic.add(counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1351, 690, 240, 190));

        ep.setLayout(null);
        Panel_pic.add(ep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 930));

        dp.setLayout(null);
        Panel_pic.add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 930));

        EMPP.setLayout(null);
        Panel_pic.add(EMPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 930));

        OR.setLayout(null);
        Panel_pic.add(OR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 930));

        Visp.setLayout(null);
        Panel_pic.add(Visp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 930));

        Big_Panel.add(Panel_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1600, 930));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\home child.png")); // NOI18N
        Big_Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 320, 280));

        emp.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\emp no.png")); // NOI18N
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                empMouseReleased(evt);
            }
        });
        Big_Panel.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 60));

        donation.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\don no.png")); // NOI18N
        donation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                donationMouseReleased(evt);
            }
        });
        Big_Panel.add(donation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 60));

        event_lable.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\event no.png")); // NOI18N
        event_lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                event_lableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                event_lableMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                event_lableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                event_lableMouseReleased(evt);
            }
        });
        Big_Panel.add(event_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 270, 60));

        name.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\name.png")); // NOI18N
        Big_Panel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 50));

        orphan_lable1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\orphan no.png")); // NOI18N
        orphan_lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orphan_lable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orphan_lable1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orphan_lable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                orphan_lable1MouseReleased(evt);
            }
        });
        Big_Panel.add(orphan_lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 60));

        Visitor.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\vis_no.png")); // NOI18N
        Visitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VisitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisitorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VisitorMousePressed(evt);
            }
        });
        Big_Panel.add(Visitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 50));

        getContentPane().add(Big_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               EMPP.add(ee);
              EMPP.setVisible(true);
        try { 
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",  "C##Samaa_Yasin","654321");
            Statement stm= con.createStatement();
             ResultSet r= stm.executeQuery("SELECT Count(*) from ORPHAN");
             r.next();
            MyThread t = new MyThread(r.getInt(1),Orp,"",1500);
            
                r= stm.executeQuery("SELECT Count(*) from Volunteers ");
             r.next();
              MyThread t2= new MyThread(r.getInt(1),Vol,"",1500);    
              
                  r= stm.executeQuery("SELECT Sum(Amount) from Donation_box ");
             r.next();
              MyThread t3= new MyThread(r.getInt(1),Don,"$",250);
             
              t.start();
              t2.start();
              t3.start();
            
             
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void empMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseEntered
        // TODO add your handling code here:
        emp.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\emp L.png")); // NOI18N
    }//GEN-LAST:event_empMouseEntered

    private void empMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseExited
        // TODO add your handling code here:
        emp.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\emp no.png")); // NOI18N
    }//GEN-LAST:event_empMouseExited

    private void empMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMousePressed
        // TODO add your handling code here:
        dp.setVisible(false);
         ep.setVisible(false);
          OR.setVisible(false);
            Visp.setVisible(false);

       EMPP.add(ee);
       EMPP.setVisible(true);
        
         
    }//GEN-LAST:event_empMousePressed

    private void empMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_empMouseReleased

    private void donationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationMouseEntered
        // TODO add your handling code here:
        donation.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\don L.png")); // NOI18N
    }//GEN-LAST:event_donationMouseEntered

    private void donationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationMouseExited
        // TODO add your handling code here:
        donation.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\don no.png")); // NOI18N
    }//GEN-LAST:event_donationMouseExited

    private void donationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationMousePressed
        // TODO add your handling code here:
        EMPP.setVisible(false);
         ep.setVisible(false);
          OR.setVisible(false);
          Visp.setVisible(false);

         dp.add(d);
        dp.setVisible(true);
        


        
    }//GEN-LAST:event_donationMousePressed

    private void donationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_donationMouseReleased

    private void event_lableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_lableMouseEntered
        // TODO add your handling code here:
        event_lable.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\event L.png")); // NOI18N
    }//GEN-LAST:event_event_lableMouseEntered

    private void event_lableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_lableMouseExited
        // TODO add your handling code here:
        event_lable.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\event no.png")); // NOI18N
    }//GEN-LAST:event_event_lableMouseExited

    private void event_lableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_lableMousePressed
        // TODO add your handling code here:
                EMPP.setVisible(false);
                dp.setVisible(false);
        OR.setVisible(false);
        Visp.setVisible(false);
         ep.add(e);
        ep.setVisible(true);
        

       
        

    }//GEN-LAST:event_event_lableMousePressed

    private void event_lableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_lableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_event_lableMouseReleased

    private void orphan_lable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orphan_lable1MouseEntered
        // TODO add your handling code here:
                orphan_lable1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\orphan L.png")); // NOI18N

    }//GEN-LAST:event_orphan_lable1MouseEntered

    private void orphan_lable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orphan_lable1MouseExited
        // TODO add your handling code here:
                orphan_lable1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\orphan no.png")); // NOI18N

    }//GEN-LAST:event_orphan_lable1MouseExited

    private void orphan_lable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orphan_lable1MousePressed
        // TODO add your handling code here:
        ep.setVisible(false);
       dp.setVisible(false);
          EMPP.setVisible(false); 
           Visp.setVisible(false);
        OR.add(O);
          OR.setVisible(true);
                

    }//GEN-LAST:event_orphan_lable1MousePressed

    private void orphan_lable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orphan_lable1MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_orphan_lable1MouseReleased

    private void poweroffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_poweroffMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        L.setVisible(true);
         setVisible(false);
     L.setLocation(500, 2);

    }//GEN-LAST:event_HomeMouseClicked

    private void VisitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisitorMouseEntered
        // TODO add your handling code here:
       Visitor.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\visitor.png"));

    }//GEN-LAST:event_VisitorMouseEntered

    private void VisitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisitorMouseExited
        // TODO add your handling code here:
        Visitor.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\vis_no.png"));
    }//GEN-LAST:event_VisitorMouseExited

    private void VisitorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisitorMousePressed
        // TODO add your handling code here:
        ep.setVisible(false);
       dp.setVisible(false);
       OR.setVisible(false);
       EMPP.setVisible(false);
      Visp.add(V);
       Visp.setVisible(true);
       
    }//GEN-LAST:event_VisitorMousePressed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Big_Panel;
    private javax.swing.JLabel Don;
    private javax.swing.JPanel EMPP;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel OR;
    private javax.swing.JLabel Orp;
    private javax.swing.JPanel Panel_pic;
    private javax.swing.JLabel Visitor;
    private javax.swing.JPanel Visp;
    private javax.swing.JLabel Vol;
    private javax.swing.JPanel counter;
    private javax.swing.JLabel donation;
    private javax.swing.JPanel dp;
    private javax.swing.JLabel emp;
    private javax.swing.JPanel ep;
    private javax.swing.JLabel event_lable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel orphan_lable1;
    private javax.swing.JLabel poweroff;
    // End of variables declaration//GEN-END:variables


class MyThread extends Thread{
    int x,i;
    JLabel l=new JLabel();
    String s1;
    int speed;
public MyThread(int count,JLabel t, String s,int y)
{

x=count;
l=t;
s1=s;
speed=y;
}
public void run()
{
while(true)
{
try {

Thread.sleep( speed );
if(i<x)
    i++;

l.setText(""+i+s1);
}
catch ( InterruptedException interruptedException ) {
System.err.println( interruptedException.toString());
}
}
}
}
}
