/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.toysmanagement.view;

import com.toysmanagement.model.OrderModel;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @LMUID 23048624
 * @author amritbhattarai
 */
public class OrderPage extends javax.swing.JFrame {
    
    private final LinkedList<OrderModel> orderList = new LinkedList<>();
    private DefaultTableModel defaultTableModel;

    /**
     * Creates new form order_page
     */
    public OrderPage() {
        initComponents();
        addInitialOrderData();
    }
    
    private Boolean createOrderModel() {
    int ID = Integer.parseInt(fldAddOrderId.getText());
    String Customer = fldAddOrderCust.getText();
    String Type = fldAddOrderType.getText();
    String Items = fldAddOrderItems.getText();
    int Quantity = Integer.parseInt(fldAddOrderQuantity.getText());
    String Suppliers = fldAddOrderSupplier.getText();
    int CPU = Integer.parseInt(fldAddOrderCPU.getText());

    OrderModel newOrder = new OrderModel(ID, Customer, Type, Items, Quantity, Suppliers, CPU);
    if (orderList.add(newOrder)) {
        loadOrderListToTable();
        return true;
    } else {
        loadOrderListToTable();
        return false;
    }
}

private void loadOrderListToTable() {
    DefaultTableModel model = (DefaultTableModel) tblOrderMain.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    // Add rows from orderList
    for (OrderModel order : orderList) {
        model.addRow(new Object[] {
            order.getOrdId(),
            order.getOrdCust(),
            order.getOrdType(),
            order.getOrdItems(),
            order.getOrdSuppliers(),
            order.getOrdCPU()
        });
    }
}
private void addInitialOrderData()
{
        OrderModel order1 = new OrderModel(1, "John Doe", "Bulk", "Toy Cars", 100, "Speedy Wheels Ltd.", 120);
        OrderModel order2 = new OrderModel(2, "Jane Smith", "Retail", "Building Blocks", 50, "Blocky Wonders", 150);
        OrderModel order3 = new OrderModel(3, "Alice Johnson", "Wholesale", "Dollhouses", 20, "Dream Home Toys", 500);
        OrderModel order4 = new OrderModel(4, "Mike Brown", "Retail", "Rubik's Cubes", 75, "Mind Twisters Ltd.", 50);
        OrderModel order5 = new OrderModel(5, "Laura Wilson", "Bulk", "Teddy Bears", 200, "Happy Toys Co.", 200);
        OrderModel order6 = new OrderModel(6, "James White", "Wholesale", "Remote Helicopters", 40, "Fly High Corp.", 700);
        OrderModel order7 = new OrderModel(7, "Emma Green", "Retail", "Action Figures", 150, "Heroic Ventures", 300);
        OrderModel order8 = new OrderModel(8, "Oliver Taylor", "Bulk", "Water Guns", 180, "Splash Fun Co.", 150);
        OrderModel order9 = new OrderModel(9, "Sophia Moore", "Retail", "Chess Boards", 100, "Game Masters Inc.", 200);
        OrderModel order10 = new OrderModel(10, "Liam Harris", "Wholesale", "Toy Trains", 60, "Choo Choo Ltd.", 400);
        OrderModel order11 = new OrderModel(11, "Mason Martin", "Bulk", "Kitchen Playsets", 25, "Tiny Chefs Inc.", 600);
        OrderModel order12 = new OrderModel(12, "Isabella Lee", "Retail", "Stuffed Elephants", 130, "Happy Toys Co.", 220);
        OrderModel order13 = new OrderModel(13, "Elijah Walker", "Retail", "Bouncing Balls", 500, "Bounce World", 30);
        OrderModel order14 = new OrderModel(14, "Charlotte Hall", "Wholesale", "Lego Sets", 80, "Blocky Wonders", 800);
        OrderModel order15 = new OrderModel(15, "Ethan Young", "Bulk", "Toy Robots", 70, "Techie Toys Ltd.", 900);
        OrderModel order16 = new OrderModel(16, "Amelia King", "Retail", "Card Games", 250, "Game Masters Inc.", 90);
        OrderModel order17 = new OrderModel(17, "Lucas Adams", "Bulk", "Slinkies", 120, "Retro Fun Co.", 40);
        OrderModel order18 = new OrderModel(18, "Mia Scott", "Wholesale", "Model Airplanes", 30, "Airborne Models Ltd.", 1000);
        OrderModel order19 = new OrderModel(19, "Henry Carter", "Retail", "Magic Kits", 50, "Brain Boosters", 350);
        OrderModel order20 = new OrderModel(20, "Olivia Evans", "Bulk", "Puzzles", 200, "Brain Boosters", 100);

        // Add each order to the database or list using addOrderData
        addOrderData(order1);
        addOrderData(order2);
        addOrderData(order3);
        addOrderData(order4);
        addOrderData(order5);
        addOrderData(order6);
        addOrderData(order7);
        addOrderData(order8);
        addOrderData(order9);
        addOrderData(order10);
        addOrderData(order11);
        addOrderData(order12);
        addOrderData(order13);
        addOrderData(order14);
        addOrderData(order15);
        addOrderData(order16);
        addOrderData(order17);
        addOrderData(order18);
        addOrderData(order19);
        addOrderData(order20);
}

private void addOrderData(OrderModel order) {
    orderList.add(order);
    // Table add
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblOrderMain.getModel();
    defaultTableModel.addRow(new Object[]{
        order.getOrdId(),
        order.getOrdCust(),
        order.getOrdType(),
        order.getOrdItems(),
        order.getOrdSuppliers(),
        order.getOrdCPU()
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

        pnlOrder = new javax.swing.JPanel();
        lblOrderHead = new javax.swing.JLabel();
        btnProducts = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderMain = new javax.swing.JTable();
        lblAddOrder = new javax.swing.JLabel();
        lblAddOrderId = new javax.swing.JLabel();
        fldAddOrderId = new javax.swing.JTextField();
        lblAddOrderCust = new javax.swing.JLabel();
        fldAddOrderCust = new javax.swing.JTextField();
        lblAddOrderType = new javax.swing.JLabel();
        fldAddOrderType = new javax.swing.JTextField();
        lblAddOrderItems = new javax.swing.JLabel();
        fldAddOrderItems = new javax.swing.JTextField();
        lblAddOrderSupplier = new javax.swing.JLabel();
        fldAddOrderSupplier = new javax.swing.JTextField();
        lblAddOrderCPU = new javax.swing.JLabel();
        fldAddOrderCPU = new javax.swing.JTextField();
        lblAddOrderQuantity = new javax.swing.JLabel();
        fldAddOrderQuantity = new javax.swing.JTextField();
        btnAddOrder = new javax.swing.JButton();
        btnUpdateOrder = new javax.swing.JButton();
        lblRemOrderHead = new javax.swing.JLabel();
        lblRemOrderId = new javax.swing.JLabel();
        fldRemOrderId = new javax.swing.JTextField();
        btnRemOrder = new javax.swing.JButton();
        lblSearchOrder = new javax.swing.JLabel();
        fldSearchOrder = new javax.swing.JTextField();
        lblSortByInventory = new javax.swing.JLabel();
        sortcomboInventory = new javax.swing.JComboBox<>();
        lblBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderHead.setFont(new java.awt.Font("Helvetica", 1, 72)); // NOI18N
        lblOrderHead.setText("Orders");
        pnlOrder.add(lblOrderHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

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
        pnlOrder.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 50));

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
        pnlOrder.add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 150, 50));

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
        pnlOrder.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 150, 50));

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
        pnlOrder.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 50));

        tblOrderMain.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        tblOrderMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer/Supplier", "Order Type", "Items", "Quantity", "Cost Per Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderMain);
        if (tblOrderMain.getColumnModel().getColumnCount() > 0) {
            tblOrderMain.getColumnModel().getColumn(0).setResizable(false);
            tblOrderMain.getColumnModel().getColumn(1).setResizable(false);
            tblOrderMain.getColumnModel().getColumn(2).setResizable(false);
            tblOrderMain.getColumnModel().getColumn(3).setResizable(false);
            tblOrderMain.getColumnModel().getColumn(4).setResizable(false);
            tblOrderMain.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlOrder.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 760, 580));

        lblAddOrder.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddOrder.setText("Add Order");
        pnlOrder.add(lblAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        lblAddOrderId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderId.setText("Order ID:");
        pnlOrder.add(lblAddOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, -1, 30));

        fldAddOrderId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderIdActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 60, 30));

        lblAddOrderCust.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderCust.setText("Customer/Supplier:");
        pnlOrder.add(lblAddOrderCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, -1));

        fldAddOrderCust.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderCust.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderCustActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 140, 30));

        lblAddOrderType.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderType.setText("Order Type:");
        pnlOrder.add(lblAddOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        fldAddOrderType.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderTypeActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 140, 30));

        lblAddOrderItems.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderItems.setText("Items:");
        pnlOrder.add(lblAddOrderItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, -1, -1));

        fldAddOrderItems.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderItemsActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 330, 140, 30));

        lblAddOrderSupplier.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderSupplier.setText("Supplier:");
        pnlOrder.add(lblAddOrderSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, -1, -1));

        fldAddOrderSupplier.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderSupplierActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 370, 140, 30));

        lblAddOrderCPU.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderCPU.setText("Cost Per Unit");
        pnlOrder.add(lblAddOrderCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, -1, 20));

        fldAddOrderCPU.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderCPU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderCPUActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 450, 140, 30));

        lblAddOrderQuantity.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddOrderQuantity.setText("Quantity:");
        pnlOrder.add(lblAddOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, -1, 20));

        fldAddOrderQuantity.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddOrderQuantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddOrderQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddOrderQuantityActionPerformed(evt);
            }
        });
        pnlOrder.add(fldAddOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 140, 30));

        btnAddOrder.setBackground(new java.awt.Color(51, 38, 35));
        btnAddOrder.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setText("Add");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });
        pnlOrder.add(btnAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 110, 40));

        btnUpdateOrder.setBackground(new java.awt.Color(51, 38, 35));
        btnUpdateOrder.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnUpdateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateOrder.setText("Update");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });
        pnlOrder.add(btnUpdateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 110, 40));

        lblRemOrderHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblRemOrderHead.setText("Remove Order");
        pnlOrder.add(lblRemOrderHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 330, 40));

        lblRemOrderId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblRemOrderId.setText("Order ID:");
        pnlOrder.add(lblRemOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, -1, 30));

        fldRemOrderId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldRemOrderId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldRemOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldRemOrderIdActionPerformed(evt);
            }
        });
        pnlOrder.add(fldRemOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, 60, 30));

        btnRemOrder.setBackground(new java.awt.Color(51, 38, 35));
        btnRemOrder.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRemOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnRemOrder.setText("Submit");
        btnRemOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemOrderActionPerformed(evt);
            }
        });
        pnlOrder.add(btnRemOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 150, 40));

        lblSearchOrder.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSearchOrder.setText("Search");
        pnlOrder.add(lblSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, 30));

        fldSearchOrder.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldSearchOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldSearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSearchOrderActionPerformed(evt);
            }
        });
        pnlOrder.add(fldSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 150, 30));

        lblSortByInventory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSortByInventory.setText("Sort By");
        pnlOrder.add(lblSortByInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, 30));

        sortcomboInventory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Selection Sort", "Insertion Sort", "Merge Sort" }));
        sortcomboInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboInventoryActionPerformed(evt);
            }
        });
        pnlOrder.add(sortcomboInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 150, -1));

        lblBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/toysmanagement/resources/Background-Others.png"))); // NOI18N
        pnlOrder.add(lblBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
    this.setVisible(false);
    new ProductsPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
    this.setVisible(false);
    new InventoryPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

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

    private void fldAddOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderIdActionPerformed

    private void fldAddOrderCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderCustActionPerformed

    private void fldAddOrderTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderTypeActionPerformed

    private void fldAddOrderItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderItemsActionPerformed

    private void fldAddOrderSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderSupplierActionPerformed

    private void fldAddOrderCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderCPUActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
    if (fldAddOrderId.getText().trim().isEmpty() || 
    fldAddOrderCust.getText().trim().isEmpty() || 
    fldAddOrderType.getText().trim().isEmpty() || 
    fldAddOrderItems.getText().trim().isEmpty() || 
    fldAddOrderSupplier.getText().trim().isEmpty() || 
    fldAddOrderCPU.getText().trim().isEmpty() ||
    Integer.parseInt(fldAddOrderId.getText().trim()) == 0 || 
    Integer.parseInt(fldAddOrderCPU.getText().trim()) == 0) {
        
    JOptionPane.showMessageDialog(this, "Please Fill All the Values", "Not Successful", JOptionPane.ERROR_MESSAGE);
} else {
    if (createOrderModel()) {
        JOptionPane.showMessageDialog(this, "Order Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Order not Added", "Not Successful", JOptionPane.ERROR_MESSAGE);
    }
}

// TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void fldRemOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemOrderIdActionPerformed

    private void btnRemOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemOrderActionPerformed
        // TODO add your handling code here:
       int orderId = Integer.parseInt(fldRemOrderId.getText());
       boolean isOrderFound = false;

        for (OrderModel order : orderList) {
            if (order.getOrdId() == orderId) {
                orderList.remove(order);
                loadOrderListToTable();
                JOptionPane.showMessageDialog(this, "Order Removed", "Successful", JOptionPane.INFORMATION_MESSAGE);
                isOrderFound = true;
                break; // Exit the loop since the order has been removed
            }
        }

        if (!isOrderFound) {
            JOptionPane.showMessageDialog(this, "Please enter a valid order ID", "Failure", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnRemOrderActionPerformed

    private void fldSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSearchOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSearchOrderActionPerformed

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
     int ID = Integer.parseInt(fldAddOrderId.getText());
        String Cust = fldAddOrderCust.getText();
        String Type = fldAddOrderType.getText();
        String Items = fldAddOrderItems.getText();
        String Supplier = fldAddOrderSupplier.getText();
        int Quantity = Integer.parseInt(fldAddOrderQuantity.getText());
        int CPU = Integer.parseInt(fldAddOrderCPU.getText());
        
        for(OrderModel order: orderList ){
            if(order.getOrdId() == ID){
                order.setOrdId(ID);
                order.setOrdCust(Cust);
                order.setOrdType(Type);
                order.setOrdItems(Items);
                order.setOrdSuppliers(Supplier);
                order.setOrdQuantity(Quantity);
                order.setOrdCPU(CPU);
            
                
                
                loadOrderListToTable();

                
                fldAddOrderId.setText("");
                fldAddOrderCust.setText("");
                fldAddOrderType.setText("");
                fldAddOrderItems.setText("");
                fldAddOrderSupplier.setText("");
                fldAddOrderQuantity.setText("");
                fldAddOrderCPU.setText("");
                
                              
                JOptionPane.showMessageDialog(this, "Order Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
        }
        
        JOptionPane.showMessageDialog(this, "Order ID not found", "Failure", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void fldAddOrderQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddOrderQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddOrderQuantityActionPerformed

    private void tblOrderMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMainMouseClicked
     DefaultTableModel tableModel = (DefaultTableModel) tblOrderMain.getModel();
        int selectedRowIndex = tblOrderMain.getSelectedRow();
        System.out.println(selectedRowIndex);

        fldAddOrderId.setText(tableModel.getValueAt(selectedRowIndex, 0).toString());
        fldAddOrderCust.setText(tableModel.getValueAt(selectedRowIndex, 1).toString());
        fldAddOrderType.setText(tableModel.getValueAt(selectedRowIndex, 2).toString());
        fldAddOrderItems.setText(tableModel.getValueAt(selectedRowIndex, 3).toString());
        fldAddOrderQuantity.setText(tableModel.getValueAt(selectedRowIndex, 4).toString());
        fldAddOrderSupplier.setText(tableModel.getValueAt(selectedRowIndex, 5).toString());
        fldAddOrderCPU.setText(tableModel.getValueAt(selectedRowIndex, 6).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOrderMainMouseClicked

    private void sortcomboInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortcomboInventoryActionPerformed

    private void addOrderDataToTable(OrderModel order) {
    orderList.add(order);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblOrderMain.getModel();
    defaultTableModel.addRow(new Object[]{
        order.getOrdId(),
        order.getOrdCust(),
        order.getOrdType(),
        order.getOrdItems(),
        order.getOrdSuppliers(),
        order.getOrdCPU()
    });
}

private void registerOrder(OrderModel order) {
    orderList.add(order);
    DefaultTableModel defaultTableModel = (DefaultTableModel) tblOrderMain.getModel();
    defaultTableModel.addRow(new Object[]{
        order.getOrdId(),
        order.getOrdCust(),
        order.getOrdType(),
        order.getOrdItems(),
        order.getOrdSuppliers(),
        order.getOrdCPU()
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
            java.util.logging.Logger.getLogger(OrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnRemOrder;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JTextField fldAddOrderCPU;
    private javax.swing.JTextField fldAddOrderCust;
    private javax.swing.JTextField fldAddOrderId;
    private javax.swing.JTextField fldAddOrderItems;
    private javax.swing.JTextField fldAddOrderQuantity;
    private javax.swing.JTextField fldAddOrderSupplier;
    private javax.swing.JTextField fldAddOrderType;
    private javax.swing.JTextField fldRemOrderId;
    private javax.swing.JTextField fldSearchOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddOrder;
    private javax.swing.JLabel lblAddOrderCPU;
    private javax.swing.JLabel lblAddOrderCust;
    private javax.swing.JLabel lblAddOrderId;
    private javax.swing.JLabel lblAddOrderItems;
    private javax.swing.JLabel lblAddOrderQuantity;
    private javax.swing.JLabel lblAddOrderSupplier;
    private javax.swing.JLabel lblAddOrderType;
    private javax.swing.JLabel lblBgImg;
    private javax.swing.JLabel lblOrderHead;
    private javax.swing.JLabel lblRemOrderHead;
    private javax.swing.JLabel lblRemOrderId;
    private javax.swing.JLabel lblSearchOrder;
    private javax.swing.JLabel lblSortByInventory;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JComboBox<String> sortcomboInventory;
    private javax.swing.JTable tblOrderMain;
    // End of variables declaration//GEN-END:variables
}
