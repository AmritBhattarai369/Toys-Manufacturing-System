package com.toysmanagement.controller.algorithms;

import com.toysmanagement.model.ProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


/**
 * @LMU ID 23048624
 * @author Amrit Bhattarai
 */
public class SelectionSort {

    public List<ProductModel> sortByProdId(List<ProductModel> unsortedData, boolean isDesc) {
        

        LinkedList<ProductModel> dataToSort = new LinkedList<>(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getProdId() > dataToSort.get(minIndex).getProdId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getProdId() < dataToSort.get(minIndex).getProdId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            ProductModel tempProduct = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempProduct);
        }
        return dataToSort;
    }
    
     public List<ProductModel> sortByProdName(List<ProductModel> unsortedData, boolean isDesc) {
        
        List<ProductModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getProdName().compareToIgnoreCase(dataToSort.get(minIndex).getProdName())>0 ) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getProdName().compareToIgnoreCase(dataToSort.get(minIndex).getProdName())<0) {
                        minIndex = j;
                    }
                }
            }
            //swap
            ProductModel tempProduct = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempProduct);
        }
        return dataToSort;
    }

}