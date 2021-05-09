package odev2;

public class CourseManager {// iþ sýnýfý
	public void enrollCourse(Course course) {
		System.out.println("Kaydýnýz gerçekleþmiþtir:" + course.courseName);
	}

	public void deleteCourse(Course course) {
		System.out.println("Kaydýnýz silinmiþtir:" + course.courseName);
	}

	public void searchCourse(Course course) {
		System.out.println("Kurs Bul\n"+course.courseName);
	}
}
