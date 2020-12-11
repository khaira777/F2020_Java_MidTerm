// Gurkirat Singh Khaira - #301112565 - COMP228 - Sec004

package GurkiratKhaira_Sec004_Ex01;

import java.time.LocalDate;
//import java.time.Month;

public abstract class Loan {
	// instance variables
	final int loanNumber;
	String customerName;
	LocalDate dob;
	double loanAmount;
	double rateOfInterest;
	double loanDuration; // in years

	// object for address class to set the address fields in constructor using
	// setters
	Address address = new Address();

	// getters and setters
	public int getLoanNumber() {
		return loanNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String newCustomerName) {
		customerName = newCustomerName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate newDate) {
		dob = newDate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double newLoanAmount) {
		// validation
		if (newLoanAmount <= 0) {
			throw new IllegalArgumentException("Loan amount cannot zero or negative.");
		}
		loanAmount = newLoanAmount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double newRateOfInterest) {
		// validation
		if (newRateOfInterest <= 0 || newRateOfInterest > 5) {
			throw new IllegalArgumentException("Rate of interest cannot zero, negative or greater than 5.");
		}
		rateOfInterest = newRateOfInterest;
	}

	public double getloanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(double newLoanDuration) {
		loanDuration = newLoanDuration;
	}

	// constructor to initialize all data variables
	public Loan(int loanNumber, String customerName, LocalDate dateOfBirth, double loanAmount, double rateOfInterest,
			double loanDuration, int number, String streetName, String city, String province, String zipCode) {
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		dob = dateOfBirth; // LocalDate.of( 2019 , Month.JANUARY , 23 );
		this.loanAmount = loanAmount;
		this.rateOfInterest = rateOfInterest;
		this.loanDuration = loanDuration;
		address.setNumber(number);
		address.setStreetName(streetName);
		address.setCity(city);
		address.setProvince(province);
		address.setZipCode(zipCode);
	}
	//  initializing only Loan number, customer name, date of birth and address
	public Loan(int loanNumber, String customerName, LocalDate dateOfBirth, int number, String streetName, String city,
			String province, String zipCode) {
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.dob = dateOfBirth;
		address.setNumber(number);
		address.setStreetName(streetName);
		address.setCity(city);
		address.setProvince(province);
		address.setZipCode(zipCode);
	}

	public abstract double CalculateMonthlyLoanInstallment();

	// toString method
	public String toString() {
		return "Loan Number: " + loanNumber + "\n" + "Customer: " + customerName + "\n" + "Date of birth: " + dob + "\n"
				+ "Loan amount: " + loanAmount + "\n" + "Interest: " + rateOfInterest + "\n" + "Duration: "
				+ loanDuration + "\n" + "Customer Address" + address.toString();
	}
}
