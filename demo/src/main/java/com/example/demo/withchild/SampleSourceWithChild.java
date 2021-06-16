/**
 * 
 */
package com.example.demo.withchild;

/**
 * @author C 19472
 *
 */
public class SampleSourceWithChild {

	private String name;
	private String address;
	private SampleChildSource sampleChildSource;
	
	
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
		return "SampleSourceWithChild [name=" + name + ", address=" + address + ", sampleChildSource="
				+ sampleChildSource + "]";
	}
	public SampleChildSource getSampleChildSource() {
		return sampleChildSource;
	}
	public void setSampleChildSource(SampleChildSource sampleChildSource) {
		this.sampleChildSource = sampleChildSource;
	}
	
}
