package driver;

import store.AbsProduct;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver
{
	public static void main(String[] args) 
	{
		AbsProduct[] prod = makeProductList();
		
		System.out.println("\n---商品リスト---");
		displayProductList(prod);
	}


	static AbsProduct[] makeProductList()
	{
		AbsProduct[] prod =
			{
					new LimitedProduct("マウス",2000,10),
					new SpecialProduct("特価キーボード",3600,4500),
					new LimitedProduct("Webカメラ",3900,7),
					new NormalProduct("マイク",2800),
					new SpecialProduct("ディスプレイ",15000,20000),
					new NormalProduct("LED",4200)
			};
		return prod;
	}

	static void displayProductList(AbsProduct[] absProd)
	{
		for(int i = 0; i <absProd.length; i++)
		{
			absProd[i].display();
		}
	}
}
