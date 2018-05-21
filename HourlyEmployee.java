import java.util.InputMismatchException;

public class HourlyEmployee extends Employee implements earningCal{
	
	private double wagePerHour ;
	private int nbOfHours ; 
	
	public HourlyEmployee(){
		super();
	}
	
	public HourlyEmployee(double wagePerHour,int nbOfHours,String firstName ,String lastName , String fatherName , String motherName ,String emergencyName , String nationality, String city , String street ,String phoneNumber , String emergencyPhoneNumber ,String building ,  int floor , String birthDate){
		super(firstName,lastName,fatherName,motherName,emergencyName,nationality,city,street,phoneNumber,emergencyPhoneNumber,building,floor,birthDate);
		this.wagePerHour = wagePerHour ; 
		this.nbOfHours = nbOfHours ;
	}
	
	public void setWagePerHour(double wagePerHour){
		this.wagePerHour = wagePerHour ;
	}
	
	public double getWagePerHour(){
		return wagePerHour ;
	}
	
	public void setNbOfHours(int nbOfHours){
		try 
		this.nbOfHours = nbOfHours ;
				catch(InputMismatchException e){
					System.out.println("Enter only integer");
				}
	}
	
	public int getNbOfDays(){
		return nbOfHours ;
	}
	
	public double earning(){
		if(nbOfHours>40)
		{
			return (40*wagePerHour)+((nbOfHours - 40) * wagePerHour); // nunmber of hours - 40 is the extra time of working 
		}
		else
			return nbOfHours * wagePerHour ;
	}
	
	public String toString(){
		return super.toString()+"\nWage Per Hour : "+getWagePerHour()+"\nNumbers of hours : "+getNbOfDays()+"\nEarning : "+earning(); 
	}
}