// SIB 27 ANURAG PATIL
public class Bag {
	// ALL CLASS  AND INSTANCE VARIABLES.
	
	private double weight;
	private String color;
	private static int count;
	private static double totalWeight;
	
	// ALL FOUR TYPE OF CONSTRUCTOR. 
	public Bag()
	{
		color="RED";
		weight=8.5;
		Bag.count++;
		Bag.totalWeight+=weight;
	}
	public Bag(String c,double w)
	{
		color=c;
		weight=w;
		Bag.count++;
		Bag.totalWeight+=weight;
		
	}
	public Bag(double w)
	{
		color="RED";
		weight=w;
		Bag.count++;
		Bag.totalWeight+=weight;
		
	}
	public Bag(String c)
	{
		color=c;
		weight=8.5;
		Bag.count++;
		Bag.totalWeight+=weight;
		
	}
	
	public String display()
	{
		return "COLOR IS "+color+","+"WEIGHT IS "+weight;
	}
	
	public void decrement()
	{
		Bag.count--;
		Bag.totalWeight-=weight;
	}
	
	public static int get_count()
	{
		return Bag.count;
	}
	
	public static double get_totalWeight()
	{
		return Bag.totalWeight;
	}
	
}



