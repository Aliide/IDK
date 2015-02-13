
public class Cat extends Mammal{
	private int numbersOfLifes;
	
public Cat(String latinName,int gestationTime, int numbersOfLifes) {
		super(latinName, gestationTime);
		this.numbersOfLifes = numbersOfLifes;
	}

public int getNumbersOfLifes(){
	return numbersOfLifes;
}
public int setNumberOfLifes(int i){
	return i;
}
@Override
public String getInfo() {
	String info = "The cat" + " " + getFriendlyName() + this.getLatinName() + " has the gestation time of " + this.getGestationTime() +" days and has " + numbersOfLifes + " lives left";
	return info;
}


}
