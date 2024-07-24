package com.graymatter;

import java.util.Stack;

public class DemoOnStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		
		st.push(78);
		st.push(455);
		st.push(90);
		st.push(55);
		System.out.println(st);
		System.out.println(st.capacity());

		st.trimToSize();
		System.out.println(st.capacity());
		
		st.add(89);
		System.out.println(st.capacity());
	}

}
