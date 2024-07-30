package com.example.orders;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Jos", 250.0),
                new Order(2, "Someone1", 300.0),
                new Order(3, "Vincy", 150.0),
                new Order(4, "Someone2", 200.0)
        };

        BubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted by totalPrice using Bubble Sort:");
        System.out.println(Arrays.toString(orders));

        orders = new Order[]{
                new Order(1, "Jos", 250.0),
                new Order(2, "Someone1", 300.0),
                new Order(3, "Vincy", 150.0),
                new Order(4, "Someone2", 200.0)
        };

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by totalPrice using Quick Sort:");
        System.out.println(Arrays.toString(orders));
    }
}
