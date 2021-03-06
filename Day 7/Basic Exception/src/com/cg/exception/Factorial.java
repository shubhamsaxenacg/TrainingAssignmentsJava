package com.cg.exception;

public class Factorial {
	
	
	public int getFactorial(int num) throws FactorialException, InvalidInputException
	{
//...........Checks wheteher the input value is less than 2 and throws exception
		int factorial = 1;
		if(num<2)
		{
			throw new InvalidInputException("Value is invalid");
		}
		
		for(int i =1; i<=num; i++)
		{
	//...........Calculates factorial and throws exception if it exceeds int size
			factorial = factorial *i;
			if(factorial>2147483647 || factorial<=0)
			{
				throw new FactorialException("Value exceed limit");
			}
		}
		
	//........Returns factorial 
		return factorial;
	}
}
