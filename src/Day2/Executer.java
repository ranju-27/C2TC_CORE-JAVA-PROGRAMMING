package Day2;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity_person p= new Entity_person();
		p.setId(101);
		p.setName("ram");
		p.setAge(18);
		p.setCity("puducherry");
		System.out.println(p.toString());
		System.out.println(p);//automatically converts the object value to string (package_name.classname address)

	}

}
