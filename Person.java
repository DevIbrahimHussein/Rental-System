import java.text.SimpleDateFormat;
import java.text.ParseException ;
import java.util.Date;
import java.util.InputMismatchException;
public abstract class Person {
	
	private String firstName ; 
	private String lastName ; 
	private String fatherName ;
	private String motherName ;
	private String EmergencyName ;
	private String nationality ;
	private String city ; 
	private String street ;
	private String phoneNumber ; 
	private String emergencyPhoneNumber ;
	private String building ; 
	private int floor ; 
	private Date birthDate ;
	private Date tdyDate ;
	protected SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");

	
	public Person(){
		this.tdyDate = new Date();
		this.birthDate = new Date();
	}
	
	public Person(String firstName ,String lastName , String fatherName , String motherName ,String emergencyName , String nationality, String city , String street ,String phoneNumber , String emergencyPhoneNumber ,String building ,  int floor , String birthDate ){
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.fatherName = fatherName ; 
		this.motherName = motherName ;
		this.EmergencyName = emergencyName ;
		this.nationality = nationality ;
		this.city = city ; 
		this.street = street ; 
		this.phoneNumber = phoneNumber ;
		this.emergencyPhoneNumber = emergencyPhoneNumber ;
		this.floor = floor ; 
		try {
			this.birthDate = sdf.parse(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public Date getTdyDate(){
		return tdyDate ; 
	}
	
	public void setFirstName(String firstname){
		this.firstName = firstname ; 
	}
	
	public String getFirstName(){
		return firstName ; 
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName ; 
	}
	
	public String getLastName(){
		return lastName ; 
	}
	public void setFatherName(String fatherName){
		this.fatherName = fatherName ; 
	}
	 
	public String getFatherName(){
		return fatherName ;
	}
	
	public void setMotherName(String motherName){
		this.motherName = motherName ;
	}
	
	public String getMotherName(){
		return motherName ;
	}
	
	public void setEmergencyName(String EmergencyNumber){
		this.EmergencyName = EmergencyNumber ; 
	}
	
	public String getEmergencyName(){
		return EmergencyName ;
	}
	
	public void setNationality(String nationality){
		this.nationality = nationality ;
	}
	
	public String getNationality(){
		return nationality ;
	}
	
	public void setCity(String city){
		this.city= city ; 
	}
	
	public String getCity(){
		return city ;
	}
	
	public void setFloor(int floor){
		try{
		this.floor = floor ;
		}catch (InputMismatchException e){
					System.out.println("Enter only digits");
				}
	}
	
	public int getFloor(){
		return floor ; 
	}
	
	public void setStreet(String street){
		this.street = street ;
	}
	
	public String getStreet(){
		return street ; 
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber ;
	}
	
	public String getPhoneNumber(){
		return phoneNumber ;
	}
	
	public void setBuilding(String building){
		this.building = building ; 
	}
	
	public String getBuilding(){
		return building ; 
	}
	
	public void setEmergencyPhoneNumber(String emergencyPhoneNumber){
		this.emergencyPhoneNumber = emergencyPhoneNumber ;
	}
	
	public String getEmergencyPhoneNumber(){
		return emergencyPhoneNumber ; 
	}
	
	public void setBirthDate(String birthDate){
		try {
			this.birthDate = sdf.parse(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public Date getBirthDate(){
		return birthDate ; 
	}

	public abstract String toString();

}