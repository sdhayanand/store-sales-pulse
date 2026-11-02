package com.dhaya.ssp;

import java.math.BigDecimal;
import java.time.Instant;

public record SaleEvent(String storeId, String sku, int qty, BigDecimal price, Instant eventTime ) {

    public BigDecimal lineTotal() {
        return price.multiply(BigDecimal.valueOf(qty));
    }
}
