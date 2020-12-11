// Gurkirat Singh Khaira - #301112565 - COMP228 - Sec004

package GurkiratKhaira_Sec004_Ex01;

public class Address {
	// instance variables
	int number;
	String streetName;
	String city;
	String province;
	String zipCode;
	
	//getters and setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String newStreetName) {
		streetName = newStreetName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String newCity) {
		city = newCity;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String newProvince) {
		province = newProvince;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String newZipCode) {
		zipCode = newZipCode;
	}
	
	// toString method
	public String toString() {
		return "\nHouse Number: " + number + "\n" 
				+ "Street Name: " + streetName + "\n"
				+ "City: " + city + "\n"
				+ "Province: " + province + "\n"
				+ "Zip Code: " + zipCode;
	}
}