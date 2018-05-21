
import java.util.Scanner;

public class Calculation {
	Scanner scan = new Scanner(System.in);

	private String paymentMethod ; 
	private int numberOfDays ;
	private double prepayment ;
	private double balance ; 
	private double insurance ;  
	private double damage ;
	private double overTime ;
	private double total ;
	private String timeRecipient ;
	private String timeDeliver ; 
	private Car c ; 
	private Motorcycle m ;
	private Bus b ; 
	private String vehicle ; 
	private Person p ; 
	private Customer ct ; 
	/*
	 * fe setters w getters lal kel she mn 3ada (balance  w insurane w total )
	 * 
	 */
	public Calculation(){
		this.vehicle = "Unknown" ; 
		this.numberOfDays = 0 ; 
		this.prepayment = 0.00;
		this.insurance = 0.0 ; 
		this.damage = 0.00 ; 
		this.overTime = 0.99 ; 
		this.total = 0.99 ; 
	}
	
	public Calculation(String paymentMethod,double overTime,String timeRecipient,String timeDeliver,int numberOFDays,double prepaynment,double insurance,double damage){
		this.prepayment = prepaynment ; 
		this.overTime = overTime ; 
		this.numberOfDays = numberOFDays ; 
		this.prepayment = prepaynment ;
		this.insurance = insurance ;  
		this.damage = damage ; 
	}
	
	public void setPaymentMethod(){
			System.out.println("1-Visa\n2-Master Card\n3-Paypal\n4-check\n5-Cash");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				this.paymentMethod = "Visa";		
				break ;
			case 2 : 
				this.paymentMethod = "Master card";
				break ; 
			case 3 : 
				this.paymentMethod = "Paypal" ; 
				break ; 
			case 4 : 
				this.paymentMethod = "Check";
				break ;
			case 5 : 
				this.paymentMethod = "Cash" ; 
				break ;
			default : System.out.println("You enter invalid choice");
			}
	}

	public String getPaymentMethod(){
		return paymentMethod ; 
	}
	public void setNumberOfDays(int days){
			this.numberOfDays = days ; 
	}
	
	public int getNumberOfDays(){
		return numberOfDays ; 
	}
	
	public void setPrepayment(double prepayment){
			this.prepayment = prepayment ;	
	}
	
	public double getPrepayment(){
		return prepayment ; 
	}
	
	public double getBalance(){
		switch(ct.getType())
		{
		case 1 :
			switch(c.getType() )
			{
			case 1 :  balance = numberOfDays * 25 ; setVehicle("Small Car"); break ; 
			case 2 :  balance = numberOfDays * 35 ; setVehicle("Medium Car"); break ; 
			case 3 :  balance = numberOfDays * 50 ; setVehicle("Large Car");  break ; 
			}
			break ; 
		case 2 :
			switch(m.getType())
			{
			case 1 : balance = numberOfDays * 15 ; setVehicle("Small Motorcycle");  break ; 
			case 2 : balance = numberOfDays * 20 ; setVehicle("Medium Motorcycle"); break ; 
			case 3 : balance = numberOfDays * 25 ; setVehicle("Large Motorcycle"); break ; 
			}
			break ; 
		case 3 :
			switch(b.getType())
			{
			case 1 : balance = numberOfDays * 50 ; setVehicle("Small Bus(Van)");  break ; 
			case 2 : balance = numberOfDays * 70 ; setVehicle("Medium Bus"); break ; 
			case 3 : balance = numberOfDays * 100 ; setVehicle("Large Bus(Polman)");  break ; 
			}
			break ; 
			default : 
				System.out.println("You enetered invalid choice");
		}
		return balance ; 
	}
	
	public void setVehicle(String veh){
		this.vehicle = veh ; 
	}
	
	public String getVehicle(){
		return vehicle ;
	}
	
	public void setInsurance(double insurance){
		this.insurance = insurance ;
	}
	
	public double getInsurance(){
		return insurance ;
	}
	
	public void setDamage(double damage){
			this.damage = damage ;
	}
	
	public double getDamage(){
		return damage ; 
	}
	
	public void setOverTime(double overTime){
		this.overTime = overTime ; 
	}
	
	public double getOverTime(){
		return this.overTime ; 
	}
	public double getTotal(){
		this.total =  ((balance + damage + overTime) - (prepayment)) ;
		return total ;
	}
	
	public void setTimeRecipient(String timeRecipient){
		this.timeRecipient = timeRecipient ; 
	}
	
	public String getTimeRecipient(){
		return timeRecipient ; 
	}
	
	public void setTimeDeliver(String timeDeliver){
		this.timeDeliver = timeDeliver ; 
	}
	
	public String getTimeDeliver(){
		return timeDeliver ; 
	}
	
	public String toString(){
		return "\nPayment Method : "+getPaymentMethod()+"\nOver Time : "+getOverTime()+"\nNumber of days : "+numberOfDays+"\nDeposit : "+getPrepayment()+"\nInsurance : "+insurance+"\nDamage : "+damage+"\nTime Recipient : "+getTimeRecipient()+"\nTime Deliver : "+getTimeDeliver()+"\nTotal : "+getTotal() ;
	}
	
}