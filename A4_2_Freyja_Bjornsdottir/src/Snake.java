public  class Snake extends Animal{

	private boolean poisonous;
	
	public Snake(String latinName, boolean poisonous) {
		super(latinName);
		this.poisonous = poisonous;
	}
	public boolean isPoisonous(){
		return poisonous;
	}
	@Override
	public String getInfo() {
		String noPoison = " is not poisonous";
		String poison= " is poisonous";
		String info = "The snake " + super.getLatinName();
		if(isPoisonous()== true){
			return info + poison;
		}else{
		
		return info + noPoison;
		}
	}
	
}