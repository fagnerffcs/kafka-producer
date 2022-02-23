package br.com.alura.ecommerce;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Order {

    private final String userId, orderId, email;
    private final BigDecimal amount;

    public Order(String userId, String orderId, BigDecimal amount, String email) {
        this.userId = userId;
        this.orderId = orderId;
        this.email = email;
        this.amount = amount;
    }

    public String getEmail() {
        return this.email;
    }
}
