package day3;

public class Student {
		int rno;			//different for each student - instance scope
		String sname;		//different for each student - instance scope
		double per;			//different for each student - instance scope
		static int strength;//same for each student - static scope
		public Student() {
			this.rno=1;
			this.sname="unknown";
			this.per=50.0;
			strength++;
		}
		public Student(int rno, String sname, double per) {
			this.rno = rno;
			this.sname = sname;
			this.per = per;
			strength++;
		}
		
		void displayStudent()
		{
			System.out.println(this.rno + " "+this.sname  +" "+ this.per);
		}
		
		static void displayClassStrength()
		{
			int k;	
			System.out.println("Class Strenght "+Student.strength);
		}
		
		
}
