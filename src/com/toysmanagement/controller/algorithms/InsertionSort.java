/*
 * @LMU ID 23048624
 * @author Amrit Bhattarai
 */
package com.toysmanagement.controller.algorithms;

import com.toysmanagement.model.ProductModel;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author amritbhattarai
 */
public class InsertionSort {
    
    public List<ProductModel> sortByProdCategory(List<ProductModel> unsortedData, boolean isDesc) {
    
    List<ProductModel> dataToSort = new ArrayList<>();
    dataToSort.addAll(unsortedData);
    
    for (int i = 1; i < dataToSort.size(); i++) {
        // Get the current element to insert
        ProductModel currentProduct = dataToSort.get(i);
        int j = i - 1;

        // Compare and shift elements to create the correct position for currentProduct
        if (isDesc) {
            while (j >= 0 && dataToSort.get(j).getProdCategory().compareToIgnoreCase(currentProduct.getProdCategory()) < 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        } else {
            while (j >= 0 && dataToSort.get(j).getProdCategory().compareToIgnoreCase(currentProduct.getProdCategory()) > 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        }

        // Place the current element at its correct position
        dataToSort.set(j + 1, currentProduct);
    }
    return dataToSort;
}
    public List<ProductModel> sortByProdSupplier(List<ProductModel> unsortedData, boolean isDesc) {
    
    List<ProductModel> dataToSort = new ArrayList<>();
    dataToSort.addAll(unsortedData);
    
    for (int i = 1; i < dataToSort.size(); i++) {
        // Get the current element to insert
        ProductModel currentProduct = dataToSort.get(i);
        int j = i - 1;

        // Compare and shift elements to create the correct position for currentProduct
        if (isDesc) {
            while (j >= 0 && dataToSort.get(j).getProdSupplier().compareToIgnoreCase(currentProduct.getProdSupplier()) < 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        } else {
            while (j >= 0 && dataToSort.get(j).getProdSupplier().compareToIgnoreCase(currentProduct.getProdSupplier()) > 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        }

        // Place the current element at its correct position
        dataToSort.set(j + 1, currentProduct);
    }
    return dataToSort;
}



}
