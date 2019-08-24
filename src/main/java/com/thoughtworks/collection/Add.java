package com.thoughtworks.collection;


import java.util.List;

import org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder)  {
    	if(leftBorder>rightBorder) {
    		int item=leftBorder;
    		leftBorder=rightBorder;
    		rightBorder=item;
    	}
    	int sum=0;
    	for(int i=leftBorder;i<=rightBorder;i++) {
    		if(i%2==0) {
    			sum+=i;
    		}
    	}
    	return sum;
      
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList){
        int sum=0;
        for (Integer integer : arrayList) {
			int item=3*integer+2;
			sum+=item;
		}
        return sum;
    }

    public double getAverageOfEven(List<Integer> arrayList){
    	int sum=0;
    	int count=0;
        for (Integer integer : arrayList) {
        	if(integer%2==0) {
        		sum+=integer;
        		count++;
        	}
		}
        double avg=sum/count;
        return avg;
    }
}
