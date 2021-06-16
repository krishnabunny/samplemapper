package com.example.demo.withlist;

public class SampleChildDest {

	private String childName;
	private String childAddress;
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildAddress() {
		return childAddress;
	}
	public void setChildAddress(String childAddress) {
		this.childAddress = childAddress;
	}
	@Override
	public String toString() {
		return "SampleChildSource [childName=" + childName + ", childAddress=" + childAddress + "]";
	}
	
	
}
