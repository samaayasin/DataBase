/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Charity;


/**
 *
 * @author TestEnv
 */
public class Vis extends javax.swing.JPanel{

    /**
     * Creates new form Emp
     * @param Ssn
     * @param sex
     * @param name
     * @param rel
     * @param pho
     * @param add
     * @param j
     * @param e
     * @param Sal
     */
    public Vis( int Ssn,String sex,String name,  int pho,String t,String add,int bk) {
        initComponents();
        ssn.setText(Ssn+"");
       
 Name.setText(name);
    Phone.setText(pho+"");
    
   bank.setText(bk+"");
   address.setText(add);
    type.setText(t);
    if(sex.equalsIgnoreCase("m"))
   phote.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\m.png"));
    else if(sex.equalsIgnoreCase("f")) 
         phote.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\OrphanCharity\\OrphanCharity\\ALLPIC\\f.png")); // NOI18N
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phote = new javax.swing.JLabel();
        bank = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(null);
        add(phote);
        phote.setBounds(10, 10, 60, 60);

        bank.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bank.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bank.setText("1000$");
        bank.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankActionPerformed(evt);
            }
        });
        add(bank);
        bank.setBounds(720, 30, 110, 30);

        Name.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setText("Tala Mohammed Yaseen");
        Name.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        add(Name);
        Name.setBounds(100, 30, 210, 30);

        Phone.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Phone.setText("0599730297");
        Phone.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        add(Phone);
        Phone.setBounds(310, 30, 110, 30);

        type.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        type.setText("Voleenters");
        type.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        add(type);
        type.setBounds(420, 30, 110, 30);

        address.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.setText("Nablus- Fisial Street");
        address.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        add(address);
        address.setBounds(540, 30, 160, 30);

        ssn.setEditable(false);
        ssn.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        ssn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssn.setText("1");
        ssn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        ssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnActionPerformed(evt);
            }
        });
        add(ssn);
        ssn.setBounds(80, 30, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased



	public String getname() {
		return Name.getText();
	}

	public String getPhone() {
		return Phone.getText();
	}

	public int getBank() {
        
		return Integer.parseInt(bank.getText());
	}

	public  String getAddress() {
		return address.getText();
	}

	public  String getType() {
		return type.getText();
	}
        public  int getSSN() {
		return Integer.parseInt(ssn.getText());
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField address;
    private javax.swing.JTextField bank;
    private javax.swing.JLabel phote;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}