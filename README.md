# F2020_Java_MidTerm

Exercise 1: [ 50 marks ]

Write a Java application that implements the following class(s) as per business requirements mentioned below:

Create an abstract Loan class (Loan.java) that has the following instance variables:

- Loan number
- customer name
- customer date of birth (This should be represented by an object of predefined Date class in java), customer
address [( create a new Address class ( Address.java ) having following instance data members: House
number , Street name, City, Province, Zip code. Implement getter and setter and toString() method for
Address class. )],
- loan amount
- rate of interest and
- loan duration i.e. time
- Define getter and setter along with validations for all the above instance variables.
- Loan number should only have getter method and should be declared of the type final
- Loan amount and interest rate cannot be negative and zero.
- Interest rate should not be more than 5.0% in any given situation.
- Loan class should have defined two overloaded constructors:
o One for initializing all the instance data members
o Second for initializing only Loan number, customer name, date of birth and address
- Declare an abstract public method double CalculateMonthlyLoanInstallment() which is used for calculating
monthly loan installment amount.
- Define toString() to display the values

Create following two subclasses of Loan class:

a) MortgageLoan (MortgageLoan.java)
b) CarLoan (CarLoan.java)

For MortgageLoan class, implement the following:

- Define an instance variable – property tax for yearly property tax
- Define another instance variable –infrastructure tax for municipal infrastructure which is a fixed monthly
amount added to while calculating monthly loan installment amount
- Define getters and setters for the above and validations. Property tax and infrastructure tax should not be
negative and zero.
- A Constructor for initializing all the instance variables
- Overriding the method - double CalculateMonthlyLoanInstallment() which calculates monthly mortgage
loan installment and to this installment amount, you need to add property tax and infrastructure tax.
- You need to override toString() method to display the object’s data.

For CarLoan class, implement the following:

- Define an instance variable – yearly car insurance amount and provide getter and setter and validation. It
should not be negative and zero.
- Constructor for initializing all the instance variables
- Overriding the method - double CalculateMonthlyLoanInstallment() which calculates monthly car loan
installment ( and to this installment amount, you need to add car insurance amount. First calculate the
monthly car installment and then calculate monthly car insurance. And then add them together.)
- You need to override toString() method to display the object’s data.

Create a driver class – LoanTest (LoanTest.java) which tests above classes by at least creating two objects each of the
MortgageLoan and CarLoan classes. And you are required to process them polymorphically i.e. assigning their
references to Loan superclass and then processing them normally and polymorphically.


Formula for monthly installment:

Interest = (loan amount * rate of interest* time)/100
Monthly installment = (interest + loan amount)/ (time * 12)
And add any other components to the monthly installment which is asked in the requirements.
