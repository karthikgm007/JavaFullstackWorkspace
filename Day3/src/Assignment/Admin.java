package Assignment;

public class Admin extends User{
	@Override
	void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name="+name+" Username="+username+" Email="+email+" Id="+id);
		
	}


	@Override
	void setDetails(String name, String username, String email, String id) {
		// TODO Auto-generated method stub
		this.name=name;
		this.username=username;
		this.email=email;
		this.id=id;
		
		
	}
}