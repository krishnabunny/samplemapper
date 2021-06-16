/**
 * 
 */
package com.example.demo.withlist;

import java.util.List;

/**
 * @author C 19472
 *
 */
public class SampleDestinationWithList {

	private String name;
	private String address;
	private List<SampleChildDest> childDestList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SampleDestinationWithList [name=" + name + ", address=" + address + ", childDestList=" + childDestList
				+ "]";
	}
	public List<SampleChildDest> getChildDestList() {
		return childDestList;
	}
	public void setChildDestList(List<SampleChildDest> childDestList) {
		this.childDestList = childDestList;
	}
	
}
