package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스 (Entity)
 * 
 * 변수
 * 기본 생성자
 * 전체 생성자
 * getter/setter
 * hashCode()
 * equals()
 * toSting()
 * 
 */


public class Product {
	
	
	
	private int product_code;
	private String product_name;
	private int product_category;
	private LocalDate production_Date;
	
	public Product() {}

	public Product(int product_code, String product_name, int product_category, LocalDate production_Date) {
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_category = product_category;
		this.production_Date = production_Date;
	}
	
	

	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_category() {
		return product_category;
	}
	public void setProduct_category(int product_category) {
		this.product_category = product_category;
	}
	public LocalDate getProduction_Date() {
		return production_Date;
	}
	public void setProduction_Date(LocalDate production_Date) {
		this.production_Date = production_Date;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(product_category, product_code, product_name, production_Date);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return product_category == other.product_category && product_code == other.product_code
				&& Objects.equals(product_name, other.product_name)
				&& Objects.equals(production_Date, other.production_Date);
	}

	
	
	@Override
	public String toString() {
		return "Product [product_code=" + product_code + ", product_name=" + product_name + ", product_category="
				+ product_category + ", production_Date=" + production_Date + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
