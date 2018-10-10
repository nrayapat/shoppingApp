package com.capgemini.onlineshopping.entity;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Product {

	@Id
	private int productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	private Map<String, Object> productSpecification;

	public Product() {
		super();
	}

	public Product(int productId, String productName, String productCategory, double productPrice,
			Map<String, Object> productSpecification) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productSpecification = productSpecification;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Map<String, Object> getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(Map<String, Object> productSpecification) {
		this.productSpecification = productSpecification;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", productSpecification=" + productSpecification
				+ "]";
	}

	
}