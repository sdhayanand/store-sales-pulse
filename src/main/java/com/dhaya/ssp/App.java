package com.dhaya.ssp;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SaleEvent sale = new SaleEvent("S001", "SUIT-NAVY-40R", 2, new BigDecimal("49.99"), Instant.parse("2026-11-02T18:30:00Z"));

        System.out.println("Hello World!");
        System.out.println(sale + " Total: " + sale.lineTotal());
    }
}
