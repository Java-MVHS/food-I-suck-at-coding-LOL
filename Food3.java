//Richard Li
//10-23-24
//working on: creating instances of classes

/*
  Food3.java
  
*/


public class Food3
{
	protected String str;
	
	
	public Food3 ()
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int pieces, int cost)//constructor with 5 parameters
	{	
		str = String.format("At the sale: " + name + "(s) " + prepMethod + " with " + ingredient + " will be sold for %1d cents each."
		+ " With " + pieces + " " + name + "(s), $%.2f can be made.", cost, (double)(pieces)*cost/100);//assemble info into a string
	}

	public void printForSale()//method to print the assembled string
	{
		System.out.println(str);
	}
}
