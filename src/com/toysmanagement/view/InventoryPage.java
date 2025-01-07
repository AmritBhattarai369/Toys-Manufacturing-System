package com.toysmanagement.view;

import com.toysmanagement.model.InventoryModel;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;



/**
 *
 * @LMUID 23048624
 * @author amritbhattarai
 */

public class InventoryPage extends javax.swing.JFrame {
    
    
    private final LinkedList<InventoryModel> inventoryList =new LinkedList<>();
    private DefaultTableModel defaultTableModel;
    /**
     * Creates new form inventory_page
     */
    public InventoryPage() {
        
    initComponents();
    addInitialInventoryData();
    
    }
    private Boolean createInventoryModel() {
    int ID = Integer.parseInt(fldAddInventoryId.getText());
    String Name = fldAddInventoryName.getText();
    String Category = fldAddInventoryCategory.getText();
    int Stock = Integer.parseInt(fldAddInventoryStock.getText());
    String Supplier = fldAddInventorySupplier.getText();
    int CPU = Integer.parseInt(fldAddInventoryCPU.getText());
    int TotalValue = Stock * CPU;

    InventoryModel newInventory = new InventoryModel(ID, Name, Category, Stock, Supplier, CPU, TotalValue);
    if (inventoryList.add(newInventory)) {
        loadInventoryListToTable();
        return true;
    } else {
        loadInventoryListToTable();
        return false;
    }
}
    private void loadInventoryListToTable() {
    DefaultTableModel model = (DefaultTableModel) tblInventoryMain.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    // Add rows from inventoryList
    for (InventoryModel inventory : inventoryList) {
        model.addRow(new Object[] {
            inventory.getInvItemId(),
            inventory.getInvItemName(),
            inventory.getInvItemCategory(),
            inventory.getInvItemStock(),
            inventory.getInvItemSupplier(),
            inventory.getInvItemCpu(),
            inventory.getInvItemTotalValue()
        });
    }
}
    private void addInitialInventoryData()
    {
        InventoryModel inventory1 = new InventoryModel(1, "Teddy Bear", "Stuffed Toys", 100, "Happy Toys Co.", 200, 20000);
        InventoryModel inventory2 = new InventoryModel(2, "Toy Car", "Vehicles", 150, "Speedy Wheels Ltd.", 120, 18000);
        InventoryModel inventory3 = new InventoryModel(3, "Dollhouse", "Roleplay", 50, "Dream Home Toys", 500, 25000);
        InventoryModel inventory4 = new InventoryModel(4, "Building Blocks", "Construction", 200, "Blocky Wonders", 150, 30000);
        InventoryModel inventory5 = new InventoryModel(5, "Remote Helicopter", "Electronic Toys", 80, "Fly High Corp.", 700, 56000);
        InventoryModel inventory6 = new InventoryModel(6, "Action Figure", "Action Figures", 120, "Heroic Ventures", 300, 36000);
        InventoryModel inventory7 = new InventoryModel(7, "Puzzle Set", "Educational Toys", 250, "Brain Boosters", 100, 25000);
        InventoryModel inventory8 = new InventoryModel(8, "Chess Board", "Board Games", 100, "Game Masters Inc.", 200, 20000);
        InventoryModel inventory9 = new InventoryModel(9, "Rubik's Cube", "Puzzles", 300, "Mind Twisters Ltd.", 50, 15000);
        InventoryModel inventory10 = new InventoryModel(10, "Water Gun", "Outdoor Toys", 180, "Splash Fun Co.", 150, 27000);
        InventoryModel inventory11 = new InventoryModel(11, "Toy Train", "Vehicles", 90, "Choo Choo Ltd.", 400, 36000);
        InventoryModel inventory12 = new InventoryModel(12, "Kitchen Playset", "Roleplay", 60, "Tiny Chefs Inc.", 600, 36000);
        InventoryModel inventory13 = new InventoryModel(13, "Stuffed Elephant", "Stuffed Toys", 130, "Happy Toys Co.", 220, 28600);
        InventoryModel inventory14 = new InventoryModel(14, "Bouncing Ball", "Outdoor Toys", 500, "Bounce World", 30, 15000);
        InventoryModel inventory15 = new InventoryModel(15, "Lego Set", "Construction", 75, "Blocky Wonders", 800, 60000);
        InventoryModel inventory16 = new InventoryModel(16, "Toy Robot", "Electronic Toys", 70, "Techie Toys Ltd.", 900, 63000);
        InventoryModel inventory17 = new InventoryModel(17, "Card Game", "Card Games", 200, "Game Masters Inc.", 90, 18000);
        InventoryModel inventory18 = new InventoryModel(18, "Slinky", "Classic Toys", 150, "Retro Fun Co.", 40, 6000);
        InventoryModel inventory19 = new InventoryModel(19, "Model Airplane", "Models", 50, "Airborne Models Ltd.", 1000, 50000);
        InventoryModel inventory20 = new InventoryModel(20, "Magic Kit", "Educational Toys", 80, "Brain Boosters", 350, 28000);

        // Add each inventory item to the database or list using addInventoryData
        addInventoryData(inventory1);
        addInventoryData(inventory2);
        addInventoryData(inventory3);
        addInventoryData(inventory4);
        addInventoryData(inventory5);
        addInventoryData(inventory6);
        addInventoryData(inventory7);
        addInventoryData(inventory8);
        addInventoryData(inventory9);
        addInventoryData(inventory10);
        addInventoryData(inventory11);
        addInventoryData(inventory12);
        addInventoryData(inventory13);
        addInventoryData(inventory14);
        addInventoryData(inventory15);
        addInventoryData(inventory16);
        addInventoryData(inventory17);
        addInventoryData(inventory18);
        addInventoryData(inventory19);
        addInventoryData(inventory20);
    }
    private void addInventoryData(InventoryModel inventory) {
    inventoryList.add(inventory);
    // Table add
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblInventoryMain.getModel();
    defaultTableModel.addRow(new Object[]{
        inventory.getInvItemId(),
        inventory.getInvItemName(),
        inventory.getInvItemCategory(),
        inventory.getInvItemStock(),
        inventory.getInvItemSupplier(),
        inventory.getInvItemCpu(),
        inventory.getInvItemTotalValue()
    });
}




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInventory = new javax.swing.JPanel();
        lblInventoryHead = new javax.swing.JLabel();
        btnProducts = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnEmp = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventoryMain = new javax.swing.JTable();
        lblAddInventory = new javax.swing.JLabel();
        lblAddInventoryId = new javax.swing.JLabel();
        fldAddInventoryId = new javax.swing.JTextField();
        lblAddInventoryName = new javax.swing.JLabel();
        fldAddInventoryName = new javax.swing.JTextField();
        lblAddInventoryCategory = new javax.swing.JLabel();
        fldAddInventoryCategory = new javax.swing.JTextField();
        lblAddInventoryStock = new javax.swing.JLabel();
        fldAddInventoryStock = new javax.swing.JTextField();
        lblAddInventorySupplier = new javax.swing.JLabel();
        fldAddInventorySupplier = new javax.swing.JTextField();
        lblAddInventoryCPU = new javax.swing.JLabel();
        btnAddInventory = new javax.swing.JButton();
        btnUpdateInventory = new javax.swing.JButton();
        fldAddInventoryCPU = new javax.swing.JTextField();
        lblRemInventoryHead = new javax.swing.JLabel();
        lblRemInventoryItemId = new javax.swing.JLabel();
        fldRemInventoryId = new javax.swing.JTextField();
        btnRemInventory = new javax.swing.JButton();
        lblSortByInventory = new javax.swing.JLabel();
        fldSearchProduct = new javax.swing.JTextField();
        lblSearchProduct = new javax.swing.JLabel();
        sortcomboInventory = new javax.swing.JComboBox<>();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInventoryHead.setFont(new java.awt.Font("Helvetica", 1, 72)); // NOI18N
        lblInventoryHead.setText("Inventory");
        pnlInventory.add(lblInventoryHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        btnProducts.setBackground(new java.awt.Color(51, 38, 35));
        btnProducts.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts.setText("Products");
        btnProducts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
        });
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        pnlInventory.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 50));

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
        pnlInventory.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 150, 50));

        btnEmp.setBackground(new java.awt.Color(51, 38, 35));
        btnEmp.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnEmp.setText("Employee");
        btnEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });
        pnlInventory.add(btnEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 150, 50));

        btnSupplier.setBackground(new java.awt.Color(51, 38, 35));
        btnSupplier.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setText("Suppliers");
        btnSupplier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        pnlInventory.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 50));

        tblInventoryMain.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tblInventoryMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Category", "Stock", "Supplier", "Cost Per Unit", "Total Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventoryMain);
        if (tblInventoryMain.getColumnModel().getColumnCount() > 0) {
            tblInventoryMain.getColumnModel().getColumn(0).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(0).setPreferredWidth(8);
            tblInventoryMain.getColumnModel().getColumn(1).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(1).setPreferredWidth(40);
            tblInventoryMain.getColumnModel().getColumn(2).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(3).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(3).setPreferredWidth(2);
            tblInventoryMain.getColumnModel().getColumn(4).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblInventoryMain.getColumnModel().getColumn(5).setResizable(false);
            tblInventoryMain.getColumnModel().getColumn(5).setPreferredWidth(4);
            tblInventoryMain.getColumnModel().getColumn(6).setResizable(false);
        }

        pnlInventory.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 760, 580));

        lblAddInventory.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddInventory.setText("Add Inventory");
        pnlInventory.add(lblAddInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        lblAddInventoryId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventoryId.setText("Item ID:");
        pnlInventory.add(lblAddInventoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, -1, 30));

        fldAddInventoryId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventoryId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventoryIdActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 60, 30));

        lblAddInventoryName.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventoryName.setText("Name:");
        pnlInventory.add(lblAddInventoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, -1, -1));

        fldAddInventoryName.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventoryName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventoryNameActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 140, 30));

        lblAddInventoryCategory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventoryCategory.setText("Category");
        pnlInventory.add(lblAddInventoryCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        fldAddInventoryCategory.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventoryCategory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventoryCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventoryCategoryActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventoryCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 140, 30));

        lblAddInventoryStock.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventoryStock.setText("Stock");
        pnlInventory.add(lblAddInventoryStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, -1, -1));

        fldAddInventoryStock.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventoryStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventoryStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventoryStockActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventoryStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 330, 140, 30));

        lblAddInventorySupplier.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventorySupplier.setText("Supplier:");
        pnlInventory.add(lblAddInventorySupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, -1, -1));

        fldAddInventorySupplier.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventorySupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventorySupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventorySupplierActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventorySupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 380, 140, 30));

        lblAddInventoryCPU.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddInventoryCPU.setText("Cost Per Unit");
        pnlInventory.add(lblAddInventoryCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, -1, 20));

        btnAddInventory.setBackground(new java.awt.Color(51, 38, 35));
        btnAddInventory.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnAddInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnAddInventory.setText("Add");
        btnAddInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInventoryActionPerformed(evt);
            }
        });
        pnlInventory.add(btnAddInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 80, 40));

        btnUpdateInventory.setBackground(new java.awt.Color(51, 38, 35));
        btnUpdateInventory.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnUpdateInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateInventory.setText("Update");
        btnUpdateInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInventoryActionPerformed(evt);
            }
        });
        pnlInventory.add(btnUpdateInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 110, 40));

        fldAddInventoryCPU.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddInventoryCPU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddInventoryCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddInventoryCPUActionPerformed(evt);
            }
        });
        pnlInventory.add(fldAddInventoryCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, 140, 30));

        lblRemInventoryHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblRemInventoryHead.setText("Remove Inventory");
        pnlInventory.add(lblRemInventoryHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 330, 40));

        lblRemInventoryItemId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblRemInventoryItemId.setText("Item ID:");
        pnlInventory.add(lblRemInventoryItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, -1, 30));

        fldRemInventoryId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldRemInventoryId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldRemInventoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldRemInventoryIdActionPerformed(evt);
            }
        });
        pnlInventory.add(fldRemInventoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, 60, 30));

        btnRemInventory.setBackground(new java.awt.Color(51, 38, 35));
        btnRemInventory.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRemInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnRemInventory.setText("Submit");
        btnRemInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemInventoryActionPerformed(evt);
            }
        });
        pnlInventory.add(btnRemInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 680, 150, 40));

        lblSortByInventory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSortByInventory.setText("Sort By");
        pnlInventory.add(lblSortByInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, -1, 30));

        fldSearchProduct.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldSearchProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSearchProductActionPerformed(evt);
            }
        });
        pnlInventory.add(fldSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 150, 30));

        lblSearchProduct.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSearchProduct.setText("Search");
        pnlInventory.add(lblSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 60, 30));

        sortcomboInventory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Selection Sort", "Insertion Sort", "Merge Sort" }));
        sortcomboInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboInventoryActionPerformed(evt);
            }
        });
        pnlInventory.add(sortcomboInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 150, -1));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/toysmanagement/resources/Background-Others.png"))); // NOI18N
        pnlInventory.add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
    this.setVisible(false);
    new EmployeePage().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
     this.setVisible(false);
     new SuppliersPage().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void fldAddInventoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventoryIdActionPerformed

    private void fldAddInventoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventoryNameActionPerformed

    private void fldAddInventoryCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventoryCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventoryCategoryActionPerformed

    private void fldAddInventoryStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventoryStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventoryStockActionPerformed

    private void fldAddInventorySupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventorySupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventorySupplierActionPerformed

    private void fldAddInventoryCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddInventoryCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddInventoryCPUActionPerformed

    private void fldRemInventoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemInventoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemInventoryIdActionPerformed

    private void btnRemInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemInventoryActionPerformed
    int invItemId = Integer.parseInt(fldRemInventoryId.getText());
       boolean isItemFound = false;

        for (InventoryModel product : inventoryList) {
            if (product.getInvItemId() == invItemId) {
                inventoryList.remove(product);
                loadInventoryListToTable();
                JOptionPane.showMessageDialog(this, "Product Removed", "Successful", JOptionPane.INFORMATION_MESSAGE);
                isItemFound = true;
                break; // Exit the loop since the item has been removed
            }
        }

        if (!isItemFound) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Inventory Item ID", "Failure", JOptionPane.INFORMATION_MESSAGE);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnRemInventoryActionPerformed

    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        this.setVisible(false);
        new ProductsPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductsMouseClicked

    private void btnAddInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInventoryActionPerformed
        if (fldAddInventoryId.getText().trim().isEmpty() ||
            fldAddInventoryName.getText().trim().isEmpty() ||
            fldAddInventoryCategory.getText().trim().isEmpty() ||
            fldAddInventoryStock.getText().trim().isEmpty() ||
            fldAddInventorySupplier.getText().trim().isEmpty() ||
            fldAddInventoryCPU.getText().trim().isEmpty() ||
            Integer.parseInt(fldAddInventoryId.getText().trim()) == 0 ||
            Integer.parseInt(fldAddInventoryStock.getText().trim()) == 0 ||
            Integer.parseInt(fldAddInventoryCPU.getText().trim()) == 0) {

            JOptionPane.showMessageDialog(this, "Please Fill All the Values", "Not Successful", JOptionPane.ERROR_MESSAGE);
        } else {
            if (createInventoryModel()) {
                JOptionPane.showMessageDialog(this, "Product Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Product not Added", "Not Successful", JOptionPane.ERROR_MESSAGE);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddInventoryActionPerformed

    private void btnUpdateInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInventoryActionPerformed
        int ID = Integer.parseInt(fldAddInventoryId.getText());
        String Name = fldAddInventoryName.getText();
        String Category = fldAddInventoryCategory.getText();
        int Stock = Integer.parseInt(fldAddInventoryStock.getText());
        String Supplier = fldAddInventorySupplier.getText();
        int CPU = Integer.parseInt(fldAddInventoryCPU.getText());

        for(InventoryModel product: inventoryList ){
            if(product.getInvItemId() == ID){
                product.setInvItemId(ID);
                product.setInvItemName(Name);
                product.setInvItemCategory(Category);
                product.setInvItemStock(Stock);
                product.setInvItemSupplier(Supplier);
                product.setInvItemCpu(CPU);

                loadInventoryListToTable();

                fldAddInventoryId.setText("");
                fldAddInventoryName.setText("");
                fldAddInventoryCategory.setText("");
                fldAddInventoryStock.setText("");
                fldAddInventorySupplier.setText("");
                fldAddInventoryCPU.setText("");
                
                
                JOptionPane.showMessageDialog(this, "Product Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

        }

        JOptionPane.showMessageDialog(this, "Product ID not found", "Failure", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateInventoryActionPerformed

    private void sortcomboInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortcomboInventoryActionPerformed

    private void fldSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSearchProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSearchProductActionPerformed

    private void addInventoryDataToTable(InventoryModel inventory) {
    inventoryList.add(inventory);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblInventoryMain.getModel();
    defaultTableModel.addRow(new Object[]{
        inventory.getInvItemId(),
        inventory.getInvItemName(),
        inventory.getInvItemCategory(),
        inventory.getInvItemStock(),
        inventory.getInvItemSupplier(),
        inventory.getInvItemCpu(),
        inventory.getInvItemTotalValue()
    });
}
private void registerInventory(InventoryModel inventory) {
    inventoryList.add(inventory);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblInventoryMain.getModel();
    defaultTableModel.addRow(new Object[]{
        inventory.getInvItemId(),
        inventory.getInvItemName(),
        inventory.getInvItemCategory(),
        inventory.getInvItemStock(),
        inventory.getInvItemSupplier(),
        inventory.getInvItemCpu(),
        inventory.getInvItemTotalValue()
    });
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
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.JButton btnAddInventory;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnRemInventory;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnUpdateInventory;
    private javax.swing.JTextField fldAddInventoryCPU;
    private javax.swing.JTextField fldAddInventoryCategory;
    private javax.swing.JTextField fldAddInventoryId;
    private javax.swing.JTextField fldAddInventoryName;
    private javax.swing.JTextField fldAddInventoryStock;
    private javax.swing.JTextField fldAddInventorySupplier;
    private javax.swing.JTextField fldRemInventoryId;
    private javax.swing.JTextField fldSearchProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddInventory;
    private javax.swing.JLabel lblAddInventoryCPU;
    private javax.swing.JLabel lblAddInventoryCategory;
    private javax.swing.JLabel lblAddInventoryId;
    private javax.swing.JLabel lblAddInventoryName;
    private javax.swing.JLabel lblAddInventoryStock;
    private javax.swing.JLabel lblAddInventorySupplier;
    private javax.swing.JLabel lblInventoryHead;
    private javax.swing.JLabel lblRemInventoryHead;
    private javax.swing.JLabel lblRemInventoryItemId;
    private javax.swing.JLabel lblSearchProduct;
    private javax.swing.JLabel lblSortByInventory;
    private javax.swing.JPanel pnlInventory;
    private javax.swing.JComboBox<String> sortcomboInventory;
    private javax.swing.JTable tblInventoryMain;
    // End of variables declaration//GEN-END:variables
}
