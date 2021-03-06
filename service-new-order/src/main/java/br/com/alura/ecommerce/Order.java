package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String userId, orderId;
    private final BigDecimal amount;
    private String email;

    public Order(String userId, String orderId, BigDecimal amount, String email) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", email='" + '\'' +
                ", amount=" + amount +
                '}';
    }
}
