package odev2;

public class User {//özellik sýnýfý
	int userId;
	String userName;
	String password;
	String varifyPassword;
	
	public User() {
		
	}
	public User(int userId,String userName,String password,String varifyPassword) {
		this();
		this.userId=userId;
		this.userName=userName;
		this.password=password;
		this.varifyPassword=varifyPassword;
		
		
	}
}
