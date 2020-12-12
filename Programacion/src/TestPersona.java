
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    persona person = new persona();
	
	
	person.setEstatura_me(1.50);
	person.setCedula("1234567890");
	person.setNombre("Karen");
	
	System.out.println(person.toString());
	
	
	persona person2 = new persona ("Pamela");
	System.out.println(person2.toString());
	
	}
	

}
