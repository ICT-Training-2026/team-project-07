package driver;

import store.Product;
import store.SpecialProduct;

public class Driver
{
	public static void main(String[] args) 
	{
		Product mouse = new Product("マウス", 2000);
		
		mouse.display();
		
		SpecialProduct keyboard = new SpecialProduct("特価キーボード", 3600 ,4500);
		
		keyboard.display();
	}
}