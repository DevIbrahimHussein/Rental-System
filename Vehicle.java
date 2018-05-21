import java.util.InputMismatchException;

public class Vehicle {
	
	private String typeVehicle ; 
	private String model ;
	private String ID ;
	private String engineNo ;
	private String frameNo ; 
	private String color ; 
	private int manufactureYear ; 
	
	public Vehicle(){	
	}
	
	public Vehicle(String type , String model , String ID , String engineNo , String frameNo , String color , int manufactureYear){
		this.typeVehicle = type ; 
		this.model = model ; 
		this.ID = ID ;
		this.engineNo = engineNo ;
		this.frameNo = frameNo ; 
		this.color = color ; 
		this.manufactureYear = manufactureYear ;
	}
	
	public void setVehicleType(String type){
		this.typeVehicle = type ; 
	}
	
	public String getVehicleType(){
		return typeVehicle ; 
	}
	public void setModel(String model){
		this.model = model ;
	}
	
	public String getModel(){
		return model ;
	}
	
	public void setID(String ID){
		this.ID = ID ;
	}
	
	public String getID(){
		return ID ;
	}
	
	public void setEngineNo(String engineNo){
		this.engineNo = engineNo ;
	}
	
	public String getEngineNo(){
		return engineNo ;
	}
	
	public void setFrameNo(String frameNo){
		this.frameNo = frameNo ;
	}
	
	public String getFrameNo(){
		return frameNo ;
	}
	
	public void setColor(String color){
		this.color = color ; 
	}
	
	public String getColor(){
		return color ; 
	}
	
	public void setManufactureYear(int manufactureYear){
		try 
		this.manufactureYear = manufactureYear ;
				catch(InputMismatchException e){
					System.out.println("Enter an integer.");
				}
	}
	
	public int getManufactureYear(){
		return manufactureYear ;
	}
	
	public  String toString(){
		return "Vehicle Type : "+getVehicleType()+"\nModel : "+getModel()+"\nID : "+getID()+"\nEngine Number : "+getEngineNo()+"\nFrame number : "+getFrameNo()+"\nVehicle Color : "+getColor()+"\nManufacture Year : "+getManufactureYear() ; 
	}
}