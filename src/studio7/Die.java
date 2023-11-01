package studio7;

public class Die {
	private int sides;
	public Die()
	{
		sides = 0;
	}
	public Die(int s)
	{
		sides = s;
	}
	public int getSides()
	{
		return sides;
	}
	public int rollDice()
	{
		return (int)(Math.random() * (sides)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(6);
		System.out.println(d1);
		System.out.println(d1.getSides());
		System.out.println(d1.rollDice());
	}
	public String toString()
	{
		return "Sides " + sides;
	}
}
