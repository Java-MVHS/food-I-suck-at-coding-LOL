public class Pizza3 extends Food3
{
	public Pizza3(String stuff, int number, int value)//constructor for regular pizzas, 3 parameters
	{
		super("baked", stuff, "pizza", number, value);//call Food3's constructor
	}
	public Pizza3(String name, String stuff, int number, int value)//overloaded constructor for deep dish pizzas, 4 parameters
	{
		super("baked", stuff, name, number, value);//call Food3's constructor
	}
}
