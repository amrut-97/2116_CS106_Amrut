
public class ClientApp {

	public static void main(String[] args) {
		Customer c1 = new Customer("Customer 1", 43221);
		Customer c2 = new Customer("Customer 2", 43222);
		
		HairStylist hs1 = new HairStylist("Hairstylist 1", 26000);
		HairStylist hs2 = new HairStylist("Hairstylist 2", 24000);
		
		MultitaskingStaff mts1 = new MultitaskingStaff("Multi-tasking staff1", 16000);
		MultitaskingStaff mts2 = new MultitaskingStaff("Multi-tasking staff2", 15000);
		
		User[] userList = {c1, c2, hs1, hs2, mts1, mts2};
		
		System.out.println("Names of Users of Hair Saloon:-\n");
		for( int i = 0; i < userList.length; i++) {
			userList[i].printName();
		}
		
		Staff[] staffList =  {hs1, hs2, mts1, mts2};
		System.out.println("\nTotal Salary of Staff: " + Staff.calculateSalary(staffList));
	}

}
