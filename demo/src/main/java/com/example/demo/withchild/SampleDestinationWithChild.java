/**
 * 
 */
package com.example.demo.withchild;

/**
 * @author C 19472
 *
 */
public class SampleDestinationWithChild {

	private String name;
	private String address;
	private SampleChildDestination sampleChildDestination;
	
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
		return "SampleDestinationWithChild [name=" + name + ", address=" + address + ", sampleChildDestination="
				+ sampleChildDestination + "]";
	}
	public SampleChildDestination getSampleChildDestination() {
		return sampleChildDestination;
	}
	public void setSampleChildDestination(SampleChildDestination sampleChildDestination) {
		this.sampleChildDestination = sampleChildDestination;
	}
	
}
