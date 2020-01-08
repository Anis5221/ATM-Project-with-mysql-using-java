
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parso
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    
    
    
    public SignIn() {
        initComponents();
       jLabel9.setFocusable(true);
         
          

 
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User_name = new javax.swing.JTextField();
        Mail_id = new javax.swing.JTextField();
        First_name = new javax.swing.JTextField();
        Last_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Cancal_back = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        RePass = new javax.swing.JPasswordField();
        SigninButton = new javax.swing.JButton();
        Phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 60, 86));

        jLabel1.setText("User Name : ");

        jLabel2.setText("Mail Id :");

        jLabel3.setText("First Name :");

        jLabel4.setText("Last Name :");

        jLabel5.setText("Password :");

        jLabel6.setText("Confirm password :");

        User_name.setText("Enter User Name...");
        User_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_nameActionPerformed(evt);
            }
        });
        User_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                User_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                User_nameFocusLost(evt);
            }
        });

        Mail_id.setText("Enter a Mail Id...");
        Mail_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Mail_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Mail_idFocusLost(evt);
            }
        });

        First_name.setText("Enter Your First Name...");
        First_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                First_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                First_nameFocusLost(evt);
            }
        });

        Last_name.setText("Enter Your Last Name...");
        Last_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Last_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Last_nameFocusLost(evt);
            }
        });

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number:");

        Cancal_back.setText("Cancel");
        Cancal_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancal_backActionPerformed(evt);
            }
        });

        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });

        SigninButton.setText("Sign In");
        SigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninButtonActionPerformed(evt);
            }
        });

        Phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneFocusLost(evt);
            }
        });

        jLabel8.setText("Enter Amount :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 12, 33));
        jLabel9.setText("Register Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Last_name)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(User_name, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(Mail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(First_name, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SigninButton)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(Cancal_back))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Phone)
                                        .addComponent(Balance)
                                        .addComponent(RePass, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mail_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(First_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigninButton)
                    .addComponent(jButton1)
                    .addComponent(Cancal_back))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancal_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancal_backActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Cancal_backActionPerformed
    // this method user input currectin
    
    public boolean varifyData(){
        
        if(User_name.getText().equals("") || Mail_id.getText().equals("") || First_name.getText().equals("") || Last_name.getText().equals("") || String.valueOf(Password.getPassword()).equals("")){
           JOptionPane.showMessageDialog(null, "One or more field are Empty");
            return false;
        }
        else if( !String.valueOf(Password.getPassword()).equals(String.valueOf(RePass.getPassword()))){
            JOptionPane.showMessageDialog(null, "Incorrect Password");
            return false;
        }else{
            return true;
        }
       
    }
    // end of varifi method
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    
        if(varifyData()){
            Connection con = MyConnaction.getConnaction();
            PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO `anis`(`username`, `email`, `fname`, `lname`, `pass`, `phone`, `balance`) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, User_name.getText());
            ps.setString(2, Mail_id.getText());
            ps.setString(3, First_name.getText());
            ps.setString(4, Last_name.getText());
            ps.setString(5, String.valueOf(Password.getPassword()));
            ps.setString(6, Phone.getText());
            ps.setString(7, Balance.getText());
            ps.executeUpdate();
            if(isUserExist(User_name.getText())){
                JOptionPane.showMessageDialog(null, "User Already Exist!!");
            }else{
              if (ps.executeUpdate() != 0) {
           
                     JOptionPane.showMessageDialog(null, "Acount Created!!");
                 }else{
                     JOptionPane.showMessageDialog(null, "Somthig wrong"); 
            }  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void SigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninButtonActionPerformed
      LogIn log = new LogIn();
      log.setVisible(true);
      log.pack();
      log.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_SigninButtonActionPerformed

    private void User_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_nameActionPerformed
      
    }//GEN-LAST:event_User_nameActionPerformed

    private void User_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_nameFocusGained
       if(User_name.getText().equals("Enter User Name...")){
           User_name.setText("");
       }
    }//GEN-LAST:event_User_nameFocusGained

    private void User_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_nameFocusLost
         if(User_name.getText().equals("")){
           User_name.setText("Enter User Name...");
       }
    }//GEN-LAST:event_User_nameFocusLost

    private void Mail_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Mail_idFocusGained
        if(Mail_id.getText().equals("Enter a Mail Id...")){
           Mail_id.setText("");
       }
    }//GEN-LAST:event_Mail_idFocusGained

    private void Mail_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Mail_idFocusLost
        if(Mail_id.getText().equals("")){
           Mail_id.setText("Enter a Mail Id...");
       }
    }//GEN-LAST:event_Mail_idFocusLost

    private void First_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_First_nameFocusGained
       if(First_name.getText().equals("Enter Your First Name...")){
           First_name.setText("");
       }
    }//GEN-LAST:event_First_nameFocusGained

    private void First_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_First_nameFocusLost
        if(First_name.getText().equals("")){
           First_name.setText("Enter Your First Name...");
       }
    }//GEN-LAST:event_First_nameFocusLost

    private void Last_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Last_nameFocusGained
         if(Last_name.getText().equals("Enter Your Last Name...")){
           Last_name.setText("");
       }
    }//GEN-LAST:event_Last_nameFocusGained

    private void Last_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Last_nameFocusLost
       if(Last_name.getText().equals("")){
           Last_name.setText("Enter Your Last Name...");
       }
    }//GEN-LAST:event_Last_nameFocusLost

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
       
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        
    }//GEN-LAST:event_PasswordFocusLost

    private void PhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFocusGained
      
    }//GEN-LAST:event_PhoneFocusGained

    private void PhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFocusLost
     
    }//GEN-LAST:event_PhoneFocusLost

   public boolean isUserExist(String ur){
       boolean uexist = false;
       Connection con = MyConnaction.getConnaction();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try {
             ps = con.prepareStatement("SELECT * FROM `anis` WHERE `username`=?");
             ps.setString(1, User_name.getText());
         
             rs = ps.executeQuery();
             
             if(rs.next()){
                 uexist = true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uexist;
   }
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Balance;
    private javax.swing.JButton Cancal_back;
    private javax.swing.JTextField First_name;
    private javax.swing.JTextField Last_name;
    private javax.swing.JTextField Mail_id;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Phone;
    private javax.swing.JPasswordField RePass;
    private javax.swing.JButton SigninButton;
    private javax.swing.JTextField User_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}