public class Pizza extends Food
{
	public Pizza(String stuff)//regular pizza constructor, 1 parameter
	{
		super("baked", stuff, "pizza");//call Food's constructor, 3 parameters
	}
	public Pizza(String name, String stuff)//deep dish pizza constructor, 2 parameters
	{
		super("baked", stuff, name);//call Food's constructor, 3 parameters
	}
}
