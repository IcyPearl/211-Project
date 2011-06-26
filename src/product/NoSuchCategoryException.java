package product;

public class NoSuchCategoryException extends Exception {
	
	public NoSuchCategoryException(){
		super("Category not found!");
	}

}
