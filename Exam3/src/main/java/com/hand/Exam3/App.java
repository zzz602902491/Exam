package com.hand.Exam3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
	public static void main(String[] args) {
				int year=0;
				int month=0;
				int day=0;
				int count=0;
				System.out.println("请输入日期：");
				String date=null;
				BufferedReader bfr=null;
				try {
					bfr = new BufferedReader(new InputStreamReader(System.in));
					date= bfr.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally {
					try {
						bfr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				String[] split = date.split("-");
				year = Integer.parseInt(split[0]);
				month=Integer.parseInt(split[1]);
				day=Integer.parseInt(split[2]);
				if(((year%4)==0&&(year%100)!=0)||(year%400)==0)
				{
					switch (month)
					{
					case 1:
						count=day;
						break;
					case 2:
						count=31+day;
						break;
					case 3:
						count=31+29+day;
						break;
					case 4:
						count=31+29+31+day;
						break;
					case 5:
						count=31+29+31+30+day;
						break;
					case 6:
						count=31+29+31+30+31+day;
						break;
					case 7:
						count=31+29+31+30+31+30+day;
						break;
					case 8:
						count=31+29+31+30+31+30+31+day;
						break;
					case 9:
						count=31+29+31+30+31+30+31+31+day;
						break;
					case 10:
						count=31+29+31+30+31+30+31+31+30+day;
						break;
					case 11:
						count=31+29+31+30+31+30+31+31+30+31+day;
						break;
					case 12:
						count=31+29+31+30+31+30+31+31+30+31+30+day;
						break;
					}
				}
				else
				{
					switch (month)
					{
					case 1:
						count=day;
						break;
					case 2:
						count=31+day;
						break;
					case 3:
						count=31+28+day;
						break;
					case 4:
						count=31+28+31+day;
						break;
					case 5:
						count=31+28+31+30+day;
						break;
					case 6:
						count=31+28+31+30+31+day;
						break;
					case 7:
						count=31+28+31+30+31+30+day;
						break;
					case 8:
						count=31+28+31+30+31+30+31+day;
						break;
					case 9:
						count=31+28+31+30+31+30+31+31+day;
						break;
					case 10:
						count=31+28+31+30+31+30+31+31+30+day;
						break;
					case 11:
						count=31+28+31+30+31+30+31+31+30+31+day;
						break;
					case 12:
						count=31+28+31+30+31+30+31+31+30+31+30+day;
						break;
					}
				}
				System.out.println("你输入的日期为当年的第"+count+"天");
	}

}
