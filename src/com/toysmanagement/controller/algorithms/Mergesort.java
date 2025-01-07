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
public class Mergesort {
    public List<ProductModel> sortByProdQuantity(List<ProductModel> unsortedData, boolean isDesc) {
    if (unsortedData == null || unsortedData.size() <= 1) {
        return unsortedData;
    }

    // Split the list into two halves
    int mid = unsortedData.size() / 2;
    List<ProductModel> left = new ArrayList<>(unsortedData.subList(0, mid));
    List<ProductModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

    // Recursively sort both halves
    left = sortByProdQuantity(left, isDesc);
    right = sortByProdQuantity(right, isDesc);

    // Merge the sorted halves
    return mergeProdQuantity(left, right, isDesc);
}

private List<ProductModel> mergeProdQuantity(List<ProductModel> left, List<ProductModel> right, boolean isDesc) {
    List<ProductModel> merged = new ArrayList<>();
    int i = 0, j = 0;

    // Merge the two lists
    while (i < left.size() && j < right.size()) {
        if (isDesc) {
            if (left.get(i).getProdQuantity() >= right.get(j).getProdQuantity()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        } else {
            if (left.get(i).getProdQuantity() <= right.get(j).getProdQuantity()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
    }

    // Add remaining elements from left, if any
    while (i < left.size()) {
        merged.add(left.get(i));
        i++;
    }

    // Add remaining elements from right, if any
    while (j < right.size()) {
        merged.add(right.get(j));
        j++;
    }

    return merged;
}
public List<ProductModel> sortByProdCPU(List<ProductModel> unsortedData, boolean isDesc) {
    if (unsortedData == null || unsortedData.size() <= 1) {
        return unsortedData;
    }

    // Split the list into two halves
    int mid = unsortedData.size() / 2;
    List<ProductModel> left = new ArrayList<>(unsortedData.subList(0, mid));
    List<ProductModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

    // Recursively sort both halves
    left = sortByProdCPU(left, isDesc);
    right = sortByProdCPU(right, isDesc);

    // Merge the sorted halves
    return mergeProdCPU(left, right, isDesc);
}

private List<ProductModel> mergeProdCPU(List<ProductModel> left, List<ProductModel> right, boolean isDesc) {
    List<ProductModel> merged = new ArrayList<>();
    int i = 0, j = 0;

    // Merge the two lists
    while (i < left.size() && j < right.size()) {
        if (isDesc) {
            if (left.get(i).getProdCpu() >= right.get(j).getProdCpu()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        } else {
            if (left.get(i).getProdCpu() <= right.get(j).getProdCpu()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
    }

    // Add remaining elements from left, if any
    while (i < left.size()) {
        merged.add(left.get(i));
        i++;
    }

    // Add remaining elements from right, if any
    while (j < right.size()) {
        merged.add(right.get(j));
        j++;
    }

    return merged;
}
}
