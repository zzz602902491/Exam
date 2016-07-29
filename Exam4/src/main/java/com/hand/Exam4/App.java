package com.hand.Exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App 
{
    public static void main( String[] args )
    {
    	int[] arr = new int[50];
    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> intlist =null;
    	Map<Integer,int[]> map = new TreeMap<Integer,int[]>();
    	System.out.print("随机生成的50个数分别为：");
        for(int i=0;i<50;i++)
        {
        	arr[i] = (int)(Math.random()*100);
        	System.out.print(arr[i]+" ");
        }
    	for(int i=0;i<50;i++)
    	{
    		list.add(arr[i]);
    	}
    	for(int i:list)
    	{
    		int c=(int)(i/10);
    		for(int m:list)
    		{
    			intlist = new ArrayList<Integer>();
    			if((int)(m/10)==c)
    			{
    				intlist.add(m);
    			}
    			Object[] ints = intlist.toArray();
    			int[] numbers = new int[ints.length];
    			for(int j=0;j<ints.length;j++)
    			{
    				numbers[j]=(Integer)ints[j];
    			}
    			map.put(i, numbers);
    		}
    		
    	}
    	System.out.println();
    	Set<Integer> keySet = map.keySet();
    	for(int k:keySet)
    	{
    		System.out.println(k+"-->");
    		int[] arrays = map.get(k);
    		sort1(arrays);
    		for(int l=0;l<arrays.length;l++)
    		{
    			System.out.print(arrays[l]+"  ");
    		}
    	}
    }
    public static void sort1(int data[]) {  
        for (int i = 0; i < data.length -1; i++) {  
            for (int j = 0; j < data.length - i - 1; j++) {  
                if (data[j] > data[j + 1]) {  
                    int temp = data[j];  
                    data[j] = data[j + 1];  
                    data[j + 1] = temp;  
                }  
  
            }  
        }  
    }  
}
