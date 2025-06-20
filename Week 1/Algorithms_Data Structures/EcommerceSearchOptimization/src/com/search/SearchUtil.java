package com.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtil {

    // Linear Search by productId
    public static Product linearSearch(Product[] products, int targetId) 
    {
        for (Product product : products) 
        {
            if (product.getProductId() == targetId) 
            {
                return product;
            }
        }
        return null;
    }

    // Binary Search by productId (requires sorted array)
    public static Product binarySearch(Product[] products, int targetId) 
    {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            int midId = products[mid].getProductId();

            if (midId == targetId) 
            {
                return products[mid];
            } 
            else if (midId < targetId) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return null;
    }

    // Helper method to sort products by productId
    public static void sortProductsById(Product[] products) 
    {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }
}
