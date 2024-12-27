package com.toysmanagement.model;

/**
 *
 * @author amritbhattarai
 */
public class ProductModel {

    private int prodId;
    private String prodName;
    private String prodCategory;
    private String prodSupplier;
    private int prodQuantity;
    private int prodCpu;
    private int prodTotalValue;

    public ProductModel(int prodId, String prodName, String prodCategory, String prodSupplier, int prodQuantity, int prodCpu, int prodTotalValue) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCategory = prodCategory;
        this.prodSupplier = prodSupplier;
        this.prodQuantity = prodQuantity;
        this.prodCpu = prodCpu;
        this.prodTotalValue = prodTotalValue;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    public String getProdSupplier() {
        return prodSupplier;
    }

    public void setProdSupplier(String prodSupplier) {
        this.prodSupplier = prodSupplier;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    public int getProdCpu() {
        return prodCpu;
    }

    public void setProdCpu(int prodCpu) {
        this.prodCpu = prodCpu;
    }

    public int getProdTotalValue() {
        return prodTotalValue;
    }

    public void setProdTotalValue(int prodTotalValue) {
        this.prodTotalValue = prodTotalValue;
    }
}
