/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.toysmanagement.view;

/**
 *
 * @author amritbhattarai
 */
public class SuppliersPage extends javax.swing.JFrame {

    /**
     * Creates new form suppliers_page
     */
    public SuppliersPage() {
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

        pnlSuppliers = new javax.swing.JPanel();
        lblSupplierHead = new javax.swing.JLabel();
        btnProducts = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierMain = new javax.swing.JTable();
        lblAddSupplier = new javax.swing.JLabel();
        lblAddSupplierId = new javax.swing.JLabel();
        fldAddSupplierId = new javax.swing.JTextField();
        lblAddSupplierName = new javax.swing.JLabel();
        fldAddSupplierName = new javax.swing.JTextField();
        lblAddSupplierAddress = new javax.swing.JLabel();
        fldAddSupplierAddress = new javax.swing.JTextField();
        lblAddSupplierContact = new javax.swing.JLabel();
        fldAddSupplierContact = new javax.swing.JTextField();
        lblAddSupplierContactPerson = new javax.swing.JLabel();
        fldAddSupplierContactPerson = new javax.swing.JTextField();
        lblAddSupplierProduct = new javax.swing.JLabel();
        fldAddSupplierProduct = new javax.swing.JTextField();
        btnAddSupplier = new javax.swing.JButton();
        lblRemSuppliersHead = new javax.swing.JLabel();
        lblRemSuppliersId = new javax.swing.JLabel();
        fldRemSuppliersId = new javax.swing.JTextField();
        btnRemSupplier = new javax.swing.JButton();
        lblBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlSuppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSupplierHead.setFont(new java.awt.Font("Helvetica", 1, 72)); // NOI18N
        lblSupplierHead.setText("Suppliers");
        pnlSuppliers.add(lblSupplierHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        btnProducts.setBackground(new java.awt.Color(51, 38, 35));
        btnProducts.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts.setText("Products");
        btnProducts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 50));

        btnOrders.setBackground(new java.awt.Color(51, 38, 35));
        btnOrders.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setText("Orders");
        btnOrders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 150, 50));

        btnEmployee.setBackground(new java.awt.Color(51, 38, 35));
        btnEmployee.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setText("Employee");
        btnEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 150, 50));

        btnInventory.setBackground(new java.awt.Color(51, 38, 35));
        btnInventory.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("Inventory");
        btnInventory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 50));

        tblSupplierMain.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tblSupplierMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Name", "Contact Person", "Contact Number", "Product"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplierMain);

        pnlSuppliers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 760, 580));

        lblAddSupplier.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddSupplier.setText("Add Supplier");
        pnlSuppliers.add(lblAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        lblAddSupplierId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierId.setText("Supplier ID:");
        pnlSuppliers.add(lblAddSupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, -1, 30));

        fldAddSupplierId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierIdActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 60, 30));

        lblAddSupplierName.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierName.setText("Name:");
        pnlSuppliers.add(lblAddSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, -1, -1));

        fldAddSupplierName.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierNameActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 140, 30));

        lblAddSupplierAddress.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierAddress.setText("Address:");
        pnlSuppliers.add(lblAddSupplierAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        fldAddSupplierAddress.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierAddressActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 140, 30));

        lblAddSupplierContact.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierContact.setText("Contact Number:");
        pnlSuppliers.add(lblAddSupplierContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, -1));

        fldAddSupplierContact.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierContact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierContactActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 330, 140, 30));

        lblAddSupplierContactPerson.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierContactPerson.setText("Contact Person:");
        pnlSuppliers.add(lblAddSupplierContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, -1, -1));

        fldAddSupplierContactPerson.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierContactPerson.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierContactPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierContactPersonActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 380, 140, 30));

        lblAddSupplierProduct.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddSupplierProduct.setText("Product:");
        pnlSuppliers.add(lblAddSupplierProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, -1, 20));

        fldAddSupplierProduct.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddSupplierProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddSupplierProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddSupplierProductActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldAddSupplierProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, 140, 30));

        btnAddSupplier.setBackground(new java.awt.Color(51, 38, 35));
        btnAddSupplier.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnAddSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSupplier.setText("Submit");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 470, 150, 40));

        lblRemSuppliersHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblRemSuppliersHead.setText("Remove Supplier");
        pnlSuppliers.add(lblRemSuppliersHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 330, 40));

        lblRemSuppliersId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblRemSuppliersId.setText("Supplier ID:");
        pnlSuppliers.add(lblRemSuppliersId, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 580, -1, 30));

        fldRemSuppliersId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldRemSuppliersId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldRemSuppliersId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldRemSuppliersIdActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldRemSuppliersId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, 60, 30));

        btnRemSupplier.setBackground(new java.awt.Color(51, 38, 35));
        btnRemSupplier.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRemSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnRemSupplier.setText("Submit");
        btnRemSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemSupplierActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnRemSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 630, 150, 40));

        lblBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/toysmanagement/resources/Background-Others.png"))); // NOI18N
        pnlSuppliers.add(lblBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
    this.setVisible(false);
    new ProductsPage().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
    this.setVisible(false);
    new OrderPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
    this.setVisible(false);
    new EmployeePage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
    this.setVisible(false);
    new InventoryPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void fldAddSupplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierIdActionPerformed

    private void fldAddSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierNameActionPerformed

    private void fldAddSupplierAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierAddressActionPerformed

    private void fldAddSupplierContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierContactActionPerformed

    private void fldAddSupplierProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierProductActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void fldRemSuppliersIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemSuppliersIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemSuppliersIdActionPerformed

    private void fldAddSupplierContactPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierContactPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierContactPersonActionPerformed

    private void btnRemSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemSupplierActionPerformed

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
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuppliersPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnRemSupplier;
    private javax.swing.JTextField fldAddSupplierAddress;
    private javax.swing.JTextField fldAddSupplierContact;
    private javax.swing.JTextField fldAddSupplierContactPerson;
    private javax.swing.JTextField fldAddSupplierId;
    private javax.swing.JTextField fldAddSupplierName;
    private javax.swing.JTextField fldAddSupplierProduct;
    private javax.swing.JTextField fldRemSuppliersId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddSupplier;
    private javax.swing.JLabel lblAddSupplierAddress;
    private javax.swing.JLabel lblAddSupplierContact;
    private javax.swing.JLabel lblAddSupplierContactPerson;
    private javax.swing.JLabel lblAddSupplierId;
    private javax.swing.JLabel lblAddSupplierName;
    private javax.swing.JLabel lblAddSupplierProduct;
    private javax.swing.JLabel lblBgImg;
    private javax.swing.JLabel lblRemSuppliersHead;
    private javax.swing.JLabel lblRemSuppliersId;
    private javax.swing.JLabel lblSupplierHead;
    private javax.swing.JPanel pnlSuppliers;
    private javax.swing.JTable tblSupplierMain;
    // End of variables declaration//GEN-END:variables
}
