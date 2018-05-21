import java.util.Scanner;

public class Car extends Vehicle{
	
	Scanner scan = new Scanner(System.in);
	private int type ; 

	public Car(String type , String model , String ID , String engineNo , String frameNo , String color , int manufactureYear){
		super(type,model,ID,engineNo,frameNo,color,manufactureYear);
	}
	
	public void setType(){
		System.out.println("1- Small Car\n2- Medium Car\n3-Large Car");
		 this.type = scan.nextInt(); 
		}
	
	public int getType(){
		return type ; 
	}
	
	public String toString(){
		return super.toString();
	}
}