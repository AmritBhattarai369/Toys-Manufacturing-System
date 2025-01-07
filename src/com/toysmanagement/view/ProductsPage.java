/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.toysmanagement.view;

import com.toysmanagement.model.ProductModel;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @LMUID 23048624
 * @author amritbhattarai
 */
public class ProductsPage extends javax.swing.JFrame {

private final LinkedList<ProductModel> productList = new LinkedList<>();
private DefaultTableModel defaultTableModel;

/**
 * Creates new form product_page
 */
public ProductsPage() {
    initComponents();
    addInitialProductData();
}

private Boolean createProductModel() {
    int ID = Integer.parseInt(fldAddProductId.getText());
    String Name = fldAddProductName.getText();
    String Category = fldAddProductCategory.getText();
    String Supplier = fldAddProductSupplier.getText();
    int Quantity = Integer.parseInt(fldAddProductQuantity.getText());
    int CPU = Integer.parseInt(fldAddProductCPU.getText());
    int TotalValue = Quantity * CPU;

    ProductModel newProduct = new ProductModel(ID, Name, Category, Supplier, Quantity, CPU, TotalValue);
    if (productList.add(newProduct)) {
        loadProductListToTable();
        return true;
    } else {
        loadProductListToTable();
        return false;
    }
}

private void loadProductListToTable() {
    DefaultTableModel model = (DefaultTableModel) tblProductMain.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    // Add rows from productList
    for (ProductModel product : productList) {
        model.addRow(new Object[] {
            product.getProdId(),
            product.getProdName(),
            product.getProdCategory(),
            product.getProdSupplier(),
            product.getProdQuantity(),
            product.getProdCpu(),
            product.getProdTotalValue()
        });
    }
}
private void addInitialProductData()
{
        ProductModel product1 = new ProductModel(1, "Teddy Bear", "Stuffed Toys", "Happy Toys Co.", 100, 200, 20000);
        ProductModel product2 = new ProductModel(2, "Toy Car", "Vehicles", "Speedy Wheels Ltd.", 150, 120, 18000);
        ProductModel product3 = new ProductModel(3, "Dollhouse", "Roleplay", "Dream Home Toys", 50, 500, 25000);
        ProductModel product4 = new ProductModel(4, "Building Blocks", "Construction", "Blocky Wonders", 200, 150, 30000);
        ProductModel product5 = new ProductModel(5, "Remote Helicopter", "Electronic Toys", "Fly High Corp.", 80, 700, 56000);
        ProductModel product6 = new ProductModel(6, "Action Figure", "Action Figures", "Heroic Ventures", 120, 300, 36000);
        ProductModel product7 = new ProductModel(7, "Puzzle Set", "Educational Toys", "Brain Boosters", 250, 100, 25000);
        ProductModel product8 = new ProductModel(8, "Chess Board", "Board Games", "Game Masters Inc.", 100, 200, 20000);
        ProductModel product9 = new ProductModel(9, "Rubik's Cube", "Puzzles", "Mind Twisters Ltd.", 300, 50, 15000);
        ProductModel product10 = new ProductModel(10, "Water Gun", "Outdoor Toys", "Splash Fun Co.", 180, 150, 27000);
        ProductModel product11 = new ProductModel(11, "Toy Train", "Vehicles", "Choo Choo Ltd.", 90, 400, 36000);
        ProductModel product12 = new ProductModel(12, "Kitchen Playset", "Roleplay", "Tiny Chefs Inc.", 60, 600, 36000);
        ProductModel product13 = new ProductModel(13, "Stuffed Elephant", "Stuffed Toys", "Happy Toys Co.", 130, 220, 28600);
        ProductModel product14 = new ProductModel(14, "Bouncing Ball", "Outdoor Toys", "Bounce World", 500, 30, 15000);
        ProductModel product15 = new ProductModel(15, "Lego Set", "Construction", "Blocky Wonders", 75, 800, 60000);
        ProductModel product16 = new ProductModel(16, "Toy Robot", "Electronic Toys", "Techie Toys Ltd.", 70, 900, 63000);
        ProductModel product17 = new ProductModel(17, "Card Game", "Card Games", "Game Masters Inc.", 200, 90, 18000);
        ProductModel product18 = new ProductModel(18, "Slinky", "Classic Toys", "Retro Fun Co.", 150, 40, 6000);
        ProductModel product19 = new ProductModel(19, "Model Airplane", "Models", "Airborne Models Ltd.", 50, 1000, 50000);
        ProductModel product20 = new ProductModel(20, "Magic Kit", "Educational Toys", "Brain Boosters", 80, 350, 28000);

        // Add each product to the database or list using addProductData
        addProductData(product1);
        addProductData(product2);
        addProductData(product3);
        addProductData(product4);
        addProductData(product5);
        addProductData(product6);
        addProductData(product7);
        addProductData(product8);
        addProductData(product9);
        addProductData(product10);
        addProductData(product11);
        addProductData(product12);
        addProductData(product13);
        addProductData(product14);
        addProductData(product15);
        addProductData(product16);
        addProductData(product17);
        addProductData(product18);
        addProductData(product19);
        addProductData(product20);
}

private void addProductData(ProductModel product) {
    productList.add(product);
    // Table add
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblProductMain.getModel();
    defaultTableModel.addRow(new Object[]{
        product.getProdId(),
        product.getProdName(),
        product.getProdCategory(),
        product.getProdSupplier(),
        product.getProdQuantity(),
        product.getProdCpu(),
        product.getProdTotalValue()
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

        pnlProducts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductMain = new javax.swing.JTable();
        lblProductsHead = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        lblAddProducts = new javax.swing.JLabel();
        lblAddProductId = new javax.swing.JLabel();
        fldAddProductId = new javax.swing.JTextField();
        lblAddProductName = new javax.swing.JLabel();
        fldAddProductName = new javax.swing.JTextField();
        lblAddProductCategory = new javax.swing.JLabel();
        fldAddProductCategory = new javax.swing.JTextField();
        lblAddProductSupplier = new javax.swing.JLabel();
        fldAddProductSupplier = new javax.swing.JTextField();
        lblAddProductQuantity = new javax.swing.JLabel();
        fldAddProductQuantity = new javax.swing.JTextField();
        lblAddProductCPU = new javax.swing.JLabel();
        fldAddProductCPU = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        lblRemProductHead = new javax.swing.JLabel();
        lblRemProductId = new javax.swing.JLabel();
        fldRemProductId = new javax.swing.JTextField();
        btnRemOrder = new javax.swing.JButton();
        lblSearchProduct = new javax.swing.JLabel();
        fldSearchProduct = new javax.swing.JTextField();
        lblSortByProduct = new javax.swing.JLabel();
        sortcomboProduct = new javax.swing.JComboBox<>();
        lblBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 228, 204));

        pnlProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductMain.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tblProductMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Category", "Supplier", "Quantity", "Cost Per Unit", "Total Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductMain);
        if (tblProductMain.getColumnModel().getColumnCount() > 0) {
            tblProductMain.getColumnModel().getColumn(0).setResizable(false);
            tblProductMain.getColumnModel().getColumn(1).setResizable(false);
            tblProductMain.getColumnModel().getColumn(2).setResizable(false);
            tblProductMain.getColumnModel().getColumn(3).setResizable(false);
            tblProductMain.getColumnModel().getColumn(4).setResizable(false);
            tblProductMain.getColumnModel().getColumn(6).setResizable(false);
        }

        pnlProducts.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 760, 580));

        lblProductsHead.setFont(new java.awt.Font("Helvetica", 1, 72)); // NOI18N
        lblProductsHead.setText("Products");
        pnlProducts.add(lblProductsHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

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
        pnlProducts.add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 50));

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
        pnlProducts.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 50));

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
        pnlProducts.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 150, 50));

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
        pnlProducts.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 50));

        lblAddProducts.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddProducts.setText("Add / Update Products");
        pnlProducts.add(lblAddProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        lblAddProductId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductId.setText("Product Id");
        pnlProducts.add(lblAddProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, -1, 30));

        fldAddProductId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductIdActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 60, 30));

        lblAddProductName.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductName.setText("Name");
        pnlProducts.add(lblAddProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, -1, -1));

        fldAddProductName.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductNameActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 140, 30));

        lblAddProductCategory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductCategory.setText("Category");
        pnlProducts.add(lblAddProductCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, -1, -1));

        fldAddProductCategory.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductCategory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductCategoryActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 140, 30));

        lblAddProductSupplier.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductSupplier.setText("Supplier");
        pnlProducts.add(lblAddProductSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, -1, -1));

        fldAddProductSupplier.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductSupplierActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 330, 140, 30));

        lblAddProductQuantity.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductQuantity.setText("Quantity");
        pnlProducts.add(lblAddProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, -1, -1));

        fldAddProductQuantity.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductQuantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductQuantityActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 370, 140, 30));

        lblAddProductCPU.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddProductCPU.setText("Cost Per Unit");
        pnlProducts.add(lblAddProductCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, -1, 20));

        fldAddProductCPU.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddProductCPU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddProductCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddProductCPUActionPerformed(evt);
            }
        });
        pnlProducts.add(fldAddProductCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 140, 30));

        btnAddProduct.setBackground(new java.awt.Color(51, 38, 35));
        btnAddProduct.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("Add");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        pnlProducts.add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 80, 40));

        btnUpdateProduct.setBackground(new java.awt.Color(51, 38, 35));
        btnUpdateProduct.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnUpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });
        pnlProducts.add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 110, 40));

        lblRemProductHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblRemProductHead.setText("Remove Product");
        pnlProducts.add(lblRemProductHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 330, 40));

        lblRemProductId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblRemProductId.setText("Product Id:");
        pnlProducts.add(lblRemProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, -1, 30));

        fldRemProductId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldRemProductId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldRemProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldRemProductIdActionPerformed(evt);
            }
        });
        pnlProducts.add(fldRemProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 610, 60, 30));

        btnRemOrder.setBackground(new java.awt.Color(51, 38, 35));
        btnRemOrder.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRemOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnRemOrder.setText("Submit");
        btnRemOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemOrderActionPerformed(evt);
            }
        });
        pnlProducts.add(btnRemOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 150, 40));

        lblSearchProduct.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSearchProduct.setText("Search");
        pnlProducts.add(lblSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, 30));

        fldSearchProduct.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldSearchProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSearchProductActionPerformed(evt);
            }
        });
        pnlProducts.add(fldSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 150, 30));

        lblSortByProduct.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSortByProduct.setText("Sort By");
        pnlProducts.add(lblSortByProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, -1, 30));

        sortcomboProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Selection Sort", "Insertion Sort", "Merge Sort" }));
        sortcomboProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboProductActionPerformed(evt);
            }
        });
        pnlProducts.add(sortcomboProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, 150, -1));

        lblBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/toysmanagement/resources/Background-Others.png"))); // NOI18N
        pnlProducts.add(lblBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
    this.setVisible(false);
    new InventoryPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

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

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
    this.setVisible(false);
    new SuppliersPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void fldAddProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductIdActionPerformed

    private void fldAddProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductNameActionPerformed

    private void fldAddProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductCategoryActionPerformed

    private void fldAddProductSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductSupplierActionPerformed

    private void fldAddProductQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductQuantityActionPerformed

    private void fldAddProductCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddProductCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddProductCPUActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if (fldAddProductId.getText().trim().isEmpty() || 
            fldAddProductName.getText().trim().isEmpty() || 
            fldAddProductCategory.getText().trim().isEmpty() || 
            fldAddProductQuantity.getText().trim().isEmpty() || 
            fldAddProductSupplier.getText().trim().isEmpty() || 
            fldAddProductCPU.getText().trim().isEmpty() ||
            Integer.parseInt(fldAddProductId.getText().trim()) == 0 || 
            Integer.parseInt(fldAddProductQuantity.getText().trim()) == 0 || 
            Integer.parseInt(fldAddProductCPU.getText().trim()) == 0) {
        
    JOptionPane.showMessageDialog(this, "Please Fill All the Values", "Not Successful", JOptionPane.ERROR_MESSAGE);
} else {
    if (createProductModel()) {
        JOptionPane.showMessageDialog(this, "Product Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Product not Added", "Not Successful", JOptionPane.ERROR_MESSAGE);
    }
}


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void fldRemProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemProductIdActionPerformed

    private void btnRemOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemOrderActionPerformed
       int productId = Integer.parseInt(fldRemProductId.getText());
       boolean isProductFound = false;

        for (ProductModel product : productList) {
            if (product.getProdId() == productId) {
                productList.remove(product);
                loadProductListToTable();
                JOptionPane.showMessageDialog(this, "Product Removed", "Successful", JOptionPane.INFORMATION_MESSAGE);
                isProductFound = true;
                break; // Exit the loop since the product has been removed
            }
        }

            if (!isProductFound) {
                JOptionPane.showMessageDialog(this, "Please enter a valid product ID", "Failure", JOptionPane.INFORMATION_MESSAGE);
            }


       
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemOrderActionPerformed

    private void tblProductMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMainMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) tblProductMain.getModel();
        int selectedRowIndex = tblProductMain.getSelectedRow();
        System.out.println(selectedRowIndex);

        fldAddProductId.setText(tableModel.getValueAt(selectedRowIndex, 0).toString());
        fldAddProductName.setText(tableModel.getValueAt(selectedRowIndex, 1).toString());
        fldAddProductCategory.setText(tableModel.getValueAt(selectedRowIndex, 2).toString());
        fldAddProductSupplier.setText(tableModel.getValueAt(selectedRowIndex, 3).toString());
        fldAddProductQuantity.setText(tableModel.getValueAt(selectedRowIndex, 4).toString());
        fldAddProductCPU.setText(tableModel.getValueAt(selectedRowIndex, 5).toString());

// TODO add your handling code here:
    }//GEN-LAST:event_tblProductMainMouseClicked

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        int ID = Integer.parseInt(fldAddProductId.getText());
        String Name = fldAddProductName.getText();
        String Category = fldAddProductCategory.getText();
        String Supplier = fldAddProductSupplier.getText();
        int Quantity = Integer.parseInt(fldAddProductQuantity.getText());
        int CPU = Integer.parseInt(fldAddProductCPU.getText());
        int TotalValue = Quantity * CPU;
        
        for(ProductModel product: productList ){
            if(product.getProdId() == ID){
                product.setProdId(ID);
                product.setProdName(Name);
                product.setProdQuantity(Quantity);
                product.setProdSupplier(Supplier);
                product.setProdTotalValue(TotalValue);
                product.setProdCpu(CPU);
                product.setProdCategory(Category);
                
                loadProductListToTable();

                
                fldAddProductId.setText("");
                fldAddProductName.setText("");
                fldAddProductQuantity.setText("");
                fldAddProductSupplier.setText("");
                fldAddProductCPU.setText("");
                fldAddProductCategory.setText("");
                
                              
                JOptionPane.showMessageDialog(this, "Product Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
        }       JOptionPane.showMessageDialog(this, "Product ID not found", "Failure", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void fldSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSearchProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSearchProductActionPerformed

    private void sortcomboProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortcomboProductActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnRemOrder;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JTextField fldAddProductCPU;
    private javax.swing.JTextField fldAddProductCategory;
    private javax.swing.JTextField fldAddProductId;
    private javax.swing.JTextField fldAddProductName;
    private javax.swing.JTextField fldAddProductQuantity;
    private javax.swing.JTextField fldAddProductSupplier;
    private javax.swing.JTextField fldRemProductId;
    private javax.swing.JTextField fldSearchProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddProductCPU;
    private javax.swing.JLabel lblAddProductCategory;
    private javax.swing.JLabel lblAddProductId;
    private javax.swing.JLabel lblAddProductName;
    private javax.swing.JLabel lblAddProductQuantity;
    private javax.swing.JLabel lblAddProductSupplier;
    private javax.swing.JLabel lblAddProducts;
    private javax.swing.JLabel lblBgImg;
    private javax.swing.JLabel lblProductsHead;
    private javax.swing.JLabel lblRemProductHead;
    private javax.swing.JLabel lblRemProductId;
    private javax.swing.JLabel lblSearchProduct;
    private javax.swing.JLabel lblSortByProduct;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JComboBox<String> sortcomboProduct;
    private javax.swing.JTable tblProductMain;
    // End of variables declaration//GEN-END:variables
}
