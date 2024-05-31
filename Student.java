package Exp7;
import Exp7.Mech_Students;
import Exp7.CSE_Students;
public class Student {

	public static void main(String[] args) {
		CSE_Students cseStudents = new CSE_Students();
		Mech_Students mechStudents = new Mech_Students();
		cseStudents.display("Anuja",1,"CSE","A");
		mechStudents.display("Mauli",2,"MECH","A");

	}

}
