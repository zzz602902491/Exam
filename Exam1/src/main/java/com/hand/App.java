package com.hand;


public class App 
{
    public static void main( String[] args )
    {
    	for(int i=100;i<=200;i++)
		{
			for(int j=2;j<i;j++)
			{
				if((i%j)==0)
					break;
				if(j==(i-1))
				{
					System.out.println(i);
				}
			}
		}
    }
}
