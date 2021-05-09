package odev2;

public class Course {//özellik sýnýfý
	public Course() {

	}

	public Course(int courseId, String courseName, String teacherName, String courseDetail) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.courseDetail = courseDetail;
	}

	int courseId;
	String courseName;
	String teacherName;
	String courseDetail;
}
