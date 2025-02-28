package org.example;

public class Calculator
{
	Double findSquareRoot(Double inpX)
	{
                if(inpX < 0)
                {
                        System.out.println("Negative number, Square root doen't exist");
			return null;
                }
                else
                {
                        System.out.print("The square root of given number is: ");
                        Double sqr = Math.sqrt(inpX);
			System.out.println(sqr);
			return sqr;
                }
	}

	Integer findFactorial(Integer x)
	{
		if(x < 0)
                {
                        System.out.println("Negative number, Factorial doen't exist");
                        return null; 
                }
                else
                {
                        Integer fact = 1;
                        for(int i = 1; i <= x; i++)
                        {
                                fact = fact * i;
                        }
                        System.out.print("The factorial is: ");
                        System.out.println(fact);
			return fact; 
                }
	}

	Double findNaturalLog(Double x)
	{
		if(x < 0)
                {
                        System.out.println("Natural log of negative numbers is not defined!");
                	return null;
		}
                else if(x == 0.0)
                {
                        System.out.println("Natural log of 0 is not defined! Exiting...");
                	return null; 
		}
                else
                {
                        Double res = Math.log(x);
                        System.out.print("The natural log is: ");
                        System.out.println(res);
			return res; 
                }
	}

	Double findPower(Double base, Double power)
	{
		Double res = Math.pow(base, power);
		if(Double.isNaN(res))
		{
			System.out.println("Error, cannot compute power");
			return null;
		}
		else
		{
			System.out.print("The result is: ");
			System.out.println(res);
			return res; 
		}
	}
}
