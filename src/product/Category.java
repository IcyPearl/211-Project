package product;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author hasan
 *
 */

public class Category implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private String name;
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	public Category(String name, ArrayList<Product> productList) {
		this.name = name;
		this.productList = productList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	
}
