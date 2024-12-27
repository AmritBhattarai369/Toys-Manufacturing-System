package com.toysmanagement.model;

/**
 *
 * @author amritbhattarai
 */
public class SupplierModel {

    private int suppId;
    private String suppName;
    private String suppAddress;
    private int suppContactNum;
    private String suppContactPerson;
    private String suppProduct;

    public SupplierModel(int suppId, String suppName, String suppAddress, int suppContactNum, String suppContactPerson, String suppProduct) {
        this.suppId = suppId;
        this.suppName = suppName;
        this.suppAddress = suppAddress;
        this.suppContactNum = suppContactNum;
        this.suppContactPerson = suppContactPerson;
        this.suppProduct = suppProduct;
    }

    public int getSuppId() {
        return suppId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress;
    }

    public int getSuppContactNum() {
        return suppContactNum;
    }

    public void setSuppContactNum(int suppContactNum) {
        this.suppContactNum = suppContactNum;
    }

    public String getSuppContactPerson() {
        return suppContactPerson;
    }

    public void setSuppContactPerson(String suppContactPerson) {
        this.suppContactPerson = suppContactPerson;
    }

    public String getSuppProduct() {
        return suppProduct;
    }

    public void setSuppProduct(String suppProduct) {
        this.suppProduct = suppProduct;
    }
}
