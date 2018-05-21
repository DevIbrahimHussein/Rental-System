import java.util.ArrayList;
import java.util.Scanner;

public class RentationSystem4 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> customer = new ArrayList<Customer>();
		ArrayList<MonthlyEmployee> monthlyEmployee = new ArrayList<MonthlyEmployee>();
		ArrayList<HourlyEmployee> hourlyEmplyee = new ArrayList<HourlyEmployee>();
		
		Person c = new Customer();
		Person c1 = new Customer();
		Employee m = new MonthlyEmployee();
		Employee h = new HourlyEmployee();
		Person c2 = new Customer();
		
		
		
		c.setFirstName("ibrahim");
		c.setLastName("Hussein");
		c.setFatherName("Haitham");
		c.setMotherName("Mona Mansour");
		c.setNationality("Lebanese");
		c.setCity("Beirut");
		c.setStreet("Mosaytabe");
		c.setBuilding("Mehio");
		c.setPhoneNumber("76614115");
		c.setEmergencyName("Mona Mansour");
		c.setEmergencyPhoneNumber("03611714");
		c.setFloor(6);
		c.setBirthDate("10-07-1998");
		((Customer)c).setDrivingLicenceNo("549H8A");
		((Customer)c).setDatePlaceIssued("Beirut");
		((Customer)c).setDrivingLicenceExpiryDate("23-8-2017");	
		((Customer)c).setRecipient("Sami sharaf El Deen");
		((Customer)c).setDeliver("Samer Mardini");
		((Customer)c).setVehicle();
		((Customer)c).setVehicleType("Toyotta", "Corolla", "M1258758", "GL85D62", "HYX846", "Blue", 2011 , 6);
		((Customer)c).setCalculation(20.000, 3, 10.000, 250.000, "2:30", "9:30");
		System.out.println(c.toString());
		System.out.println("_____________________________________________________");
		
		c1.setFirstName("Rasha");
		c1.setLastName("Badran");
		c1.setFatherName("Kamal");
		c1.setMotherName("Sawsan");
		c1.setNationality("Lebanese");
		c1.setCity("Bshemoun");
		c1.setStreet("Alwadi");
		c1.setBuilding("Salma w Labban");
		c1.setFloor(2);
		c1.setPhoneNumber("71232492");
		c1.setEmergencyName("Sawsan");
		c1.setEmergencyPhoneNumber("76609990");
		c1.setBirthDate("18-06-1998");
		((Customer)c1).setDrivingLicenceNo("548J");
		((Customer)c1).setDatePlaceIssued("Beirut");
		((Customer)c1).setDrivingLicenceExpiryDate("13-09-2017");
		((Customer)c1).setRecipient("Fawaz Badran");
		((Customer)c1).setDeliver("Walid rifai");
		((Customer)c1).setVehicle();
		((Customer)c1).setVehicleType("Infinty", "infi", "H568462", "LD8461", "OP5481F", "Black", 2013, 13);
		((Customer)c1).setCalculation(0.0, 4, 10.0, 50.0, "2:30 pm", "2:30 pm");
		System.out.println(c1.toString());
		
		System.out.println("________________________________");
		
		c2.setFirstName("Adham");
		c2.setLastName("Hamadeh");
		c2.setFatherName("Walid");
		c2.setMotherName("His Mom");
		c2.setNationality("Lebanese");
		c2.setCity("gharife");
		c2.setStreet("Tout");
		c2.setBuilding("Own house");
		c2.setFloor(2);
		c2.setPhoneNumber("76544743");
		c2.setEmergencyName("Dad");
		c2.setEmergencyPhoneNumber("76614115");
		c2.setBirthDate("07-30-1999");
		((Customer)c2).setDrivingLicenceNo("54H8P6WB546");
		((Customer)c2).setDrivingLicenceExpiryDate("09-16-2019");
		((Customer)c2).setRecipient("Walid rifai");
		((Customer)c2).setDeliver("Fawaz badran");
		((Customer)c2).setVehicle();
		((Customer)c2).setVehicleType("Lykan Hypersport", "W Motors", "d6285496", "K5679J56", "G9648I54", "white", 2015, 2);
		((Customer)c2).setCalculation(10.0, 3, 30.0, 290.0, "2:30 pm", "6:30 pm");
		System.out.println(c2.toString());
		System.out.println("________________________________");

		m.setFirstName("Fawaz");
		m.setLastName("Badran");
		m.setFatherName("Maher");
		m.setMotherName("My mom");
		m.setNationality("Syrian");
		m.setCity("kuwait City");
		m.setStreet("Mughira bin shu'ba street");
		m.setBuilding("Building 78");
		m.setFloor(3);
		m.setPhoneNumber("0096565550619");
		m.setEmergencyName("Ibrahim Hussein");
		m.setEmergencyPhoneNumber("76614115");
		m.setBirthDate("03-29-1998");
		((MonthlyEmployee)m).setWagePerDay(72.5);
		((MonthlyEmployee)m).setNbOfDays(20);
		System.out.println(m.toString());
		System.out.println("________________________________");

		h.setFirstName("Walid");
		h.setLastName("Rifai");
		h.setFatherName("abed");
		h.setMotherName("walid's mom");
		h.setNationality("Palestinian");
		h.setCity("Saida");
		h.setStreet("Natasha ssad");
		h.setBuilding("Dandashle");
		h.setFloor(6);
		h.setPhoneNumber("76082107");
		h.setEmergencyName("Ibrahim Hussein");
		h.setEmergencyPhoneNumber("76614115");
		h.setBirthDate("09-24-1998");
		((HourlyEmployee)h).setWagePerHour(5.0);
		((HourlyEmployee)h).setNbOfHours(8);
		System.out.println(h.toString());
	}
}