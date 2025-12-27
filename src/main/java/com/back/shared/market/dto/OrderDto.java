package com.back.shared.market.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class OrderDto {
    private final int id;
    private final LocalDateTime createDate;
    private final LocalDateTime modifyDate;
    private final int customerId;
    private final String customerName;
    private final int price;
    private final int salePrice;
    private final LocalDateTime requestPaymentDate;
    private final LocalDateTime paymentDate;
}
