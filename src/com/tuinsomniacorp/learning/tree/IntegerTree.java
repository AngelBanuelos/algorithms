package com.tuinsomniacorp.learning.tree;

public class IntegerTree implements Tree {

	int value;
	
	public IntegerTree(int value) {
		this.value = value;
	}


	@Override
	public int compareTo(Object o) {
		if (o instanceof Tree ) {
			Tree t = (Tree)o;
			if (t.intValue() == intValue()) {
				return 0;
			} else if (t.intValue() < intValue()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			throw new RuntimeException("Invalid type ");
		}
	}
	
	
	@Override
	public int intValue() {
		return 0;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return getValue() + "";
	}
	
}
