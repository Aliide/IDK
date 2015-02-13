
public class Dog extends Mammal {
	private boolean stupid;
	
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		}
	
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super(latinName, gestationTime);
		this.stupid = stupid;
		super.setFriendlyName(friendlyName);
		
		

}
	public boolean isStupid(){
		return stupid;
	}
	@Override
	public String getInfo() {
		String notStupid = "is not stupid";
		String isStupid = "is stupid";
		String info = "The dog" +  this.getLatinName() + " called " + getFriendlyName() +  " has the gestation time of " + this.getGestationTime()+ " months and ";
		if(isStupid()== true){
			return info + isStupid;
		}else{
		
		return info + notStupid;
		}
		
	}
}