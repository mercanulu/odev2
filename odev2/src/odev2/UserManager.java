package odev2;

public class UserManager {
	public void addToUser(User user) {
		System.out.println(user.userName+" Baþarýyla kaydoldunuz");
	}

	public void checkOut(User user) {
		System.out.println(user.userName+" Bilgilerini kontol et");
	}
}
