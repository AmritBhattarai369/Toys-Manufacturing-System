package com.toysmanagement.controller;


import java.util.regex.Pattern;

public class Validation {
    //Employee Validation
    private static final Pattern EMP_NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern EMP_ID_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern EMP_ADDRESS_PATTERN = Pattern.compile("^");
    private static final Pattern EMP_CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");
    private static final Pattern EMP_POSITION_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern EMP_DEPARTMENT_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    
    //Inventory Validation
    private static final Pattern INV_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s]+$");
    private static final Pattern INV_ID_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern INV_CATEGORY_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern INV_SUPPLIER_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern INV_STOCK_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern INV_CPU_PATTERN = Pattern.compile("^\\d+$");
    
    //Order Validation
    private static final Pattern ORDER_ID_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern ORDER_CUSTOMER_PATTERN = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern ORDER_TYPE_PATTERN = Pattern.compile("^[a-zA-Z ]+$");
    private static final Pattern ORDER_ITEMS_PATTERN = Pattern.compile("^[a-zA-Z, ]+$");
    private static final Pattern ORDER_SUPPLIERS_PATTERN = Pattern.compile("^[a-zA-Z, ]+$");
    private static final Pattern ORDER_CPU_PATTERN = Pattern.compile("^\\d+$");  // Assuming CPU is an integer value
    
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidEmpName(String empName) {
        return !isNullOrEmpty(empName) && EMP_NAME_PATTERN.matcher(empName).matches();
    }

    /**
     * Validates if the Employee ID is exactly 4 digits.
     *
     * @param lmuId the LMU ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidEmpId(int empId) {
        return EMP_ID_PATTERN.matcher(String.valueOf(empId)).matches();
    }

    /**
     * Validates if the employee address only contains alphabets
     * @param empAddress the Address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidEmpAddress(String empAddress) {
        return !isNullOrEmpty(empAddress) && EMP_ADDRESS_PATTERN.matcher(empAddress).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param empContact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String empContact) {
        return !isNullOrEmpty(empContact) && EMP_CONTACT_PATTERN.matcher(empContact).matches();
    }
    /**
     * Validates if the Employee Position only contains alphabets
     *
     * @param empPosition the contact number to validate
     * @return true if valid, otherwise false
     */
    
    public static boolean isValidPosition(String empPosition) {
        return !isNullOrEmpty(empPosition) && EMP_POSITION_PATTERN.matcher(empPosition).matches();
    }
    /**
     * Validates if the Employee Department only contains alphabets
     *
     * @param empDepartment the contact number to validate
     * @return true if valid, otherwise false
     */
    
    public static boolean isValidDepartment(String empDepartment) {
        return !isNullOrEmpty(empDepartment) && EMP_DEPARTMENT_PATTERN.matcher(empDepartment).matches();
    }

    //Inventory Validation
    
    public static boolean isValidInventoryName(String invName) {
        return !isNullOrEmpty(invName) && INV_NAME_PATTERN.matcher(invName).matches();
    }

    /**
     * Validates if the inventory ID is exactly 4 digits.
     *
     * @param invId the inventory ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidInventoryId(int invId) {
        return INV_ID_PATTERN.matcher(String.valueOf(invId)).matches();
    }

    /**
     * Validates if the inventory category contains only alphabets and spaces.
     *
     * @param invCategory the category to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidInventoryCategory(String invCategory) {
        return !isNullOrEmpty(invCategory) && INV_CATEGORY_PATTERN.matcher(invCategory).matches();
    }

    /**
     * Validates if the supplier name contains only alphabets and spaces.
     *
     * @param invSupplier the supplier name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidInventorySupplier(String invSupplier) {
        return !isNullOrEmpty(invSupplier) && INV_SUPPLIER_PATTERN.matcher(invSupplier).matches();
    }

    /**
     * Validates if the stock is a positive integer.
     *
     * @param invStock the stock to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidInventoryStock(String invStock) {
        return !isNullOrEmpty(invStock) && INV_STOCK_PATTERN.matcher(invStock).matches();
    }

    /**
     * Validates if the cost per unit (CPU) is a positive integer.
     *
     * @param invCPU the cost per unit to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidInventoryCPU(String invCPU) {
        return !isNullOrEmpty(invCPU) && INV_CPU_PATTERN.matcher(invCPU).matches();
    }
    
}