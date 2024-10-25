public class FoodTester
{
	public static void main(String[] args)// main method
	{	
		FoodTester temp = new FoodTester();//create instance of FoodTester
		temp.printStuff(); //call FoodTester's print method to print 3 blank lines
		Food	food1	=	new	Food	("baked",	"banana",	"muffins"); //create instance of Food(food1), 3 parameters for constructor
		food1.printForSale();//print string containing info
		Food	food2	=	new	Food	("fried",	"yams",	"fritters"); //create instance of Food(food2), 3 parameters for constructor
		food2.printForSale();//print string containing info
		Pizza	pizza	=	new	Pizza	("pepperoni");//create instance of Pizza(pizza), 1 parameter, all pizza is baked/called pizza
		pizza.printForSale();//print string containing info
		DeepDishPizza pizza2 = new DeepDishPizza ("cheese");//create instance of DeepDishPizza, 1 parameter
		pizza2.printForSale();//print string containing info
		temp.printStuff(); //call FoodTester's print method to print 3 blank lines
	}
	public void printStuff()
	{
		System.out.print("\n\n\n");
	}
}
