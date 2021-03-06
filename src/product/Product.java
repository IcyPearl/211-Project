package product;

import java.io.Serializable;


/**
 * 
 * @author hasan
 * 
 */

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private double cost;
	private String properties;
	private boolean isActive;
	private int leftInStock;
	private int saleCount;
	
	public Product(int id, double cost, String properties, boolean isActive,
			int leftInStock, int saleCount) {
		this.id = id;
		this.cost = cost;
		this.properties = properties;
		this.isActive = isActive;
		this.leftInStock = leftInStock;
		this.saleCount = saleCount;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getLeftInStock() {
		return leftInStock;
	}
	public void setLeftInStock(int leftInStock) {
		this.leftInStock = leftInStock;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

}
