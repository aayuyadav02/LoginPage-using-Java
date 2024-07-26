
package login07;

/**
 *
 * @author yadavaayush
 */
public class loginpage extends javax.swing.JFrame {

   
    public loginpage() {
        initComponents();
        loginFailedMessage.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        pName = new javax.swing.JPasswordField();
        resetbutton = new javax.swing.JButton();
        loginbutton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        loginFailedMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        loginpanel.setBackground(new java.awt.Color(51, 0, 102));
        loginpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Here...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 102, 255))); // NOI18N
        loginpanel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 255));
        username.setText("Username :");

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 255));
        password.setText("Password :");

        uName.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });

        pName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        resetbutton.setBackground(new java.awt.Color(204, 204, 204));
        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(51, 0, 102));
        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        loginbutton.setBackground(new java.awt.Color(204, 204, 204));
        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(51, 0, 102));
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 102, 102));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        loginFailedMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginFailedMessage.setForeground(new java.awt.Color(255, 51, 51));
        loginFailedMessage.setText("Username or Password may Incorrect...!");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(resetbutton)
                        .addGap(136, 136, 136)
                        .addComponent(loginbutton))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(back))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginFailedMessage)
                            .addGroup(loginpanelLayout.createSequentialGroup()
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username)
                                    .addComponent(password))
                                .addGap(67, 67, 67)
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uName)
                                    .addComponent(pName, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))))))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginFailedMessage)
                .addGap(32, 32, 32)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbutton)
                    .addComponent(loginbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        
    }//GEN-LAST:event_uNameActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
            uName.setText("");
            pName.setText("");
            loginFailedMessage.setVisible(false);
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            System.exit(0);       
    }//GEN-LAST:event_backActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
            String username = uName.getText();
            char pass[] = pName.getPassword();
            String password = new String(pass);
            
            System.out.println("Username = "+username);
            System.out.println("Password = "+password);
            
            if (username!=null && password!=null && username.equalsIgnoreCase("Ash") && password.equals("071845"))
            {
                Homepage96 h1 = new Homepage96(username);
                h1.setVisible(true);
                this.setVisible(false);
                
            }
            else{
                loginFailedMessage.setVisible(true);
            }
    }//GEN-LAST:event_loginbuttonActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel loginFailedMessage;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPasswordField pName;
    private javax.swing.JLabel password;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField uName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
