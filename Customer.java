import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer extends CustomerDrivingLicence{
	
	Scanner scan = new Scanner(System.in);

	private String recipient ; // mostalem  
	private String deliver ; // sallam 
	private int type ; 
	private Calculation cal ; 
	private Vehicle vehicle ; 
	private Car car ;
	private Motorcycle moto ; 
	private Bus bus ; 

	public Customer(){
		super();
		cal = new Calculation();
		vehicle = new Vehicle();
	}
	
	public Customer(String recipient,String deliver,String drivingLicenceNo,String datePlaceIssued,String drivingLicenceExpiryDate,String firstName ,String lastName,String fatherName,String motherName,String emergencyName,String nationality,String city,String street,String phoneNumber,String emergencyPhoneNumber,String building,int floor,String birthDate){
		super(drivingLicenceNo,datePlaceIssued,drivingLicenceExpiryDate,firstName,lastName,fatherName,motherName,emergencyName,nationality,city,street,phoneNumber,emergencyPhoneNumber,building,floor,birthDate);
		this.recipient = recipient ; 
		this.deliver = deliver ;
	}
	
	public void setVehicle(){
				System.out.println("Choose a mode of transportation : \n1-Car\n2-Moto\n3-Bus");
				type = scan.nextInt();
				switch(type)
				{
				case 1 : type = 1 ; break ; 
				case 2 : type = 2 ; break ; 
				case 3 : type = 3 ; break ; 
				default: System.out.println("You entered invlaid choice");
				}	
			}
	
	public int getType(){
		return type ; 
	}
	
	public void setRecipient(String name){
			this.recipient = name ;
	}
	
	public String getRecipient(){
		return recipient ; 
	}
	
	public void setDeliver(String name){
			this.deliver = name ; 
	}
	
	public String getDeliver(){
		return deliver ; 
	}
	
	public void setCalculation(double overTime,int days,double prepayment,double damage,String timeRecipient,String timeDeliver){
		cal.setPaymentMethod();
		cal.setOverTime(overTime);
		cal.setNumberOfDays(days);
		cal.setPrepayment(prepayment);
		cal.setDamage(damage);
		cal.setTimeRecipient(timeRecipient);
		cal.setTimeDeliver(timeDeliver);
	}
	
	public void setVehicleType(String model,String type,String ID,String engineNo,String frameNo,String color,int manufactureYear, int capacity){
		if(this.type == 1){
			car = new Car(type, model, ID, engineNo, frameNo, color, manufactureYear);
			car.setType();
		}
		else if(this.type == 2){
			moto = new Motorcycle(type, model, ID, engineNo, frameNo, color, manufactureYear);
			moto.setType();
		}
		else if(this.type == 3){
			bus = new Bus(type, model, ID, engineNo, frameNo, color, manufactureYear, capacity);
			bus.setType();
		}
	}
	
	public String toString(){
		switch(type)
		{
		case 1 : return super.toString()+"\nRecipient : "+recipient+"\nDeliver : "+deliver+"\n"+car.toString()+cal.toString() ; 
		case 2 : return super.toString()+"\nRecipient : "+recipient+"\nDeliver : "+deliver+"\n"+moto.toString()+cal.toString() ;  
		case 3  :return super.toString()+"\nRecipient : "+recipient+"\nDeliver : "+deliver+"\n"+bus.toString()+cal.toString() ;
		default :return super.toString()+"\nRecipient : "+recipient+"\nDeliver : "+deliver+"\n";
		}
	}
}