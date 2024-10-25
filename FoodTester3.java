//Richard Li
//10-23-24
//working on: creating instances of classes, calling super classes, using String.format

/*
  Food.java
  
*/


public class FoodTester3
{
	public static void main(String[] args)// main method
	{	
		FoodTester3 temp = new FoodTester3();//create instance of FoodTester3
		temp.printStuff(); //call FoodTester3's print method to print 3 blank lines
		Food3	food1	=	new	Food3	("baked",	"banana",	"muffin", 12, 50); //create instance of Food3(food1), 5 parameters for constructor
		food1.printForSale(); //print string containing info about the item
		Food3	food2	=	new	Food3	("fried",	"yams",	"fritter", 3, 100); //create instance of Food3(food2), 5 parameters for constructor
		food2.printForSale(); //print string containing info about the item
		Pizza3	pizza	=	new	Pizza3	("pepperoni", 8, 250);//create instance of Pizza3(pizza), 3 parameters, all pizza is baked/called pizza
		pizza.printForSale(); //print string containing info about the item
		DeepDishPizza3 pizza2 = new DeepDishPizza3 ("cheese", 8, 250);// //create instance of DeepDishPizza3(pizza2), 3 parameters for constructor
		pizza2.printForSale(); //print string containing info about the item
		temp.printStuff(); //call FoodTester3's print method to print 3 blank lines
	}
	public void printStuff()//method to print 3 blank lines
	{
		System.out.print("\n\n\n");
	}
}
