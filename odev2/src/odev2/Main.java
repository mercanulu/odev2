package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)\n", "Engin Demirog\n",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.\n\n");

		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)\n";
		course2.teacherName = "Engin Demirog\n";
		course2.courseDetail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.\n\n";

		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs\n", "Engin Demirog\n",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.\n");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName + course.teacherName + course.courseDetail);
		}

		CourseManager courseManager=new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.enrollCourse(course2);
		courseManager.enrollCourse(course3);
		courseManager.searchCourse(course1);
		courseManager.searchCourse(course2);
		courseManager.searchCourse(course3);
		
		User user1=new User();
		user1.userId=1;
		user1.userName="Mercan Ulu";
		user1.password="12345";
		user1.varifyPassword="12345";
		
		User user2=new User(2,"Ahmet Can","asd45","as45");
		
		//User[] users= {user1,user2};
		/*for(User user:users) {
			System.out.println(user.userName);
		}*/
		
		UserManager userManager=new UserManager();
		userManager.addToUser(user1);
		userManager.checkOut(user2);
		
		
	}

}
