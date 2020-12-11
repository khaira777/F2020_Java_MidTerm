// Gurkirat Singh Khaira - #301112565 - COMP228 - Sec004

package GurkiratKhaira_Sec004_Ex01;

import java.time.LocalDate;
import java.time.Month;

public class LoanTest {

	public static void main(String[] args){
		System.out.println("**************************" + "\nMidterm - Comp228 - Sec004" + "\nGurkirat Singh Khaira" + "\n#301112565" + "\n**************************");
		
		// normally
		MortgageLoan ml1 = new MortgageLoan(1, "John", LocalDate.of( 1991 , Month.JANUARY , 23 ), 1200, 3, 2, 23, "Lawrence", "Scarborough", "ON", "M1M1M1", 550, 250);
		System.out.println(ml1);
		System.out.println("");
		
		// polymorphically		
		Loan ml2 = new MortgageLoan(2, "Johny", LocalDate.of( 1992 , Month.MARCH , 19 ), 1250, 2, 3, 29, "Ellesmere", "North York", "ON", "A1A1A1", 590, 230);
		System.out.println(ml2);
		System.out.println("");

		// normally
		CarLoan cl1 = new CarLoan(3, "Kevin", LocalDate.of( 1989 , Month.OCTOBER , 9 ), 1100, 4, 4, 45, "St. Clair", "Etobiko", "ON", "B1B1B1", 3840);
		System.out.println(cl1);
		System.out.println("");
		
		// polymorphically
		Loan cl2 = new CarLoan(4, "Roger", LocalDate.of( 1987 , Month.JULY , 9 ), 1330, 3, 2, 112, "Yonge", "North york", "ON", "C1C1C1", 3550);
		System.out.println(cl2);
		System.out.println("");
	}

}
