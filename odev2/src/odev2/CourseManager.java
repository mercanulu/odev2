package odev2;

public class CourseManager {// i� s�n�f�
	public void enrollCourse(Course course) {
		System.out.println("Kayd�n�z ger�ekle�mi�tir:" + course.courseName);
	}

	public void deleteCourse(Course course) {
		System.out.println("Kayd�n�z silinmi�tir:" + course.courseName);
	}

	public void searchCourse(Course course) {
		System.out.println("Kurs Bul\n"+course.courseName);
	}
}
