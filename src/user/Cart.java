package user;
import java.io.Serializable;
import java.util.ArrayList;

import product.ProductManager;


public class Cart implements Serializable
{
	ArrayList<String> idCountList = new ArrayList<String>();
	private static final long serialVersionUID = 13L;

	public void buy(ProductManager manager)
	{
		calculateTotalCost(manager);		
		//FILEIO.save(idCountList); to save history		
		idCountList.clear();
	}

	public void addProduct(int id , int count)
	{
		// checks if List has any product with same id, if so just changes the count
		// else it adds to the list
		for (String pr : idCountList)
		{
			String []line = pr.split(" ");
			int productId = Integer.parseInt(line[0]);
			int productCount = Integer.parseInt(line[1]);

			if ( id == productId)
			{
				productCount += count;
				return;
			}			
		}
		idCountList.add(id+" "+count);

	}
	public boolean removeProduct(int id, int deleteCount)
	{
		for (int i=0; i < idCountList.size() ; i++) {

			String []line = idCountList.get(i).split(" ");
			int productId = Integer.parseInt(line[0]);
			int productCount = Integer.parseInt(line[1]);

			if ( id == productId)
			{
				if (productCount >= deleteCount)
				{
					productCount -=deleteCount;	
					return true;
				}
				else
				{	//if deleteCount is bigger then productCount, it will be removed from the list
					idCountList.remove(i);
					return true;
				}
			}
		}
		return false;

	}

	// calculates total cost...
	public double calculateTotalCost(ProductManager manager)
	{
		double totalCost=0;
		for (String pr : idCountList)
		{
			String []line = pr.split(" ");
			int productId = Integer.parseInt(line[0]);
			int productCount = Integer.parseInt(line[1]);

			for (int j = 0; j < line.length; j++)
			{
				for (int j2 = 0; j2 < line.length; j2++)
				{
					if (manager.getCategoryList().get(j).getProductList().get(j2).getId() == productId )
					{
						totalCost += manager.getCategoryList().get(j).getProductList().get(j2).getCost() * productCount ;
					}
				}
			}
		}
		return totalCost;
	}
}
