package com.thoughtworks.collection;



import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list=new ArrayList<>();
        for (Integer integer : array) {
			if(integer%2==0) {
				list.add(integer);
			}
		}
        return list;
        
    }

    public List<Integer> filterMultipleOfThree(){
    	 List<Integer> list=new ArrayList<>();
         for (Integer integer : array) {
 			if(integer%3==0) {
 				list.add(integer);
 			}
 		}
         return list;
    }
}
