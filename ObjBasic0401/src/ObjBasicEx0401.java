
public class ObjBasicEx0401 
{

	public static void main(String[] args) 
	{
		product prod = new product();
		prod.name = "キーボード";
		prod.price = 2000;
		System.out.println();
		prod.display();
		
		prod.down(400);
		System.out.println();
		prod.display();
	}

}
