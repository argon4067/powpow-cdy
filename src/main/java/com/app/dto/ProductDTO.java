package com.app.dto;

import java.util.Objects;

public class ProductDTO {
	private Long id;
	private Long productCategoryId;
	private Long sellerId;
	private String productName;
	private int productPrice;
	private String productAge;
	private String productImage;
	private String productCode;
	private String productDate;
	private int productStock;
	private String productType;
	private String productEditDate;
	private String productDetail;
	private String productSubImage1;
	private String productSubImage2;
	private String productSubImage3;
	
	public ProductDTO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductAge() {
		return productAge;
	}

	public void setProductAge(String productAge) {
		this.productAge = productAge;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDate() {
		return productDate;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductEditDate() {
		return productEditDate;
	}

	public void setProductEditDate(String productEditDate) {
		this.productEditDate = productEditDate;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public String getProductSubImage1() {
		return productSubImage1;
	}

	public void setProductSubImage1(String productSubImage1) {
		this.productSubImage1 = productSubImage1;
	}

	public String getProductSubImage2() {
		return productSubImage2;
	}

	public void setProductSubImage2(String productSubImage2) {
		this.productSubImage2 = productSubImage2;
	}

	public String getProductSubImage3() {
		return productSubImage3;
	}

	public void setProductSubImage3(String productSubImage3) {
		this.productSubImage3 = productSubImage3;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", productCategoryId=" + productCategoryId + ", sellerId=" + sellerId
				+ ", productName=" + productName + ", productPrice=" + productPrice + ", productAge=" + productAge
				+ ", productImage=" + productImage + ", productCode=" + productCode + ", productDate=" + productDate
				+ ", productStock=" + productStock + ", productType=" + productType + ", productEditDate="
				+ productEditDate + ", productDetail=" + productDetail + ", productSubImage1=" + productSubImage1
				+ ", productSubImage2=" + productSubImage2 + ", productSubImage3=" + productSubImage3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(id, other.id);
	}



	
	
	
}
