
public abstract class Employee  extends Person {
		
	public Employee(){
		super();
	}
	
	public Employee(String firstName ,String lastName , String fatherName , String motherName ,String emergencyName , String nationality, String city , String street ,String phoneNumber , String emergencyPhoneNumber ,String building ,  int floor , String birthDate){			
		super(firstName ,lastName ,fatherName,motherName ,emergencyName ,nationality,city ,street ,phoneNumber ,emergencyPhoneNumber ,building ,floor , birthDate);
	}

	public String toString(){
		return "First Name : "+getFirstName()+"\nLast Name : "+getLastName()+"\nFather Name : "+getFatherName()+"\nMother's Name : "+getMotherName()+"\nNationality : "+getNationality()+"\nCity : "+getCity()+"\nStreet : "+getStreet()+"\nPhone Number : "+getPhoneNumber()+"\nEmergency Name : "+getEmergencyName()+"\nEmergency Phone Number :"+getEmergencyPhoneNumber()+"\nDate Of Birth : "+getBirthDate();
	}
}
