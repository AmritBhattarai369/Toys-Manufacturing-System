package com.toysmanagement.model;

/**
 *
 * @author amritbhattarai
 * Item Id
Name
Category
Stock 
Supplier Cost Per Unit 
Total Value
 */
public class InventoryModel {
    private int invItemId;
    private String invItemName;
    private String invItemCategory;
    private int invItemStock;
    private String invItemSupplier;
    private int invItemCpu;
    private int invItemTotalValue;
    
    public InventoryModel(int invItemId, String invItemName, String invItemCategory, int invItemStock, String invItemSupplier, int invItemCpu, int invItemTotalValue)
    {
        this.invItemId=invItemId;
        this.invItemName=invItemName;
        this.invItemCategory=invItemCategory;
        this.invItemStock=invItemStock;
        this.invItemSupplier=invItemSupplier;
        this.invItemCpu=invItemCpu;
        this.invItemTotalValue=invItemTotalValue;
        
    }
   // Getter and Setter methods
    public int getInvItemId() {
        return invItemId;
    }

    public void setInvItemId(int invItemId) {
        this.invItemId = invItemId;
    }

    public String getInvItemName() {
        return invItemName;
    }

    public void setInvItemName(String invItemName) {
        this.invItemName = invItemName;
    }

    public String getInvItemCategory() {
        return invItemCategory;
    }

    public void setInvItemCategory(String invItemCategory) {
        this.invItemCategory = invItemCategory;
    }

    public int getInvItemStock() {
        return invItemStock;
    }

    public void setInvItemStock(int invItemStock) {
        this.invItemStock = invItemStock;
    }

    public String getInvItemSupplier() {
        return invItemSupplier;
    }

    public void setInvItemSupplier(String invItemSupplier) {
        this.invItemSupplier = invItemSupplier;
    }

    public int getInvItemCpu() {
        return invItemCpu;
    }

    public void setInvItemCpu(int invItemCpu) {
        this.invItemCpu = invItemCpu;
    }

    public int getInvItemTotalValue() {
        return invItemTotalValue;
    }

    public void setInvItemTotalValue(int invItemTotalValue) {
        this.invItemTotalValue = invItemTotalValue;
    }
}
    

