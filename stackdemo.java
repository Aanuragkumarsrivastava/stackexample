import java.util.*;
class stackdemo
{
	public static void main(String args[])
	{
		Stack<String> ob = new Stack<String>();
		ob.push("hello");//push is used to insert the element in the stack
		ob.push("how");
		ob.push("are");
		ob.push("you");
		ob.push("!");
		ob.push(":)");
		System.out.println(ob);//it will display the pushed(added) element in the stack
		ob.pop();//pop will remove the topmost element in the stack
		System.out.println(ob);
		String a=ob.peek();//peek will display the topmost element in the stack
		System.out.println("the topmost element of the stack is "+a);

	}
}