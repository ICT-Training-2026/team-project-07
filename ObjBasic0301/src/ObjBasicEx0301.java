public class ObjBasicEx0301
{
	int price;
	String name;
	
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
	};
}