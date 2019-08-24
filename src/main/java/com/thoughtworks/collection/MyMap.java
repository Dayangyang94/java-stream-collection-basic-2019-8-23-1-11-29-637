package com.thoughtworks.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
//    	List<Integer> list=new ArrayList<Integer>();
//    	for(int i=0;i<array.size()-1;i++) {
//    		for(int j=0;j<array.size()-i-1;j++) {
//    			if(array.get(j)<array.get(j+1)) {
//    				int temp1=array.get(j+1);
//    				int temp2=array.get(j);
//    			}
//    		}
//    	}
    	Collections.reverse(array);
    	return array;

    }

    public List<Integer> sortFromSmall() {
    	Collections.sort(array);
    	return array;
        
    }
}
