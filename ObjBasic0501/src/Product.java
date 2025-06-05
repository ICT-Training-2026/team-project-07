
public class Product 
{
	String name;
	int price;
	
	Product (String name,int proce)
	{
		this.name = name;
		this.price = proce;
	}
	
	int up(int amt)
	{
		return price += amt;
	}
	
	int down(int amt)
	{
		return price -= amt;
	}
	
	void display()
	{
		System.out.println(name + "：" + price + "円");
	}
}
