package br.com.gustavoakira.store.productservice.core.event;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductCreatedEvent {
	private String productId;
	private String title;
	private BigDecimal price;
	private Integer quantity;
}