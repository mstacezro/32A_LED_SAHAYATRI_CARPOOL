/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

import controller.UserController;
import model.User;

/**
 *
 * @author LEGION
 */
public class ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPassword
     */
    public ForgetPassword() {
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

        panelMain = new javax.swing.JPanel();
        labelCarpoolLogo = new javax.swing.JLabel();
        labelWhiteLineDivider = new javax.swing.JLabel();
        panelLoginFrame = new javax.swing.JPanel();
        emailText = new javax.swing.JTextField();
        labelLOGIN2 = new javax.swing.JLabel();
        passText = new javax.swing.JTextField();
        cpassText = new javax.swing.JTextField();
        sqText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxSecurityQuestion = new javax.swing.JComboBox<>();
        buttonRegister = new javax.swing.JButton();
        labelLOGIN3 = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenuBack = new javax.swing.JMenu();
        jMenuBlank = new javax.swing.JMenu();
        jMenuContact = new javax.swing.JMenu();
        jMenuBlank1 = new javax.swing.JMenu();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(102, 142, 57));
        panelMain.setToolTipText("");
        panelMain.setPreferredSize(new java.awt.Dimension(1400, 720));

        labelCarpoolLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpool.png"))); // NOI18N

        labelWhiteLineDivider.setBackground(new java.awt.Color(255, 255, 255));
        labelWhiteLineDivider.setOpaque(true);

        panelLoginFrame.setBackground(new java.awt.Color(102, 142, 57));

        emailText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        emailText.setText("Email address");
        emailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFocusLost(evt);
            }
        });
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        labelLOGIN2.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        labelLOGIN2.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLOGIN2.setText("RESET");

        passText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        passText.setText("New Password");
        passText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTextFocusLost(evt);
            }
        });
        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        cpassText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cpassText.setText("Re-enter Password");
        cpassText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpassTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpassTextFocusLost(evt);
            }
        });
        cpassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassTextActionPerformed(evt);
            }
        });

        sqText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        sqText.setText("Security Question Answer");
        sqText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sqTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sqTextFocusLost(evt);
            }
        });
        sqText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqTextActionPerformed(evt);
            }
        });

        jComboBoxSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite food ?", "What was your first school name ?", "Who is your best friend ?", "What is your mother's maiden name?", " What is your first pet name?","What is your first job?","What is your favourite holiday place?" }));
        jComboBoxSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSecurityQuestionActionPerformed(evt);
            }
        });

        buttonRegister.setBackground(new java.awt.Color(0, 255, 51));
        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("RESET");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        labelLOGIN3.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        labelLOGIN3.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGIN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLOGIN3.setText("PASSWORD");

        javax.swing.GroupLayout panelLoginFrameLayout = new javax.swing.GroupLayout(panelLoginFrame);
        panelLoginFrame.setLayout(panelLoginFrameLayout);
        panelLoginFrameLayout.setHorizontalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpassText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSecurityQuestion, javax.swing.GroupLayout.Alignment.LEADING, 0, 339, Short.MAX_VALUE)
                                    .addComponent(sqText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(600, 600, 600)
                                .addComponent(jLabel1))))
                    .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelLOGIN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLOGIN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(660, Short.MAX_VALUE))
        );
        panelLoginFrameLayout.setVerticalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addComponent(labelLOGIN2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLOGIN3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(209, 209, 209))
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxSecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sqText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cpassText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCarpoolLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCarpoolLogo)
                        .addGap(89, 89, 89)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jMenuBack.setBackground(new java.awt.Color(102, 142, 57));
        jMenuBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBack.setForeground(new java.awt.Color(255, 0, 102));
        jMenuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/backIcon.png"))); // NOI18N
        jMenuBack.setText("BACK");
        jMenuBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBack.setMinimumSize(new java.awt.Dimension(200, 52));
        jMenuBack.setOpaque(true);
        jMenuBack.setPreferredSize(new java.awt.Dimension(200, 52));
        jMenu.add(jMenuBack);

        jMenuBlank.setBackground(new java.awt.Color(102, 142, 57));
        jMenuBlank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBlank.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBlank.setMinimumSize(new java.awt.Dimension(200, 52));
        jMenuBlank.setOpaque(true);
        jMenuBlank.setPreferredSize(new java.awt.Dimension(400, 52));
        jMenu.add(jMenuBlank);

        jMenuContact.setBackground(new java.awt.Color(102, 142, 57));
        jMenuContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/contactIcon.png"))); // NOI18N
        jMenuContact.setText("Contacts");
        jMenuContact.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuContact.setMinimumSize(new java.awt.Dimension(200, 52));
        jMenuContact.setOpaque(true);
        jMenuContact.setPreferredSize(new java.awt.Dimension(200, 52));
        jMenu.add(jMenuContact);

        jMenuBlank1.setBackground(new java.awt.Color(102, 142, 57));
        jMenuBlank1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBlank1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBlank1.setOpaque(true);
        jMenuBlank1.setPreferredSize(new java.awt.Dimension(400, 52));
        jMenu.add(jMenuBlank1);

        jMenuExit.setBackground(new java.awt.Color(102, 142, 57));
        jMenuExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Exit.png"))); // NOI18N
        jMenuExit.setText("Exit");
        jMenuExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuExit.setMinimumSize(new java.awt.Dimension(200, 52));
        jMenuExit.setOpaque(true);
        jMenuExit.setPreferredSize(new java.awt.Dimension(200, 52));
        jMenu.add(jMenuExit);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        String sq = null;
        Object item  = jComboBoxSecurityQuestion.getSelectedItem();
        if(item!=null){
            sq=item.toString();
        }

        String email = emailText.getText();
        String sq_ans = sqText.getText();
        String pass = passText.getText();
        String cpass = cpassText.getText();

        User u1 = new User(null, pass, null, null, null, null, null, null, null, null, email, null, sq, sq_ans, null, null, null) ;
        UserController sc = new UserController();
        int result = sc.resetPass(u1);

        if(result>0){
            JOptionPane.showMessageDialog(this, "Reset password Success");
        }
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void jComboBoxSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSecurityQuestionActionPerformed

    private void sqTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqTextActionPerformed

    private void sqTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sqTextFocusLost
        // TODO add your handling code here:
        if (sqText.getText().equals("")) {
            sqText.setText("Security Question Answer");
        }
    }//GEN-LAST:event_sqTextFocusLost

    private void sqTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sqTextFocusGained
        if(sqText.getText().equals("Security Question Answer")){
            sqText.setText("");
        }

    }//GEN-LAST:event_sqTextFocusGained

    private void cpassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassTextActionPerformed

    private void cpassTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassTextFocusLost
        if(cpassText.getText().equals("")){
            cpassText.setText("Re-enter Password");
        }
    }//GEN-LAST:event_cpassTextFocusLost

    private void cpassTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassTextFocusGained
        if(cpassText.getText().equals("Re-enter Password")){
            cpassText.setText("");
        }
    }//GEN-LAST:event_cpassTextFocusGained

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextActionPerformed

    private void passTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextFocusLost
        if(passText.getText().equals("")){
            passText.setText("New Password");
        }
    }//GEN-LAST:event_passTextFocusLost

    private void passTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextFocusGained
        if(passText.getText().equals("New Password")){
            passText.setText("");
        }
    }//GEN-LAST:event_passTextFocusGained

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void emailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusLost
        // TODO add your handling code here:
        if (emailText.getText().equals("")) {
            emailText.setText("Email address");
        }
    }//GEN-LAST:event_emailTextFocusLost

    private void emailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusGained
        if(emailText.getText().equals("Email address")){
            emailText.setText("");
        }

    }//GEN-LAST:event_emailTextFocusGained
    // yp

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegister;
    private javax.swing.JTextField cpassText;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox<String> jComboBoxSecurityQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenuBack;
    private javax.swing.JMenu jMenuBlank;
    private javax.swing.JMenu jMenuBlank1;
    private javax.swing.JMenu jMenuContact;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JLabel labelCarpoolLogo;
    private javax.swing.JLabel labelLOGIN2;
    private javax.swing.JLabel labelLOGIN3;
    private javax.swing.JLabel labelWhiteLineDivider;
    private javax.swing.JPanel panelLoginFrame;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField passText;
    private javax.swing.JTextField sqText;
    // End of variables declaration//GEN-END:variables
}
