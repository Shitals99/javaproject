package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add("shital");
		//System.out.println(v);
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
