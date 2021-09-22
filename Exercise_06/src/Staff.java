
public abstract class Staff extends User {

	Integer salary;
	
	public Staff() {
	}
	
	public Staff(String name, Integer salary) {
		super(name);
		this.salary = salary;
	}
	
	public static Integer calculateSalary(Staff[] list){
		Integer totalSalary = 0;

		for( int i = 0; i < list.length; i++) {
			totalSalary += list[i].salary;
		}
		
		return totalSalary;
	}
}
