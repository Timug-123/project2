package BoutiqueManagmentsys.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prdtId;
	private String name;
	private String description;
	private Double price;
	private int stock;
	private LocalDateTime stockDate = LocalDateTime.now();

	public Product(String name, String description, Double price, int stock, LocalDateTime stockDate) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.stockDate = stockDate;

	}

	public Product() {

	}

	public int getPrdtId() {
		return prdtId;
	}

	public void setPrdtId(int prdtId) {
		this.prdtId = prdtId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDateTime getStockDate() {
		return stockDate;
	}

	public void setStockDate(LocalDateTime stockDate) {
		this.stockDate = stockDate;
	}

}
