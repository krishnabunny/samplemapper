/**
 * 
 */
package com.example.demo.diffname;

/**
 * @author C 19472
 *
 */
public class SampleDestinationWithDiffNames {

	private String name;
	private String address;
	
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
		return "SampleDestination [name=" + name + ", address=" + address + "]";
	}
	
}
