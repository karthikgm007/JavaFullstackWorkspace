package Assignment;

public abstract class User {
	String name;
	String username;
	String email;
	String id;
	
	abstract void getDetails();
	abstract void setDetails(String name,String username,String email,String id);
	

}