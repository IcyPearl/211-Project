package product;

import junit.framework.TestCase;

public class TestProduct extends TestCase{
	public void test_addCategory(){
		ProductManager pm = new ProductManager();
		pm.addCategory("cat1");
		pm.addCategory("cat2");
		pm.addCategory("cat3");
		int i = 1;
		for(Category cat : pm.getCategoryList()){
			assertTrue(cat.getName().equals("cat"+i));
			i++;
		}
	}
	public void test_getCategory(){
		ProductManager pm = new ProductManager();
		pm.addCategory("cat1");
		pm.addCategory("cat2");
		pm.addCategory("cat3");
		assertTrue(pm.getCategory("cat1").getName().equals("cat1"));
		assertTrue(pm.getCategory("cat2").getName().equals("cat2"));
		assertTrue(pm.getCategory("cat3").getName().equals("cat3"));
	}
	public void test_addProduct(){
		ProductManager pm = new ProductManager();
		pm.addCategory("cat1");
		pm.addCategory("cat2");
		pm.addCategory("cat3");
		try {
			pm.addProduct(new Product(0, 0, "guzel", false, 5, 0), "cat1");
			pm.addProduct(new Product(1, 0, "guzel", false, 5, 0), "cat2");
			pm.addProduct(new Product(2, 0, "guzel", false, 5, 0), "cat3");
		} catch (NoSuchCategoryException e) {
			assertTrue(false);
		}
		assertTrue(pm.getCategory("cat1").getProductList().get(0).getId() == 0);
		assertTrue(pm.getCategory("cat2").getProductList().get(0).getId() == 1);
		assertTrue(pm.getCategory("cat3").getProductList().get(0).getId() == 2);
	}
	public void test_addProduct_exception(){
		ProductManager pm = new ProductManager();
		boolean test = false ;
		try {
			pm.addProduct(new Product(0, 0, "guzel", false, 5, 0),"olmayan category");
		} catch (NoSuchCategoryException e) {
			test = true ;
		}
		assertTrue(test);
	}
	public void test_getProduct(){
		ProductManager pm = new ProductManager();
		pm.addCategory("cat1");
		pm.addCategory("cat2");
		pm.addCategory("cat3");
		try {
			pm.addProduct(new Product(0, 0, "guzel0", false, 5, 0), "cat1");
			pm.addProduct(new Product(1, 0, "guzel1", false, 5, 0), "cat2");
			pm.addProduct(new Product(2, 0, "guzel2", false, 5, 0), "cat3");
		} catch (NoSuchCategoryException e) {
			assertTrue(false);
		}
		assertTrue(pm.getProduct(0).getProperties().equals("guzel0"));
		assertTrue(pm.getProduct(1).getProperties().equals("guzel1"));
		assertTrue(pm.getProduct(2).getProperties().equals("guzel2"));
		assertTrue(pm.getProduct(1312) == null);
	}
}
