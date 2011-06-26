package product;

public class NoSuchCategoryException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;

	public NoSuchCategoryException(){
		super("Category not found!");
	}

}
