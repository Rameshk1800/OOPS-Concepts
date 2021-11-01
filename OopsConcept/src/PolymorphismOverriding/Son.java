package PolymorphismOverriding;

public class Son extends Parent {
	
	@Override
	public void marraige() {
		System.out.println("my wish");
		
	}

	public static void main(String[] args) {
		Parent parent = new Son();
		parent.Properties();
		
		parent.marraige();
		

	}
	
	
	
}
