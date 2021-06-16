/**
 * 
 */
package com.example.demo.withlist;

import java.util.List;

/**
 * @author C 19472
 *
 */
public class SampleSourceWithList {

	private String name;
	private String address;
	private List<SampleChildSrc> childSrcList;
	
	
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
		return "SampleSourceWithList [name=" + name + ", address=" + address + ", childSrcList=" + childSrcList + "]";
	}
	
	public List<SampleChildSrc> getChildSrcList() {
		return childSrcList;
	}
	public void setChildSrcList(List<SampleChildSrc> childSrcList) {
		this.childSrcList = childSrcList;
	}
	
}
