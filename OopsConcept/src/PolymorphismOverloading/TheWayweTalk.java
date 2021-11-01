package PolymorphismOverloading;

public class TheWayweTalk {

	public void talk(Parents speakingstyle) {
		System.out.println("Polite");
	}

	public void talk(Partner speakingstyle) {
		System.out.println("Love");
	}

	public void talk(Boss speakingstyle) {
		System.out.println("Nothing Personal");
	}


	public static void main(String[] args) {
		TheWayweTalk example= new TheWayweTalk();

		Parents parent = new Parents();
		example.talk(parent);

		Boss boss = new Boss();
		example.talk(boss);

		Partner partner = new Partner();
		example.talk(partner);

	}

}
