package com.toysmanagement.view;

import com.toysmanagement.model.SupplierModel;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @LMUID 23048624
 * @author amritbhattarai
 */
public class SuppliersPage extends javax.swing.JFrame {
    
    private final LinkedList<SupplierModel> supplierList = new LinkedList<>();
    private DefaultTableModel defaultTableModel;
    /**
     * Creates new form suppliers_page
     */
    public SuppliersPage() {
        initComponents();
        addInitialSupplierData();
    }
    private void registerSupplier(SupplierModel supplier) {
    supplierList.add(supplier);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblSupplierMain.getModel();
    defaultTableModel.addRow(new Object[]{
        supplier.getSuppId(),
        supplier.getSuppName(),
        supplier.getSuppAddress(),
        supplier.getSuppContactNum(),
        supplier.getSuppContactPerson(),
        supplier.getSuppProduct()
    });
}
private void addSupplierDataToTable(SupplierModel supplier) {
    supplierList.add(supplier);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblSupplierMain.getModel();
    defaultTableModel.addRow(new Object[]{
        supplier.getSuppId(),
        supplier.getSuppName(),
        supplier.getSuppAddress(),
        supplier.getSuppContactNum(),
        supplier.getSuppContactPerson(),
        supplier.getSuppProduct()
    });
}
    private Boolean createSupplierModel() {
    int suppId = Integer.parseInt(fldAddSupplierId.getText());
    String suppName = fldAddSupplierName.getText();
    String suppAddress = fldAddSupplierAddress.getText();
    String suppContactNum = fldAddSupplierContact.getText();
    String suppContactPerson = fldAddSupplierContactPerson.getText();
    String suppProduct = fldAddSupplierProduct.getText();

    SupplierModel newSupplier = new SupplierModel(suppId, suppName, suppAddress, suppContactNum, suppContactPerson, suppProduct);
    if (supplierList.add(newSupplier)) {
        loadSupplierListToTable();
        return true;
    } else {
        loadSupplierListToTable();
        return false;
    }
}
    private void loadSupplierListToTable() {
    DefaultTableModel model = (DefaultTableModel) tblSupplierMain.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    // Add rows from supplierList
    for (SupplierModel supplier : supplierList) {
        model.addRow(new Object[] {
            supplier.getSuppId(),
            supplier.getSuppName(),
            supplier.getSuppAddress(),
            supplier.getSuppContactNum(),
            supplier.getSuppContactPerson(),
            supplier.getSuppProduct()
        });
    }
}
    private void addInitialSupplierData() {
    SupplierModel supplier1 = new SupplierModel(1, "Happy Toys Co.", "123 Elm St, Springfield", "1234567890", "John Doe", "Stuffed Toys");
    SupplierModel supplier2 = new SupplierModel(2, "Speedy Wheels Ltd.", "456 Oak St, Springfield", "9876543210", "Jane Smith", "Toy Cars");
    SupplierModel supplier3 = new SupplierModel(3, "Dream Home Toys", "789 Pine St, Springfield", "4567890123", "Alice Johnson", "Dollhouses");
    SupplierModel supplier4 = new SupplierModel(4, "Blocky Wonders", "321 Maple St, Springfield", "6543219870", "Mike Brown", "Building Blocks");
    SupplierModel supplier5 = new SupplierModel(5, "Fly High Corp.", "654 Birch St, Springfield", "3216540987", "Laura Wilson", "Remote Helicopters");
    SupplierModel supplier6 = new SupplierModel(6, "Heroic Ventures", "987 Cedar St, Springfield", "7890123456", "James White", "Action Figures");
    SupplierModel supplier7 = new SupplierModel(7, "Brain Boosters", "159 Walnut St, Springfield", "1239876543", "Emma Green", "Educational Toys");
    SupplierModel supplier8 = new SupplierModel(8, "Game Masters Inc.", "753 Willow St, Springfield", "3456789012", "Oliver Taylor", "Board Games");
    SupplierModel supplier9 = new SupplierModel(9, "Mind Twisters Ltd.", "357 Chestnut St, Springfield", "6789012345", "Sophia Moore", "Puzzles");
    SupplierModel supplier10 = new SupplierModel(10, "Splash Fun Co.", "951 Redwood St, Springfield", "9012345678", "Liam Harris", "Water Guns");
    SupplierModel supplier11 = new SupplierModel(11, "Choo Choo Ltd.", "159 Sycamore St, Springfield", "2345678901", "Mason Martin", "Toy Trains");
    SupplierModel supplier12 = new SupplierModel(12, "Tiny Chefs Inc.", "357 Spruce St, Springfield", "5678901234", "Isabella Lee", "Kitchen Playsets");
    SupplierModel supplier13 = new SupplierModel(13, "Bounce World", "753 Palm St, Springfield", "8901234567", "Elijah Walker", "Bouncing Balls");
    SupplierModel supplier14 = new SupplierModel(14, "Retro Fun Co.", "951 Poplar St, Springfield", "1235678904", "Charlotte Hall", "Slinkies");
    SupplierModel supplier15 = new SupplierModel(15, "Techie Toys Ltd.", "357 Fir St, Springfield", "5672346789", "Ethan Young", "Toy Robots");
    SupplierModel supplier16 = new SupplierModel(16, "Airborne Models Ltd.", "159 Ash St, Springfield", "3456781234", "Amelia King", "Model Airplanes");
    SupplierModel supplier17 = new SupplierModel(17, "Creative Supplies Co.", "753 Cypress St, Springfield", "6781234560", "Lucas Adams", "Card Games");
    SupplierModel supplier18 = new SupplierModel(18, "Puzzle Masters", "951 Mahogany St, Springfield", "9014567890", "Mia Scott", "Puzzles");
    SupplierModel supplier19 = new SupplierModel(19, "Hero Supplies Inc.", "357 Alder St, Springfield", "1236789014", "Henry Carter", "Action Figures");
    SupplierModel supplier20 = new SupplierModel(20, "Brainstorm Toys", "753 Beech St, Springfield", "5678904567", "Olivia Evans", "Educational Toys");

    // Add each supplier to the database or list using addSupplierData
    addSupplierData(supplier1);
    addSupplierData(supplier2);
    addSupplierData(supplier3);
    addSupplierData(supplier4);
    addSupplierData(supplier5);
    addSupplierData(supplier6);
    addSupplierData(supplier7);
    addSupplierData(supplier8);
    addSupplierData(supplier9);
    addSupplierData(supplier10);
    addSupplierData(supplier11);
    addSupplierData(supplier12);
    addSupplierData(supplier13);
    addSupplierData(supplier14);
    addSupplierData(supplier15);
    addSupplierData(supplier16);
    addSupplierData(supplier17);
    addSupplierData(supplier18);
    addSupplierData(supplier19);
    addSupplierData(supplier20);
}


private void addSupplierData(SupplierModel supplier) {
    supplierList.add(supplier);
    // Table add
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblSupplierMain.getModel();
    defaultTableModel.addRow(new Object[]{
        supplier.getSuppId(),
        supplier.getSuppName(),
        supplier.getSuppAddress(),
        supplier.getSuppContactNum(),
        supplier.getSuppContactPerson(),
        supplier.getSuppProduct()
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
        btnUpdateSupplier = new javax.swing.JButton();
        lblRemSuppliersHead = new javax.swing.JLabel();
        lblRemSuppliersId = new javax.swing.JLabel();
        fldRemSuppliersId = new javax.swing.JTextField();
        btnRemSupplier = new javax.swing.JButton();
        lblSearchOrder = new javax.swing.JLabel();
        fldSearchOrder = new javax.swing.JTextField();
        sortcomboInventory = new javax.swing.JComboBox<>();
        lblSortByInventory = new javax.swing.JLabel();
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

            },
            new String [] {
                "Supplier ID", "Name", "Address", "Contact Person", "Contact Number", "Product"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSupplierMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSupplierMain);

        pnlSuppliers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 760, 580));

        lblAddSupplier.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddSupplier.setText("Add / Update Supplier");
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
        btnAddSupplier.setText("Add");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, 110, 40));

        btnUpdateSupplier.setBackground(new java.awt.Color(51, 38, 35));
        btnUpdateSupplier.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnUpdateSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSupplier.setText("Update");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });
        pnlSuppliers.add(btnUpdateSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 470, 110, 40));

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

        lblSearchOrder.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSearchOrder.setText("Search");
        pnlSuppliers.add(lblSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, -1, 30));

        fldSearchOrder.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldSearchOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldSearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSearchOrderActionPerformed(evt);
            }
        });
        pnlSuppliers.add(fldSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 150, 30));

        sortcomboInventory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Selection Sort", "Insertion Sort", "Merge Sort" }));
        sortcomboInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboInventoryActionPerformed(evt);
            }
        });
        pnlSuppliers.add(sortcomboInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, 150, -1));

        lblSortByInventory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSortByInventory.setText("Sort By");
        pnlSuppliers.add(lblSortByInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, -1, 30));

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
    if (fldAddSupplierId.getText().trim().isEmpty() || 
    fldAddSupplierName.getText().trim().isEmpty() || 
    fldAddSupplierAddress.getText().trim().isEmpty() || 
    fldAddSupplierContact.getText().trim().isEmpty() || 
    fldAddSupplierContactPerson.getText().trim().isEmpty() || 
    fldAddSupplierProduct.getText().trim().isEmpty() || 
    Integer.parseInt(fldAddSupplierId.getText().trim()) == 0) {
        
    JOptionPane.showMessageDialog(this, "Please Fill All the Values", "Not Successful", JOptionPane.ERROR_MESSAGE);
} else {
    if (createSupplierModel()) {
        JOptionPane.showMessageDialog(this, "Supplier Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Supplier not Added", "Not Successful", JOptionPane.ERROR_MESSAGE);
    }
}

// TODO add your handling code here:
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void fldRemSuppliersIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemSuppliersIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemSuppliersIdActionPerformed

    private void fldAddSupplierContactPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddSupplierContactPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddSupplierContactPersonActionPerformed

    private void btnRemSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemSupplierActionPerformed
    int supplierId = Integer.parseInt(fldRemSupplierId.getText());
boolean isSupplierFound = false;

for (SupplierModel supplier : supplierList) {
    if (supplier.getSuppId() == supplierId) {
        supplierList.remove(supplier);
        loadSupplierListToTable();
        JOptionPane.showMessageDialog(this, "Supplier Removed", "Successful", JOptionPane.INFORMATION_MESSAGE);
        isSupplierFound = true;
        break; // Exit the loop since the supplier has been removed
    }
}

if (!isSupplierFound) {
    JOptionPane.showMessageDialog(this, "Please enter a valid supplier ID", "Failure", JOptionPane.INFORMATION_MESSAGE);
}

// TODO add your handling code here:
    }//GEN-LAST:event_btnRemSupplierActionPerformed

    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        int suppId = Integer.parseInt(fldAddSupplierId.getText());
        String suppName = fldAddSupplierName.getText();
        String suppAddress = fldAddSupplierAddress.getText();
        String suppContactNum = fldAddSupplierContact.getText();
        String suppContactPerson = fldAddSupplierContactPerson.getText();
        String suppProduct = fldAddSupplierProduct.getText();

    for(SupplierModel supplier : supplierList) {
            if(supplier.getSuppId() == suppId) {
                supplier.setSuppId(suppId);
                supplier.setSuppName(suppName);
                supplier.setSuppAddress(suppAddress);
                supplier.setSuppContactNum(suppContactNum);
                supplier.setSuppContactPerson(suppContactPerson);
                supplier.setSuppProduct(suppProduct);

                loadSupplierListToTable();

                fldAddSupplierId.setText("");
                fldAddSupplierName.setText("");
                fldAddSupplierAddress.setText("");
                fldAddSupplierContact.setText("");
                fldAddSupplierContactPerson.setText("");
                fldAddSupplierProduct.setText("");

                JOptionPane.showMessageDialog(this, "Supplier Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    JOptionPane.showMessageDialog(this, "Supplier ID not found", "Failure", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed

    private void tblSupplierMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMainMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) tblSupplierMain.getModel();
        int selectedRowIndex = tblSupplierMain.getSelectedRow();
        System.out.println(selectedRowIndex);

        fldAddSupplierId.setText(tableModel.getValueAt(selectedRowIndex, 0).toString());
        fldAddSupplierName.setText(tableModel.getValueAt(selectedRowIndex, 1).toString());
        fldAddSupplierAddress.setText(tableModel.getValueAt(selectedRowIndex, 2).toString());
        fldAddSupplierContact.setText(tableModel.getValueAt(selectedRowIndex, 3).toString());
        fldAddSupplierContactPerson.setText(tableModel.getValueAt(selectedRowIndex, 4).toString());
        fldAddSupplierProduct.setText(tableModel.getValueAt(selectedRowIndex, 5).toString());
// TODO add your handling code here:

        // TODO add your handling code here:
    }                                        
    
// TODO add your handling code here:
    }//GEN-LAST:event_tblSupplierMainMouseClicked

    private void fldSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSearchOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSearchOrderActionPerformed

    private void sortcomboInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortcomboInventoryActionPerformed

    

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
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JTextField fldAddSupplierAddress;
    private javax.swing.JTextField fldAddSupplierContact;
    private javax.swing.JTextField fldAddSupplierContactPerson;
    private javax.swing.JTextField fldAddSupplierId;
    private javax.swing.JTextField fldAddSupplierName;
    private javax.swing.JTextField fldAddSupplierProduct;
    private javax.swing.JTextField fldRemSuppliersId;
    private javax.swing.JTextField fldSearchOrder;
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
    private javax.swing.JLabel lblSearchOrder;
    private javax.swing.JLabel lblSortByInventory;
    private javax.swing.JLabel lblSupplierHead;
    private javax.swing.JPanel pnlSuppliers;
    private javax.swing.JComboBox<String> sortcomboInventory;
    private javax.swing.JTable tblSupplierMain;
    // End of variables declaration//GEN-END:variables

