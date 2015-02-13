
public class Human {

	private Dog dog;
	private String name;


	public Human(String name){
		this.name = name;

	}
	public String getName(){
		return this.name;	

	}	
	public Dog buyDog (Dog dog){
		return this.dog = dog;

	}

	public String getInfo (){
		if (name != null && dog != null){
			String allInfo = ""; // Why is this here?
			return name + " "+ "äger en hund som heter "+ dog.getName();

		}else{
			return null;

		}
	}

}
