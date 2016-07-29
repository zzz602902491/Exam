package com.hand.Exam2;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("请输入工资：");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double sal = d-3500;
		double tax = 0;
		if(sal>0&&sal<=1500)
		{
			tax=sal*0.03;
		}
		else if(sal>1500&&sal<=4500)
		{
			tax=1500*0.03+(sal-1500)*0.1;
		}
		else if(sal>4500&&sal<=9000)
		{
			tax=(1500*0.03)+(3000*0.1)+(sal-4500)*0.2;
		}
		else if(sal>9000&&sal<=35000)
		{
			tax=(1500*0.03)+(3000*0.1)+(4500*0.2)+(sal-9000)*0.25;
		}
		else if(sal>35000&&sal<=55000)
		{
			tax=(1500*0.03)+(3000*0.1)+(4500*0.2)+(27000*0.25)*0.25+(sal-35000)*0.3;
		}
		else if(sal>55000&&sal<=80000)
		{
			tax=(1500*0.03)+(3000*0.1)+(4500*0.2)+(27000*0.25)*0.25+(20000*0.3)+(sal-55000)*0.35;
		}
		else if(sal>80000)
		{
			tax=(1500*0.03)+(3000*0.1)+(4500*0.2)+(27000*0.25)*0.25+(20000*0.3)+(25000*0.35)+(sal-80000)*0.45;
		}
		System.out.println("所需要交纳的税费为："+tax+"元");
    }
}
