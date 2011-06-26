package product;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * 
 * @author hasan
 *
 */

public class ProductManager implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	private ArrayList<Category> categoryList = new ArrayList<Category>();

	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<Category> categoryList) {
		this.categoryList = categoryList;
	}
	
	/*
	 * Adds a product to the list in the given category
	 * throws NoSuchCategoryException if the given category is not found
	 */
	public void addProduct(Product product, String category) throws NoSuchCategoryException{
		
		for(int i = 0; i <= categoryList.size(); i++){
			if(i == categoryList.size())
				throw new NoSuchCategoryException();
			
			if(categoryList.get(i).getName().equalsIgnoreCase(category)){
				categoryList.get(i).getProductList().add(product);
				break;
			}
		}
	}
	
	/*
	 *Finds and returns the product which has the given id
	 *returns null if such a product cannot be found
	 */
	public Product getProduct(int id){
		
		for(int i = 0; i < categoryList.size(); i++){
			for(int j = 0; j < categoryList.get(i).getProductList().size(); j++){
				if(id == categoryList.get(i).getProductList().get(j).getId())
					return categoryList.get(i).getProductList().get(j);
			}
		}
		
		return null;
	}
	
	//adds a new category to the list
	public void addCategory(String name){
		categoryList.add(new Category(name, new ArrayList<Product>()));
	}
	
	/*
	 * return an object of Category for the given parameter
	 * returns null if such a category cannot be found
	 */
	public Category getCategory(String name){
		for(int i = 0; i < categoryList.size(); i++)
			if(categoryList.get(i).getName().equalsIgnoreCase(name))
				return categoryList.get(i);
		
		return null;
	}

}
