package studio7;

public class Fraction {

	int numerator;
	int denominator;
	public Fraction()
	{
		numerator = 0;
		denominator = 0;
	}
	public Fraction(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}

	public Fraction addFractions(Fraction f2)
	{
		Fraction sum = new Fraction(numerator * f2.getDenominator() + denominator * f2.getNumerator(), denominator *f2.getDenominator());
		return sum;
	}
	public Fraction multiplyFractions(Fraction f2)
	{
		Fraction product = new Fraction(numerator * f2.getNumerator(), denominator * f2.getDenominator());
		return product;
	}
	public Fraction getReciprocal()
	{
		Fraction turned = new Fraction(denominator, numerator);
		return turned;
	}
	public Fraction simplify()
	{
		int divisor = 1;
		int i = numerator;
		while(i > 1)
		{
			if(denominator%i == 0 && numerator%i ==0)
			{
				divisor = i;
			}
			i--;
		}
		Fraction simplified = new Fraction(numerator/divisor,denominator/divisor);
		return simplified;
	}
	public String toString()
	{
		return numerator + " / " + denominator; 
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(7,9);
		System.out.println(f1);
		System.out.println(f1.addFractions(f2));
		System.out.println(f1.multiplyFractions(f2));
		System.out.println(f1.addFractions(f2).simplify());

	}

}
