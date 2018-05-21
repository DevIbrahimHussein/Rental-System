import java.text.ParseException;
import java.util.Date;

public class CustomerDrivingLicence extends Person  {
	
	private String drivingLicenceNo ;
	private String datePlaceIssued ;
	private Date drivingLicenceExpiryDate ; 

	public CustomerDrivingLicence(){
		super();
		drivingLicenceExpiryDate = new Date();
	}
	
	public CustomerDrivingLicence(String drivingLicenceNo,String datePlaceIssued,String drivingLicenceExpiryDate,String firstName ,String lastName , String fatherName , String motherName ,String emergencyName , String nationality, String city , String street ,String phoneNumber , String emergencyPhoneNumber ,String building ,  int floor , String birthDate){
		super(firstName,lastName,fatherName,motherName,emergencyName,nationality,city,street,phoneNumber,emergencyPhoneNumber,building,floor,birthDate);
		this.drivingLicenceNo = drivingLicenceNo ; 
		this.datePlaceIssued = datePlaceIssued ; 
		try {
			this.drivingLicenceExpiryDate = sdf.parse(drivingLicenceExpiryDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setDrivingLicenceNo(String drivingLicenceNo){
			this.drivingLicenceNo = drivingLicenceNo ; 
	}
	
	public String getDrivingLicenceNo(){
		return drivingLicenceNo ; 
	}
	
	public void setDatePlaceIssued(String datePlaceIssued){
			this.datePlaceIssued = datePlaceIssued ; 
	}
	
	public String getDatePLaceIssued(){
		return datePlaceIssued  ;
	}
	
	public void setDrivingLicenceExpiryDate(String drivingLicenceExpiryDate){
		try {
				this.drivingLicenceExpiryDate = sdf.parse(drivingLicenceExpiryDate);
			} catch (ParseException e) 
			{
				e.printStackTrace();
			}
	}
	
	public Date getDrivingLicenceExpiryDate(){
		return drivingLicenceExpiryDate ; 
	}
	
	public String toString(){
		return "First Name : "+getFirstName()+"\nLast Name : "+getLastName()+"\nFather Name : "+getFatherName()+"\nMother's Name : "+getMotherName()+"\nNationality : "+getNationality()+"\nCity : "+getCity()+"\nStreet : "+getStreet()+"\nPhone Number : "+getPhoneNumber()+"\nEmergency Name : "+getEmergencyName()+"\nEmergency Phone Number :"+getEmergencyPhoneNumber()+"\nDate Of Birth : "+getBirthDate()+"\nDriving Licence Number : "+getDrivingLicenceNo()+"\nDate Place Issued : "+getDatePLaceIssued()+"\nDriving Licence Expiry Date : "+getDrivingLicenceExpiryDate() ; 
	}
}