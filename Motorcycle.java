import java.util.Scanner;

public class Motorcycle extends Vehicle {
	Scanner scan = new Scanner(System.in);
	private int type ; 

	public Motorcycle(String type , String model , String ID , String engineNo , String frameNo , String color , int manufactureYear){
		super(type,model,ID,engineNo,frameNo,color,manufactureYear);
	}
		
	public void setType(){
		System.out.println("1- Small Moto\n2- Medium Moto\n3-Large Moto");
		 this.type = scan.nextInt(); 
	}
	
	public int getType(){
		return type ; 
	}
	
	public String toString(){
		return super.toString();
	}
}