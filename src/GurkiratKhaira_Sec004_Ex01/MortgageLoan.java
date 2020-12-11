// Gurkirat Singh Khaira - #301112565 - COMP228 - Sec004

package GurkiratKhaira_Sec004_Ex01;

import java.time.LocalDate;

public class MortgageLoan extends Loan {
	// instance variables
	double propertyTax;
	double infrastructureTax;

	// getter setters
	public double getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(double newPropertyTax) {
		// validation
		if (newPropertyTax <= 0) {
			throw new IllegalArgumentException("Property Tax cannot zero or negative.");
		}
		propertyTax = newPropertyTax;
	}

	public double getInfrastructure() {
		return infrastructureTax;
	}

	public void setInfrastructureTax(double newInfrastructureTax) {
		// validation
		if (newInfrastructureTax <= 0) {
			throw new IllegalArgumentException("Infrastructure Tax cannot zero or negative.");
		}
		infrastructureTax = newInfrastructureTax;
	}

	// constructor
	public MortgageLoan(int loanNumber, String customerName, LocalDate dateOfBirth, double loanAmount,
			double rateOfInterest, double loanDuration, int number, String streetName, String city, String province,
			String zipCode, double propertyTax, double infrastructureTax) {
		super(loanNumber, customerName, dateOfBirth, loanAmount, rateOfInterest, loanDuration, number, streetName, city,
				province, zipCode);
		this.propertyTax = propertyTax;
		this.infrastructureTax = infrastructureTax;
	}

	// Overriding CalculateMonthlyLoanInstallment method
	@Override
	public double CalculateMonthlyLoanInstallment() {
		double interest = (loanAmount * rateOfInterest * loanDuration)/100;
		double monthlyMortgageLoanInstallment = ((interest + loanAmount) / (loanDuration * 12));
		double total = monthlyMortgageLoanInstallment + propertyTax + infrastructureTax;
		return total;
	}

	// overriding toString method
	@Override
	public String toString() {
		return super.toString() + "\nProperty Tax: " + propertyTax + "\nInfrastucture Tax: " + infrastructureTax
				+ "\nMonthly Loan Total: " + CalculateMonthlyLoanInstallment();
	}
}
