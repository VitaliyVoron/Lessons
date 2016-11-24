package ua.itea.less8;

public class StudMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Petya");
		Subject subject = new Subject();
		student.setSubject(subject.getName());
		student.getInfo();

	}

}
