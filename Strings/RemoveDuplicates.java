package com.Strings;

		import java.util.ArrayList;

		import java.util.Arrays;

		import java.util.Collections;

		import java.util.HashMap;

		import java.util.LinkedHashMap;

		import java.util.List;

		import java.util.Map;

		import java.util.Scanner;

		import java.util.Set;

		 

		public class RemoveDuplicates {

		    public static void main(String[] args) {


		        LinkedHashMap<Character, Integer> lhp = new LinkedHashMap<Character, Integer>();

		        Scanner sc = new Scanner(System.in);

		        System.out.println("String :");
		        
		        String s = sc.nextLine();

		        for(int i=0;i<s.length();i++) {

		            lhp.put(s.charAt(i), i);

		        }

		        Set<Map.Entry<Character,Integer>> duplicate = lhp.entrySet();

		        for(Map.Entry<Character, Integer> value: duplicate) {

		            System.out.print(value.getKey());

		        }

//		        lhp.forEach((key,value)->{
//
//		            System.out.print(key);
//
//		        });
//		        System.out.println(lhp);
		    }
	}


