package com.toysmanagement.model;

/**
 *
 * @author amritbhattarai
 */
public class OrderModel {
    
    private int ordId;
    private String ordCust;
    private String ordType;
    private String ordItems;
    private String ordSuppliers;
    private int ordCPU;
    
    public OrderModel(int ordId, String ordCust, String ordType, String ordItems, String ordSuppliers, int ordCPU) {
        this.ordId = ordId;
        this.ordCust = ordCust;
        this.ordType = ordType;
        this.ordItems = ordItems;
        this.ordSuppliers = ordSuppliers;
        this.ordCPU = ordCPU;
    }
    
    public int getOrdId() {
        return ordId;
    }
    
    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }
    
    public String getOrdCust() {
        return ordCust;
    }
    
    public void setOrdCust(String ordCust) {
        this.ordCust = ordCust;
    }
    
    public String getOrdType() {
        return ordType;
    }
    
    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
    
    public String getOrdItems() {
        return ordItems;
    }
    
    public void setOrdItems(String ordItems) {
        this.ordItems = ordItems;
    }
    
    public String getOrdSuppliers() {
        return ordSuppliers;
    }
    
    public void setOrdSuppliers(String ordSuppliers) {
        this.ordSuppliers = ordSuppliers;
    }
    
    public int getOrdCPU() {
        return ordCPU;
    }
    
    public void setOrdCPU(int ordCPU) {
        this.ordCPU = ordCPU;
    }
}
