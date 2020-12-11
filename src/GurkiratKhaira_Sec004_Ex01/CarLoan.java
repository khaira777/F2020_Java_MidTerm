// Gurkirat Singh Khaira - #301112565 - COMP228 - Sec004

package GurkiratKhaira_Sec004_Ex01;

import java.time.LocalDate;

public class CarLoan extends Loan {
	// instance variable
	double yearlyCarInsuraceAmount;
	
	// getter setter
	public double getYearlyCarInsuranceAmount() {
		return yearlyCarInsuraceAmount;
	}
	public void setYearlyCarInsuraceAmount(double newYearlyCarInsuraceAmount) {
		if (newYearlyCarInsuraceAmount <= 0) {
			throw new IllegalArgumentException("Yearly car insurance amount cannot zero or negative.");
		}
		yearlyCarInsuraceAmount = newYearlyCarInsuraceAmount;
	}
	
	// constructor
	public CarLoan(int loanNumber, String customerName, LocalDate dateOfBirth, double loanAmount,
			double rateOfInterest, double loanDuration, int number, String streetName, String city, String province,
			String zipCode, double yearlyCarInsuranceAmount) {
		super(loanNumber, customerName, dateOfBirth, loanAmount, rateOfInterest, loanDuration, number, streetName, city,
				province, zipCode);
		this.yearlyCarInsuraceAmount = yearlyCarInsuranceAmount;
	}
	
	// overriding CalculateMonthlyLoanInstallment method
	@Override
	public double CalculateMonthlyLoanInstallment() {
		double interest = (loanAmount * rateOfInterest * loanDuration)/100;
		double monthlyCarLoanInstallment = ((interest + loanAmount)/(loanDuration * 12));
		double total = monthlyCarLoanInstallment + (yearlyCarInsuraceAmount/12);
		return total;
	}
	
	// overriding toString method
	@Override
	public String toString() {
		return super.toString() + "\nYearly car Insurance: " + yearlyCarInsuraceAmount + "\nMonthly Loan Total: " + CalculateMonthlyLoanInstallment();
	}
}
