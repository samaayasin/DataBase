/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Charity;

import javax.swing.JLabel;

/**
 *
 * @author TestEnv
 */
class MyThread extends Thread{
    JLabel l=new JLabel();
    int speed;
public MyThread(JLabel t, int y)
{
l=t;
speed=y;
}
public void run()
{
while(true)
{
try {
                        Thread.sleep( speed );
                        l.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\h1.png"));
                        Thread.sleep( speed );
                        l.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\h2.png"));
                        Thread.sleep( speed );
                        l.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\h3.png"));
                        Thread.sleep( speed );
                        l.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\h4.png"));
                        Thread.sleep( speed );
                        l.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\h5.png"));
                        Thread.sleep( speed );

                          

}
catch ( InterruptedException interruptedException ) {
System.err.println( interruptedException.toString());
}
}
}
}

