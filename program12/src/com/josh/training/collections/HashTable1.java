package com.josh.training.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101, "josh");
		ht.put(102, "first american");
		ht.put(103, "infosys");
		ht.put(106,"freshworks");
		//t.put(null,"x");//NullpointerException
		//t.put(104,null); //null pointer exception
		System.out.println(ht);
		System.out.println(ht.get(103));
		
		ht.remove(106);
		System.out.println(ht);
		
		System.out.println(ht.containsKey(101));
		System.out.println(ht.containsValue("josh"));
		
		System.out.println(ht.isEmpty()); //false
		System.out.println(ht.keySet()); //all key values
		System.out.println(ht.values());//all values
		
		for(int k :ht.keySet())
		{
			System.out.println(k+"      "+ht.get(k));
		}
		//entry specific methods..
		for(Map.Entry entry:ht.entrySet()) //key,value
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
