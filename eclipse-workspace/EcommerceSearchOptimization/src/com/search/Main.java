package com.search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(104, "Shoes", "Footwear"),
            new Product(101, "Phone", "Electronics"),
            new Product(103, "T-shirt", "Apparel"),
            new Product(102, "Laptop", "Electronics")
        };

        int searchId = 102;

        // Linear Search
        System.out.println("🔍 Linear Search:");
        Product resultLinear = SearchUtil.linearSearch(products, searchId);
        System.out.println(resultLinear != null ? resultLinear : "Product not found");

        // Sort before Binary Search
        SearchUtil.sortProductsById(products);

        // Binary Search
        System.out.println("\n🔍 Binary Search:");
        Product resultBinary = SearchUtil.binarySearch(products, searchId);
        System.out.println(resultBinary != null ? resultBinary : "Product not found");
    }
}
