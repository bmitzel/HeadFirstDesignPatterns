public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		flyBehavior = new FlyWithWings(); // poor job of initializing the instance variables in a flexible way
		quackBehavior = new Quack();      // later in the book, more patterns will help fix this
	}
	
	public void display()
	{
		System.out.println( "I'm a real Mallard duck" );
	}
}
