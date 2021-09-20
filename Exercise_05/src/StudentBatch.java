
public class StudentBatch {

	Student[] students;
	
	public StudentBatch() {
		students = new Student[5];
	}
	
	public void printResult() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].rollno + " - " + students[i].isPass);
		}
	}
}
