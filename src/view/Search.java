/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DriverController;
import controller.UserController;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
// Comment
// import com.mysql.cj.protocol.Resultset;
// import com.mysql.cj.protocol.ResultsetRow;

import model.Driver;

/**
 *
 * @author lenovo
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form EXAMPLE
     */
    public Search() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProfile = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelEditProfile2 = new javax.swing.JPanel();
        labelLogoTop2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Leavebox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Goingbox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Datebox1 = new com.toedter.calendar.JDateChooser();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRIder = new javax.swing.JTable();
        requestText = new javax.swing.JButton();
        tabRider = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelEditProfile3 = new javax.swing.JPanel();
        labelLogoTop3 = new javax.swing.JLabel();
        labelWhiteHLine3 = new javax.swing.JLabel();
        tabDriver = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelEditProfile4 = new javax.swing.JPanel();
        labelLogoTop4 = new javax.swing.JLabel();
        labelWhiteHLine4 = new javax.swing.JLabel();
        labelProfileIcon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelProfile.setBackground(new java.awt.Color(102, 142, 57));

        jTabbedPane1.setBackground(new java.awt.Color(102, 142, 57));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("DRIVER");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 142, 57));

        jPanel4.setBackground(new java.awt.Color(102, 142, 57));

        panelEditProfile2.setBackground(new java.awt.Color(102, 142, 57));
        panelEditProfile2.setMaximumSize(new java.awt.Dimension(1145, 895));
        panelEditProfile2.setName(""); // NOI18N

        labelLogoTop2.setBackground(new java.awt.Color(102, 142, 57));
        labelLogoTop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoTop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpoolsmall.png"))); // NOI18N

        Leavebox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kathmandu", "Bhaktapur", "Lalitpur", "Pokhara", "Chitwan" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Leaving from ...");

        Goingbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kathmandu", "Bhaktapur", "Lalitpur", "Pokhara", "Chitwan" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Going to ...");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Date");

        searchBtn.setBackground(new java.awt.Color(0, 153, 0));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Leavebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Goingbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Datebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Datebox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Leavebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Goingbox1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        tblRIder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "S.N.", "Leaving from ... ", "Going to ...", "Date", "Trunk Space", "No. of Passengers", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRIder);
        if (tblRIder.getColumnModel().getColumnCount() > 0) {
            tblRIder.getColumnModel().getColumn(0).setResizable(false);
            tblRIder.getColumnModel().getColumn(1).setResizable(false);
            tblRIder.getColumnModel().getColumn(2).setResizable(false);
            tblRIder.getColumnModel().getColumn(3).setResizable(false);
            tblRIder.getColumnModel().getColumn(4).setResizable(false);
            tblRIder.getColumnModel().getColumn(5).setResizable(false);
            tblRIder.getColumnModel().getColumn(6).setResizable(false);
        }

        requestText.setBackground(new java.awt.Color(0, 204, 255));
        requestText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestText.setText("Request");
        requestText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditProfile2Layout = new javax.swing.GroupLayout(panelEditProfile2);
        panelEditProfile2.setLayout(panelEditProfile2Layout);
        panelEditProfile2Layout.setHorizontalGroup(
            panelEditProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile2Layout.createSequentialGroup()
                .addComponent(labelLogoTop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelEditProfile2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditProfile2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(requestText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelEditProfile2Layout.setVerticalGroup(
            panelEditProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile2Layout.createSequentialGroup()
                .addComponent(labelLogoTop2)
                .addGap(34, 34, 34)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(773, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(panelEditProfile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEditProfile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1786, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("RIDER", jPanel3);

        tabRider.setBackground(new java.awt.Color(102, 142, 57));

        jPanel5.setBackground(new java.awt.Color(102, 142, 57));

        panelEditProfile3.setBackground(new java.awt.Color(102, 142, 57));
        panelEditProfile3.setMaximumSize(new java.awt.Dimension(1145, 895));
        panelEditProfile3.setName(""); // NOI18N

        labelLogoTop3.setBackground(new java.awt.Color(102, 142, 57));
        labelLogoTop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoTop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpoolsmall.png"))); // NOI18N

        labelWhiteHLine3.setBackground(new java.awt.Color(255, 255, 255));
        labelWhiteHLine3.setOpaque(true);
        labelWhiteHLine3.setPreferredSize(new java.awt.Dimension(4, 20));

        javax.swing.GroupLayout panelEditProfile3Layout = new javax.swing.GroupLayout(panelEditProfile3);
        panelEditProfile3.setLayout(panelEditProfile3Layout);
        panelEditProfile3Layout.setHorizontalGroup(
            panelEditProfile3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile3Layout.createSequentialGroup()
                .addComponent(labelLogoTop3, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditProfile3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelWhiteHLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        panelEditProfile3Layout.setVerticalGroup(
            panelEditProfile3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile3Layout.createSequentialGroup()
                .addComponent(labelLogoTop3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWhiteHLine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1511, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEditProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1749, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEditProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tabRiderLayout = new javax.swing.GroupLayout(tabRider);
        tabRider.setLayout(tabRiderLayout);
        tabRiderLayout.setHorizontalGroup(
            tabRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
            .addGroup(tabRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabRiderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabRiderLayout.setVerticalGroup(
            tabRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1749, Short.MAX_VALUE)
            .addGroup(tabRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabRiderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("MY RIDE", tabRider);

        tabDriver.setBackground(new java.awt.Color(102, 142, 57));
        tabDriver.setForeground(new java.awt.Color(255, 255, 255));
        tabDriver.setToolTipText("DRIVER");
        tabDriver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(102, 142, 57));

        panelEditProfile4.setBackground(new java.awt.Color(102, 142, 57));
        panelEditProfile4.setMaximumSize(new java.awt.Dimension(1145, 895));
        panelEditProfile4.setName(""); // NOI18N

        labelLogoTop4.setBackground(new java.awt.Color(102, 142, 57));
        labelLogoTop4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoTop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/carpoolsmall.png"))); // NOI18N

        labelWhiteHLine4.setBackground(new java.awt.Color(255, 255, 255));
        labelWhiteHLine4.setOpaque(true);
        labelWhiteHLine4.setPreferredSize(new java.awt.Dimension(4, 20));

        javax.swing.GroupLayout panelEditProfile4Layout = new javax.swing.GroupLayout(panelEditProfile4);
        panelEditProfile4.setLayout(panelEditProfile4Layout);
        panelEditProfile4Layout.setHorizontalGroup(
            panelEditProfile4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile4Layout.createSequentialGroup()
                .addComponent(labelLogoTop4, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditProfile4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelWhiteHLine4, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        panelEditProfile4Layout.setVerticalGroup(
            panelEditProfile4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProfile4Layout.createSequentialGroup()
                .addComponent(labelLogoTop4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWhiteHLine4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1511, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEditProfile4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1749, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEditProfile4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tabDriverLayout = new javax.swing.GroupLayout(tabDriver);
        tabDriver.setLayout(tabDriverLayout);
        tabDriverLayout.setHorizontalGroup(
            tabDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
            .addGroup(tabDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabDriverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabDriverLayout.setVerticalGroup(
            tabDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1749, Short.MAX_VALUE)
            .addGroup(tabDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabDriverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("INBOX", tabDriver);

        labelProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/profiledashboardIcon.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 142, 57));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/backIcon.png"))); // NOI18N

        javax.swing.GroupLayout panelProfileLayout = new javax.swing.GroupLayout(panelProfile);
        panelProfile.setLayout(panelProfileLayout);
        panelProfileLayout.setHorizontalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelProfileIcon)
                .addGap(22, 22, 22))
        );
        panelProfileLayout.setVerticalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProfileIcon))
                .addContainerGap(690, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // fetchDriverDetails();
        
    }//GEN-LAST:event_formWindowOpened

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
   
        String convertedDate;
        String publishLeave = Leavebox1.getSelectedItem().toString();
        String publishGoing = Goingbox1.getSelectedItem().toString();
        String publishDate = (String) Datebox1.getDate().toString();
        System.out.println(publishDate);
        String day = publishDate.split(" ")[2];
        String month = publishDate.split(" ")[1];
        String year = publishDate.split(" ")[5];
        String convertedMonth = convertMonthIntoString(month);
        int resultHasDigit = convertMonthIntoString(month).length();
        if (resultHasDigit == 1){
            convertedDate = String.format("%s-0%s-%s", year, convertedMonth, day);
        } else{
            convertedDate = String.format("%s-%s-%s", year, convertedMonth, day);
        }
        System.out.println(convertedDate);
        Driver d1 = new Driver(0, publishLeave,publishGoing,convertedDate,null,0,0,null);
            DriverController dc = new DriverController();
            ResultSet result = dc.searchDetails(d1);
            try {
                DefaultTableModel model = (DefaultTableModel) tblRIder.getModel();
                model.setRowCount(0);
                while(result.next()){
                    String SN = result.getString(1);
                String Leave = result.getString(2);
                String Going  = result.getString(3);
                String date = result.getString(4);
                String trunk = result.getString(5);
                String seat = result.getString(6);
                String price = result.getString(7);

                // JOptionPane.showMessageDialog(null,SN + Leave+Going+date+trunk+price);
                Object[] row = {SN,Leave,Going,date,trunk,seat,price};
                model.addRow(row);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

    //     
    }//GEN-LAST:event_searchBtnActionPerformed

    private void requestTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTextActionPerformed
       ResultSet rs = new UserController().selectEmail();
       int i = tblRIder.getSelectedRow();
        TableModel model = tblRIder.getModel();
        int id = Integer.parseInt(model.getValueAt(i, 0).toString());
       try {
        while(rs.next()){
            String email = rs.getString(1);
            Driver d1 = new Driver(id, null,null,null,null,0,0,email);
            DriverController dc = new DriverController();
            int result = dc.Request(d1);
            if(result>0){
                JOptionPane.showMessageDialog(this, "Booked Success");
            }


        }
       } catch (Exception e) {
        // TODO: handle exception
       }
    }//GEN-LAST:event_requestTextActionPerformed
    
    public void table(){
        DefaultTableModel model = (DefaultTableModel) tblRIder.getModel();
        model.setRowCount(0);
        try {
            Driver d1 = new Driver(0, null,null,null,null,0,0,null);
            DriverController dc = new DriverController();
            ResultSet result = dc.fetchDriverDetails();
            while(result.next()){
                String SN = result.getString(1);
                String Leave = result.getString(2);
                String Going  = result.getString(3);
                String date = result.getString(4);
                String trunk = result.getString(5);
                String seat = result.getString(6);
                String price = result.getString(7);

                // JOptionPane.showMessageDialog(null,SN + Leave+Going+date+trunk+price);
                Object[] row = {SN,Leave,Going,date,trunk,seat,price};
                model.addRow(row);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
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
            java.util.logging.Logger.getLogger(EXAMPLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EXAMPLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EXAMPLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EXAMPLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datebox1;
    private javax.swing.JComboBox<String> Goingbox1;
    private javax.swing.JComboBox<String> Leavebox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelLogoTop2;
    private javax.swing.JLabel labelLogoTop3;
    private javax.swing.JLabel labelLogoTop4;
    private javax.swing.JLabel labelProfileIcon;
    private javax.swing.JLabel labelWhiteHLine3;
    private javax.swing.JLabel labelWhiteHLine4;
    private javax.swing.JPanel panelEditProfile2;
    private javax.swing.JPanel panelEditProfile3;
    private javax.swing.JPanel panelEditProfile4;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JButton requestText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel tabDriver;
    private javax.swing.JPanel tabRider;
    private javax.swing.JTable tblRIder;
    // End of variables declaration//GEN-END:variables

    private String convertMonthIntoString(String month) {
        return switch(month){
            case "Jan" -> "1";
            case "Feb" -> "2";
            case "Mar" -> "3";
            case "Apr" -> "4";
            case "May" -> "5";
            case "Jun" -> "6";
            case "Jul" -> "7";
            case "Aug" -> "8";
            case "Sep" -> "9";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "00";
        };
    }

    
}
