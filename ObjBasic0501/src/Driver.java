public class Driver
{
	public static void main(String[] args) 
	{
		Product prod = new Product("キーボード",2000);
		System.out.println();
		prod.display();
		
		prod.up(1000);
		System.out.println();
		prod.display();
	}
}