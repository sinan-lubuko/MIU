package com.exception;

public class Fraction {

    /** the numerator of this fraction */
	private int numerator;

    /** the denominator of this fraction */
	private int denominator;

	//denom cannot be 0
    public Fraction(int num, int denom) throws Exception {
    	if(denom == 0){
    		throw new Exception("Denominator can not be zero");
		}
    	setNumerator(num);
    	setDenominator(denom);
    }
    
    //denom cannot be 0
	public void setDenominator(int denom) throws Exception{
		if(denom == 0){
			throw new Exception("Denominator can not be zero");
		}
		denominator = denom;
    }

	public void setNumerator(int num) {
        numerator = num;
    }

	//4/5 3/4
    public static Fraction add(Fraction f1, Fraction f2) throws Exception {
        int a, b, c, d;

        Fraction sum;

        a = f1.getNumerator();
        b = f1.getDenominator();
        c = f2.getNumerator();
        d = f2.getDenominator(); //
        sum = new Fraction(a*d + b*c, b*d); // (4*4+3*5)/20
        return sum;
    }

	public int getDenominator( ) {
		return denominator;
	}

	public int getNumerator( ) {
		return numerator;
	}
	
	public static void main(String[] args) {
		try {
			Fraction f1 = new Fraction(4, 0);
			Fraction f2 = new Fraction(3, 4);
			Fraction f3 = add(f1, f2);
			System.out.println(f3.getNumerator() + "/" + f3.getDenominator());
		} catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	
	}
}

