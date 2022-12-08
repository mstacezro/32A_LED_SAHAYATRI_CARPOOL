/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.String.format;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author lenovo
 */
public class KYC extends javax.swing.JFrame {

    /**
     * Creates new form KYC
     */
    public KYC() {
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
        panelContact = new javax.swing.JPanel();
        labelContact5 = new javax.swing.JLabel();
        labelContact6 = new javax.swing.JLabel();
        labelContact7 = new javax.swing.JLabel();
        labelContact8 = new javax.swing.JLabel();
        labelContact9 = new javax.swing.JLabel();
        panelLoginFrame = new javax.swing.JPanel();
        labelKYC = new javax.swing.JLabel();
        buttonUploadCitizenship = new javax.swing.JButton();
        buttonSubmitCitizenship = new javax.swing.JButton();
        buttonUploadCitizenship1 = new javax.swing.JButton();
        buttonSubmitCitizenship1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonBProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(102, 142, 57));
        panelMain.setToolTipText("");
        panelMain.setPreferredSize(new java.awt.Dimension(1270, 720));

        labelCarpoolLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpool.png"))); // NOI18N

        labelWhiteLineDivider.setBackground(new java.awt.Color(255, 255, 255));
        labelWhiteLineDivider.setOpaque(true);

        panelContact.setBackground(new java.awt.Color(102, 142, 57));

        labelContact5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact5.setForeground(new java.awt.Color(255, 255, 255));
        labelContact5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fbIcon.png"))); // NOI18N
        labelContact5.setText("www.facebook/sahayatri_carpool.com");

        labelContact6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/contactIcon.png"))); // NOI18N

        labelContact7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact7.setForeground(new java.awt.Color(255, 255, 255));
        labelContact7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/phoneIcon.PNG"))); // NOI18N
        labelContact7.setText("+977-(01)-4797486, +977-9841446531");

        labelContact8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact8.setForeground(new java.awt.Color(255, 255, 255));
        labelContact8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/locationIcon.png"))); // NOI18N
        labelContact8.setText("Pipolbot, Dillibazar, Kathmandu");

        labelContact9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelContact9.setForeground(new java.awt.Color(255, 255, 255));
        labelContact9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/emailIcon.png"))); // NOI18N
        labelContact9.setText("sahayatri.carpool@gmail.com");

        javax.swing.GroupLayout panelContactLayout = new javax.swing.GroupLayout(panelContact);
        panelContact.setLayout(panelContactLayout);
        panelContactLayout.setHorizontalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelContact6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelContact7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContact9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContact5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContact8, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelContactLayout.setVerticalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContact5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContact9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContact7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContact6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContact8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelLoginFrame.setBackground(new java.awt.Color(102, 142, 57));

        labelKYC.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        labelKYC.setForeground(new java.awt.Color(255, 255, 255));
        labelKYC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKYC.setText("KYC");

        buttonUploadCitizenship.setBackground(new java.awt.Color(0, 0, 255));
        buttonUploadCitizenship.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUploadCitizenship.setForeground(new java.awt.Color(255, 255, 255));
        buttonUploadCitizenship.setText("Upload Citizenship");
        buttonUploadCitizenship.setPreferredSize(new java.awt.Dimension(172, 27));
        buttonUploadCitizenship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUploadCitizenshipActionPerformed(evt);
            }
        });

        buttonSubmitCitizenship.setBackground(new java.awt.Color(0, 255, 51));
        buttonSubmitCitizenship.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSubmitCitizenship.setForeground(new java.awt.Color(255, 255, 255));
        buttonSubmitCitizenship.setText("Submit Citizenship");
        buttonSubmitCitizenship.setPreferredSize(new java.awt.Dimension(172, 27));
        buttonSubmitCitizenship.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubmitCitizenshipMouseClicked(evt);
            }
        });
        buttonSubmitCitizenship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitCitizenshipActionPerformed(evt);
            }
        });

        buttonUploadCitizenship1.setBackground(new java.awt.Color(0, 0, 255));
        buttonUploadCitizenship1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUploadCitizenship1.setForeground(new java.awt.Color(255, 255, 255));
        buttonUploadCitizenship1.setText("Upload Driver License");
        buttonUploadCitizenship1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUploadCitizenship1ActionPerformed(evt);
            }
        });

        buttonSubmitCitizenship1.setBackground(new java.awt.Color(0, 255, 51));
        buttonSubmitCitizenship1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSubmitCitizenship1.setForeground(new java.awt.Color(255, 255, 255));
        buttonSubmitCitizenship1.setText("Submit Driver License");
        buttonSubmitCitizenship1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitCitizenship1ActionPerformed(evt);
            }
        });

        jLabel1.setOpaque(true);

        jLabel2.setOpaque(true);

        javax.swing.GroupLayout panelLoginFrameLayout = new javax.swing.GroupLayout(panelLoginFrame);
        panelLoginFrame.setLayout(panelLoginFrameLayout);
        panelLoginFrameLayout.setHorizontalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                            .addComponent(buttonUploadCitizenship1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonSubmitCitizenship1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                            .addComponent(buttonUploadCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonSubmitCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLoginFrameLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelKYC, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        panelLoginFrameLayout.setVerticalGroup(
            panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginFrameLayout.createSequentialGroup()
                .addComponent(labelKYC, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUploadCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubmitCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSubmitCitizenship1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUploadCitizenship1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonBack.setBackground(new java.awt.Color(102, 142, 57));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/backIcon.png"))); // NOI18N

        buttonBProfile.setBackground(new java.awt.Color(102, 142, 57));
        buttonBProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/profiledashboardIcon.png"))); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelCarpoolLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonBProfile))
                            .addComponent(panelContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBProfile)
                    .addComponent(buttonBack))
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(panelLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWhiteLineDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCarpoolLogo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(panelContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUploadCitizenshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUploadCitizenshipActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("files", ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
     
        /*.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        jLabel1.setIcon(new ImageIcon(f.toString()));
        filename=f.getAbsolutePath();*/
        
        try{
            BufferedImage img = null;
            img = ImageIO.read(new File(f.getAbsolutePath())); 
            Image img1 = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon format = new ImageIcon(img1);
            jLabel1.setIcon(format);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        /*try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
                for(int readNum; (readNum = fis.read(buf)) !=-1;){
                    bos.write(buf, 0, readNum);
                }
                    photo = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_buttonUploadCitizenshipActionPerformed

    private void buttonSubmitCitizenshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitCitizenshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSubmitCitizenshipActionPerformed

    private void buttonUploadCitizenship1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUploadCitizenship1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("files", ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        /*JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        jLabel2.setIcon(new ImageIcon(f.toString()));
        filename=f.getAbsolutePath();*/
        
        try{
            BufferedImage img = null;
            img = ImageIO.read(new File(f.getAbsolutePath())); 
            Image img1 = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon format = new ImageIcon(img1);
            jLabel2.setIcon(format);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonUploadCitizenship1ActionPerformed

    private void buttonSubmitCitizenship1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitCitizenship1ActionPerformed
     // TODO add your handling code here:
     JOptionPane.showMessageDialog(this, "Driver details inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonSubmitCitizenship1ActionPerformed

    private void buttonSubmitCitizenshipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitCitizenshipMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonSubmitCitizenshipMouseClicked

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
            java.util.logging.Logger.getLogger(KYC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KYC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KYC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KYC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KYC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBProfile;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonSubmitCitizenship;
    private javax.swing.JButton buttonSubmitCitizenship1;
    private javax.swing.JButton buttonUploadCitizenship;
    private javax.swing.JButton buttonUploadCitizenship1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCarpoolLogo;
    private javax.swing.JLabel labelContact5;
    private javax.swing.JLabel labelContact6;
    private javax.swing.JLabel labelContact7;
    private javax.swing.JLabel labelContact8;
    private javax.swing.JLabel labelContact9;
    private javax.swing.JLabel labelKYC;
    private javax.swing.JLabel labelWhiteLineDivider;
    private javax.swing.JPanel panelContact;
    private javax.swing.JPanel panelLoginFrame;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
byte[] photo=null;
String filename;
 
}
