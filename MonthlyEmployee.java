import java.util.InputMismatchException;

public class MonthlyEmployee extends Employee implements earningCal {

	protected double wagePerDay ;
	protected int nbOfDays ; 
	
	public MonthlyEmployee(){
		super();
	}
	
	public MonthlyEmployee(double wagePerDay , int nbOfdays,String firstName ,String lastName , String fatherName , String motherName ,String emergencyName , String nationality, String city , String street ,String phoneNumber , String emergencyPhoneNumber ,String building ,  int floor , String birthDate){
		super(firstName ,lastName ,fatherName,motherName ,emergencyName ,nationality,city ,street ,phoneNumber ,emergencyPhoneNumber ,building , floor , birthDate);
		this.wagePerDay = wagePerDay ; 
		this.nbOfDays = nbOfdays ; 
	}
	
	public void setWagePerDay(double wagePerDay){
				this.wagePerDay = wagePerDay ;

	}
	
	public double getWagePerDay(){
		return wagePerDay ;
	}
	
	public void setNbOfDays(int nbOfDays){
		try 
			this.nbOfDays = nbOfDays ;
				catch(InputMismatchException e){
					System.out.println("Enter only integers");
				}
	}
	
	public int getNbOfDays(){
		return nbOfDays ;
	}
	
	public double earning(){
		return wagePerDay * nbOfDays ; 
	}
	
	public String toString(){
		return super.toString()+"\nWage Per Day : "+getWagePerDay()+"\nNumbers of days : "+getNbOfDays()+"\nEarning : "+earning() ; 
	}
}