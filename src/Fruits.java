
public class Fruits {
	String name, color, taste;
	double weight;
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}

class Apple extends Fruits{
	public Apple(String name, double weight) {
		super (name);
		this.weight = weight;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	  }
}

class RedApple extends Apple{
	public RedApple(String name, String color, double weight) {
		super (name, weight);
		this.color = color;
		System.out.println("Color = " + this.color);
	}
}

class GreenApple extends Apple{
	public GreenApple(String name, String color, double weight) {
		super (name, weight);
		this.color = color;
		System.out.println("Color = "+this.color);
	}
}

class Banana extends Fruits{
	public Banana(String name, String color, String taste, double weight) {
		super (name);
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " color is "+ this.color);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	  }
}

class Papaya extends Fruits{
	public Papaya(String name, String color, String taste, double weight) {
		super (name);
		this.color = color;
		this.taste = taste;
		this.weight = weight;
		System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " color is "+ this.color);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	}
}

class Main {
	public static void main(String[] args) {
		Apple a = new Apple("Apple", 0.4);
		System.out.println();
		RedApple b = new RedApple("Red US Apple", "Red", 0.6);
		System.out.println();
		GreenApple c = new GreenApple("Green US Apple", "Green", 0.5);
		System.out.println();
		Banana d = new Banana("Banana","Yellow", "Sweet", 1.0);
		System.out.println();
		Papaya e = new Papaya("Papaya", "Orange", "Sweet", 2.0);
	}
}