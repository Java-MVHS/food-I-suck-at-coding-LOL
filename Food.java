//Richard Li
//10-23-24
//working on: creating instances of classes, calling super classes, using String.format

/*
  Food.java
  
*/


public class Food
{
	protected String str;
	
	
	public Food ()
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name)//Food's constructor, 3 parameters
	{	
		str = String.format("At the sale: " + name + " " + prepMethod + " with " + ingredient);//assemble info into string
	}

	public void printForSale()//method to print assembled string
	{
		System.out.println(str);
	}
}
