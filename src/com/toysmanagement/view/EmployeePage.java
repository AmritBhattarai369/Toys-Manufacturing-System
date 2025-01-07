package com.toysmanagement.view;

import com.toysmanagement.model.EmployeeModel;
import javax.swing.table.DefaultTableModel;
import com.toysmanagement.controller.Validation;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.*;



/**
 *
 *@LMUID 23048624
 * @author amritbhattarai
 */
 
public class EmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form inventory_page
     */
    private final LinkedList<EmployeeModel> employeeList =new LinkedList<>();
    private DefaultTableModel defaultTableModel;
    private final Validation validation;



    public EmployeePage() {
        initComponents(); 
        validation = new Validation();
        addInitialEmployeeData();
        
    }
    
    private Boolean createEmployeeModel()
    {
    int ID=Integer.parseInt( fldAddEmpId.getText());
    String Name=fldAddEmpName.getText();
    String Address=fldAddEmpAddress.getText();
    String Contact=fldAddEmpContact.getText();
    String Position=fldAddEmpPosition.getText();
    String Department=fldAddEmpDepartment.getText();

    EmployeeModel newEmployee=new EmployeeModel(ID,Name,Address,Contact,Position, Department);
    if(employeeList.add(newEmployee)){
        loadEmployeeListToTable();
        return true;
    }
    else{
        loadEmployeeListToTable();
        return false;
    }}
    
    
    private void loadEmployeeListToTable(){
     DefaultTableModel model = (DefaultTableModel) tblEmpMain.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    // Add rows from employeeList
    for (EmployeeModel employee : employeeList) {
        model.addRow(new Object[] {
            employee.getEmpId(),
            employee.getEmpName(),
            employee.getEmpAddress(),
            employee.getEmpContact(),
            employee.getEmpPosition(),
            employee.getEmpDepartment()
        });
    }
}
    private void addInitialEmployeeData()
    {
        EmployeeModel employee1 = new EmployeeModel(1, "John Doe", "123 Elm St, Springfield", "123-456-7890", "Manager", "Sales");
        EmployeeModel employee2 = new EmployeeModel(2, "Jane Smith", "456 Oak St, Springfield", "987-654-3210", "Team Lead", "Marketing");
        EmployeeModel employee3 = new EmployeeModel(3, "Alice Johnson", "789 Pine St, Springfield", "456-789-0123", "Software Engineer", "IT");
        EmployeeModel employee4 = new EmployeeModel(4, "Mike Brown", "321 Maple St, Springfield", "654-321-9870", "HR Specialist", "Human Resources");
        EmployeeModel employee5 = new EmployeeModel(5, "Laura Wilson", "654 Birch St, Springfield", "321-654-0987", "Finance Analyst", "Finance");
        EmployeeModel employee6 = new EmployeeModel(6, "James White", "987 Cedar St, Springfield", "789-012-3456", "Project Manager", "Operations");
        EmployeeModel employee7 = new EmployeeModel(7, "Emma Green", "159 Walnut St, Springfield", "012-345-6789", "Graphic Designer", "Creative");
        EmployeeModel employee8 = new EmployeeModel(8, "Oliver Taylor", "753 Willow St, Springfield", "345-678-9012", "Content Writer", "Marketing");
        EmployeeModel employee9 = new EmployeeModel(9, "Sophia Moore", "357 Chestnut St, Springfield", "678-901-2345", "Accountant", "Finance");
        EmployeeModel employee10 = new EmployeeModel(10, "Liam Harris", "951 Redwood St, Springfield", "901-234-5678", "System Admin", "IT");
        EmployeeModel employee11 = new EmployeeModel(11, "Mason Martin", "159 Sycamore St, Springfield", "234-567-8901", "Operations Coordinator", "Operations");
        EmployeeModel employee12 = new EmployeeModel(12, "Isabella Lee", "357 Spruce St, Springfield", "567-890-1234", "Marketing Specialist", "Marketing");
        EmployeeModel employee13 = new EmployeeModel(13, "Elijah Walker", "753 Palm St, Springfield", "890-123-4567", "Sales Associate", "Sales");
        EmployeeModel employee14 = new EmployeeModel(14, "Charlotte Hall", "951 Poplar St, Springfield", "123-567-8904", "HR Manager", "Human Resources");
        EmployeeModel employee15 = new EmployeeModel(15, "Ethan Young", "357 Fir St, Springfield", "567-234-6789", "UI/UX Designer", "Creative");
        EmployeeModel employee16 = new EmployeeModel(16, "Amelia King", "159 Ash St, Springfield", "345-678-1234", "Software Tester", "IT");
        EmployeeModel employee17 = new EmployeeModel(17, "Lucas Adams", "753 Cypress St, Springfield", "678-123-4560", "Procurement Officer", "Finance");
        EmployeeModel employee18 = new EmployeeModel(18, "Mia Scott", "951 Mahogany St, Springfield", "901-456-7890", "Product Manager", "Operations");
        EmployeeModel employee19 = new EmployeeModel(19, "Henry Carter", "357 Alder St, Springfield", "123-678-9014", "Data Analyst", "IT");
        EmployeeModel employee20 = new EmployeeModel(20, "Olivia Evans", "753 Beech St, Springfield", "567-890-4567", "HR Assistant", "Human Resources");

        // Add each employee to the database or list using addEmployeeData
        addEmployeeData(employee1);
        addEmployeeData(employee2);
        addEmployeeData(employee3);
        addEmployeeData(employee4);
        addEmployeeData(employee5);
        addEmployeeData(employee6);
        addEmployeeData(employee7);
        addEmployeeData(employee8);
        addEmployeeData(employee9);
        addEmployeeData(employee10);
        addEmployeeData(employee11);
        addEmployeeData(employee12);
        addEmployeeData(employee13);
        addEmployeeData(employee14);
        addEmployeeData(employee15);
        addEmployeeData(employee16);
        addEmployeeData(employee17);
        addEmployeeData(employee18);
        addEmployeeData(employee19);
        addEmployeeData(employee20);
    }
    private void addEmployeeData(EmployeeModel employee) {
        employeeList.add(employee);
        //Table add
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblEmpMain.getModel();
        defaultTableModel.addRow(new Object[]{
            employee.getEmpId(),
            employee.getEmpName(),
            employee.getEmpAddress(),
            employee.getEmpContact(),
            employee.getEmpPosition(),
            employee.getEmpDepartment()
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

        pnlEmp = new javax.swing.JPanel();
        lblEmpHead = new javax.swing.JLabel();
        btnProducts = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpMain = new javax.swing.JTable();
        lblAddEmpHead = new javax.swing.JLabel();
        lblAddEmpID = new javax.swing.JLabel();
        lblAddEmpPosition = new javax.swing.JLabel();
        lblRemEmpId = new javax.swing.JLabel();
        lblAddEmpName = new javax.swing.JLabel();
        lblAddEmpContact = new javax.swing.JLabel();
        lblAddEmpAddress = new javax.swing.JLabel();
        lblAddEmpDepartment = new javax.swing.JLabel();
        fldAddEmpId = new javax.swing.JTextField();
        fldAddEmpName = new javax.swing.JTextField();
        fldAddEmpAddress = new javax.swing.JTextField();
        fldAddEmpContact = new javax.swing.JTextField();
        fldAddEmpPosition = new javax.swing.JTextField();
        fldAddEmpDepartment = new javax.swing.JTextField();
        btnAddEmp = new javax.swing.JButton();
        btnUpdateEMP = new javax.swing.JButton();
        btnRemEmp = new javax.swing.JButton();
        lblRemEmpHead = new javax.swing.JLabel();
        fldRemEmpId = new javax.swing.JTextField();
        sortcomboEmployees = new javax.swing.JComboBox<>();
        fldSearchOrder = new javax.swing.JTextField();
        lblSearchOrder = new javax.swing.JLabel();
        lblSortByInventory = new javax.swing.JLabel();
        lblBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpHead.setFont(new java.awt.Font("Helvetica", 1, 72)); // NOI18N
        lblEmpHead.setText("Employees");
        pnlEmp.add(lblEmpHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

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
        pnlEmp.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 50));

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
        pnlEmp.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 50));

        btnSuppliers.setBackground(new java.awt.Color(51, 38, 35));
        btnSuppliers.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        btnSuppliers.setText("Suppliers");
        btnSuppliers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersActionPerformed(evt);
            }
        });
        pnlEmp.add(btnSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 150, 50));

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
        pnlEmp.add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 50));

        tblEmpMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Address", "Contact", "Department", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpMain);
        if (tblEmpMain.getColumnModel().getColumnCount() > 0) {
            tblEmpMain.getColumnModel().getColumn(0).setResizable(false);
            tblEmpMain.getColumnModel().getColumn(1).setResizable(false);
            tblEmpMain.getColumnModel().getColumn(2).setResizable(false);
            tblEmpMain.getColumnModel().getColumn(3).setResizable(false);
            tblEmpMain.getColumnModel().getColumn(4).setResizable(false);
            tblEmpMain.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlEmp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 760, 580));

        lblAddEmpHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblAddEmpHead.setText("Add / Update Employee");
        pnlEmp.add(lblAddEmpHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        lblAddEmpID.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpID.setText("Employee ID:");
        pnlEmp.add(lblAddEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, -1, 30));

        lblAddEmpPosition.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpPosition.setText("Position:");
        pnlEmp.add(lblAddEmpPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, -1, 20));

        lblRemEmpId.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblRemEmpId.setText("Employee ID:");
        pnlEmp.add(lblRemEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, -1, 30));

        lblAddEmpName.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpName.setText("Name:");
        pnlEmp.add(lblAddEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, -1, -1));

        lblAddEmpContact.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpContact.setText("Contact:");
        pnlEmp.add(lblAddEmpContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, -1, -1));

        lblAddEmpAddress.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpAddress.setText("Address:");
        pnlEmp.add(lblAddEmpAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        lblAddEmpDepartment.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblAddEmpDepartment.setText("Department:");
        pnlEmp.add(lblAddEmpDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        fldAddEmpId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpIdActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 60, 30));

        fldAddEmpName.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpNameActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 140, 30));

        fldAddEmpAddress.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpAddressActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 140, 30));

        fldAddEmpContact.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpContact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpContactActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 140, 30));

        fldAddEmpPosition.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpPosition.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpPositionActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 140, 30));

        fldAddEmpDepartment.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldAddEmpDepartment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldAddEmpDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAddEmpDepartmentActionPerformed(evt);
            }
        });
        pnlEmp.add(fldAddEmpDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, 140, 30));

        btnAddEmp.setBackground(new java.awt.Color(51, 38, 35));
        btnAddEmp.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmp.setText("Add");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        pnlEmp.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 80, 40));

        btnUpdateEMP.setBackground(new java.awt.Color(51, 38, 35));
        btnUpdateEMP.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnUpdateEMP.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEMP.setText("Update");
        btnUpdateEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEMPActionPerformed(evt);
            }
        });
        pnlEmp.add(btnUpdateEMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 490, 110, 40));

        btnRemEmp.setBackground(new java.awt.Color(51, 38, 35));
        btnRemEmp.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRemEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnRemEmp.setText("Submit");
        btnRemEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemEmpActionPerformed(evt);
            }
        });
        pnlEmp.add(btnRemEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, 150, 40));

        lblRemEmpHead.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        lblRemEmpHead.setText("Remove Employee");
        pnlEmp.add(lblRemEmpHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 330, 40));

        fldRemEmpId.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldRemEmpId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldRemEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldRemEmpIdActionPerformed(evt);
            }
        });
        pnlEmp.add(fldRemEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, 60, 30));

        sortcomboEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Id", "Name", "Position" }));
        sortcomboEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboEmployeesActionPerformed(evt);
            }
        });
        pnlEmp.add(sortcomboEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 150, -1));

        fldSearchOrder.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        fldSearchOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fldSearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSearchOrderActionPerformed(evt);
            }
        });
        pnlEmp.add(fldSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 150, 30));

        lblSearchOrder.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSearchOrder.setText("Search");
        pnlEmp.add(lblSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, 30));

        lblSortByInventory.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        lblSortByInventory.setText("Sort By");
        pnlEmp.add(lblSortByInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, 30));

        lblBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/toysmanagement/resources/Background-Others.png"))); // NOI18N
        pnlEmp.add(lblBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
    this.setVisible(false);
    new SuppliersPage().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnSuppliersActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
    this.setVisible(false);
    new InventoryPage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void fldRemEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldRemEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldRemEmpIdActionPerformed

    private void fldAddEmpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpAddressActionPerformed

    private void fldAddEmpDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpDepartmentActionPerformed

    private void fldAddEmpPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpPositionActionPerformed

    private void fldAddEmpContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpContactActionPerformed

    private void fldAddEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpNameActionPerformed

    private void fldAddEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAddEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAddEmpIdActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        if (fldAddEmpId.getText().trim().isEmpty() ||
            fldAddEmpName.getText().trim().isEmpty() ||
            fldAddEmpAddress.getText().trim().isEmpty() ||
            fldAddEmpContact.getText().trim().isEmpty() ||
            fldAddEmpPosition.getText().trim().isEmpty() ||
            fldAddEmpDepartment.getText().trim().isEmpty() ||
            Integer.parseInt(fldAddEmpId.getText().trim()) == 0 ){

            JOptionPane.showMessageDialog(this, "Please Fill All the Values", "Not Successful", JOptionPane.ERROR_MESSAGE);
        } else {
            if (createEmployeeModel()) {
                JOptionPane.showMessageDialog(this, "Employee Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Employee not Added", "Not Successful", JOptionPane.ERROR_MESSAGE);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnUpdateEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEMPActionPerformed
        int empID = Integer.parseInt(fldAddEmpId.getText());
        String Name = fldAddEmpName.getText();
        String Address = fldAddEmpAddress.getText();
        String Contact = fldAddEmpContact.getText();
        String Position = fldAddEmpPosition.getText();
        String Department = fldAddEmpDepartment.getText();

        for(EmployeeModel product: employeeList ){
            if(product.getEmpId() == empID){
                product.setEmpId(empID);
                product.setEmpName(Name);
                product.setEmpAddress(Address);
                product.setEmpContact(Contact);
                product.setEmpPosition(Position);
                product.setEmpDepartment(Department);
                

                loadEmployeeListToTable();

                fldAddEmpId.setText("");
                fldAddEmpName.setText("");
                fldAddEmpAddress.setText("");
                fldAddEmpContact.setText("");
                fldAddEmpPosition.setText("");
                fldAddEmpDepartment.setText("");

                JOptionPane.showMessageDialog(this, "Product Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

        }

        JOptionPane.showMessageDialog(this, "Product ID not found", "Failure", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateEMPActionPerformed

    private void btnRemEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemEmpActionPerformed
        int employeeId = Integer.parseInt(fldRemEmpId.getText());
        boolean isEmployeeFound = false;

            for (EmployeeModel employee : employeeList) {
                if (employee.getEmpId() == employeeId) {
                    employeeList.remove(employee);
                    loadEmployeeListToTable();
                    JOptionPane.showMessageDialog(this, "Employee Removed", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    isEmployeeFound = true;
                    break; // Exit the loop since the employee has been removed
                     }
                }

                if (!isEmployeeFound) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid employee ID", "Failure", JOptionPane.INFORMATION_MESSAGE);
                }

        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemEmpActionPerformed

    private void sortcomboEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboEmployeesActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_sortcomboEmployeesActionPerformed

    private void fldSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSearchOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSearchOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void addEmpDataToTable(EmployeeModel employee)
    {
        employeeList.add(employee);
        defaultTableModel = (DefaultTableModel) tblEmpMain.getModel();
         defaultTableModel.addRow(new Object[]{employee.getEmpId(),
         employee.getEmpName(), employee.getEmpAddress(), employee.getEmpContact(),
         employee.getEmpPosition(), employee.getEmpDepartment()});
    }
     private void registerEmp(EmployeeModel employee) {
        employeeList.add(employee);
        DefaultTableModel model = (DefaultTableModel) tblEmpMain.getModel();
        model.addRow(new Object[]{  
            employee.getEmpId(), employee.getEmpName(), employee.getEmpAddress(),
            employee.getEmpContact(), employee.getEmpPosition(),employee.getEmpDepartment()
        });
    }
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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnRemEmp;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JButton btnUpdateEMP;
    private javax.swing.JTextField fldAddEmpAddress;
    private javax.swing.JTextField fldAddEmpContact;
    private javax.swing.JTextField fldAddEmpDepartment;
    private javax.swing.JTextField fldAddEmpId;
    private javax.swing.JTextField fldAddEmpName;
    private javax.swing.JTextField fldAddEmpPosition;
    private javax.swing.JTextField fldRemEmpId;
    private javax.swing.JTextField fldSearchOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddEmpAddress;
    private javax.swing.JLabel lblAddEmpContact;
    private javax.swing.JLabel lblAddEmpDepartment;
    private javax.swing.JLabel lblAddEmpHead;
    private javax.swing.JLabel lblAddEmpID;
    private javax.swing.JLabel lblAddEmpName;
    private javax.swing.JLabel lblAddEmpPosition;
    private javax.swing.JLabel lblBgImg;
    private javax.swing.JLabel lblEmpHead;
    private javax.swing.JLabel lblRemEmpHead;
    private javax.swing.JLabel lblRemEmpId;
    private javax.swing.JLabel lblSearchOrder;
    private javax.swing.JLabel lblSortByInventory;
    private javax.swing.JPanel pnlEmp;
    private javax.swing.JComboBox<String> sortcomboEmployees;
    private javax.swing.JTable tblEmpMain;
    // End of variables declaration//GEN-END:variables
}
