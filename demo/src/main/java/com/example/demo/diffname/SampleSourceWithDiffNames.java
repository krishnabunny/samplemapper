/**
 * 
 */
package com.example.demo.diffname;

/**
 * @author C 19472
 *
 */
public class SampleSourceWithDiffNames {

	private String fullName;
	private String fullAddress;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	@Override
	public String toString() {
		return "SampleSourceWithDiffNames [fullName=" + fullName + ", fullAddress=" + fullAddress + "]";
	}
	
	
	
}
