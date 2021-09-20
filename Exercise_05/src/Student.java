
public class Student {
	String name;
	Integer rollno;
	Boolean isPass;
	Course[] courses;
	Double course1Marks = 0.0;
	Double course2Marks = 0.0;
	Double course3Marks = 0.0;
	
	public Student() {
		name = "";
		rollno = 0;
		courses = new Course[3];
	}

	public Student(String name, Integer rollno, Course courses[]) {
		this.name = name;
		this.rollno = rollno;
		this.courses = courses;
	}
	
	/*function to set marks after taking each course object as input
	and also to make sure the course marks are stored the same order as it is in the Course objects 
	in main client program*/
	public void setMarks(Course course, Double marksScored) {
		if(course == courses[0]) { 
			course1Marks = marksScored;
		}else if(course == courses[1]) {
			course2Marks = marksScored;
		}else if(course == courses[2]) {
			course3Marks = marksScored;
		}else {
			System.out.println("No such course exists! Please enter a valid course obj");
			return;
		}
	}
	/*function to get marks after taking each course object as input
	and also to make sure the course marks are returned in a way that is matching the same courses in the Course objects 
	in main client program*/
	public double getMarks(Course course) {
		if(course == courses[0]) {
			return course1Marks;
		}else if(course == courses[1]) {
			return course2Marks;
		}else if(course == courses[2]) {
			return course3Marks;
		}else {
			return 0.0;
		}
	}
}
