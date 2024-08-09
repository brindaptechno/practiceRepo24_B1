package student;

public class StudentGrade_7 {

	void printStudentGrade(int score) {
		if (score > 90 && score <= 100) {
			System.out.println("Yours Score is " + score + " and Grade is A+");
		} else if (score > 80 && score <= 90) {
			System.out.println("Yours Score is " + score + " and Grade is A");
		} else if (score > 70 && score <= 80) {
			System.out.println("Yours Score is " + score + " and Grade is B+");
		} else if (score > 60 && score <= 70) {
			System.out.println("Yours Score is " + score + " and Grade is B");
		} else if (score >= 50 && score <= 60) {
			System.out.println("Yours Score is " + score + " and Grade is C");
		} else if (score >= 0 && score < 50) {
			System.out.println("Yours Score is " + score + ", please work harder");
		} else {
			System.out.println("Invalid Score");
		}
	}

	public static void main(String[] args) {
		StudentGrade_7 studentGrade_7 = new StudentGrade_7();
		studentGrade_7.printStudentGrade(92);
		studentGrade_7.printStudentGrade(76);
		studentGrade_7.printStudentGrade(23);
		studentGrade_7.printStudentGrade(-19);
		studentGrade_7.printStudentGrade(102);
	}
}
