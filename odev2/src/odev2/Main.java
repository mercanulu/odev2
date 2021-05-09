package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)\n", "Engin Demirog\n",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.\n\n");

		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)\n";
		course2.teacherName = "Engin Demirog\n";
		course2.courseDetail = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.\n\n";

		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs\n", "Engin Demirog\n",
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.\n");

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
