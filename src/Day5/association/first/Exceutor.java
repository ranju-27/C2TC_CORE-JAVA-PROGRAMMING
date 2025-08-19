package Day5.association.first;

public class Exceutor {
	
	public static void main(String[] args) {
		
		Address address = new Address(" India ","puducherry", "pondicherry", "605010");
		Person person = new Person("Thamizhselvan", address);
		person.displayInfo();
	}

}
