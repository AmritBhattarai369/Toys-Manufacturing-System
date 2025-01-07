/*
 * @LMU ID 23048624
 * @author Amrit Bhattarai
 */

package com.toysmanagement.controller.algorithms;

import com.toysmanagement.model.ProductModel;
import java.util.List;

/**
 *
 * @author Amrit Bhattarai
 */
public class BinarySearch {

    public ProductModel searchByName(String searchValue, List<ProductModel> productList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(productList.get(mid).getProdName()) == 0) {
            return productList.get(mid);
        } else if (searchValue.compareToIgnoreCase(productList.get(mid).getProdName()) < 0) {
            return searchByName(searchValue, productList, left, mid - 1);
        } else {
            return searchByName(searchValue, productList, mid + 1, right);
        }

    }
}