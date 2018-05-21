import java.util.Scanner;

public class Bus extends Vehicle{
	Scanner scan = new Scanner(System.in);
	private int capacity ; 
	private int type ; 

	
	public Bus(String type , String model , String ID , String engineNo , String frameNo , String color , int manufactureYear,int capacity){
		super(type,model,ID,engineNo,frameNo,color,manufactureYear);
	}
	
	public void setType(){
		System.out.println("1- Small Bus(van)\n2- Medium Bus\n3-Large Bus(polman)");
		 this.type = scan.nextInt(); 
	}
	
	public int getType(){
		return type ; 
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity ; 
	}
	
	public int getCapacity(){
		return capacity ; 
	}
	
	
	public String toString(){
		return super.toString()+"\nCapacity : "+getCapacity();
	}
}