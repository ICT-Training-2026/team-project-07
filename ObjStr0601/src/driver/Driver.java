package driver;

import store.Product;
import store.SpecialProduct;

public class Driver
{
	public static void main(String[] args) 
	{
		int i;
		Product[] sprod = {
			new Product("マウス",2000),
			new SpecialProduct("特価キーボード",3600,4500),
		};
		for(i=0;i<sprod.length;i++)
		{
			sprod[i].display();
		}
	}
}