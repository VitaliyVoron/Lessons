package ua.itea.less8;

public class Student {
	
	String name;
	String subject;
	
	void setName(String n){
		name =n;
	}
	
	
	
	public void setSubject(String subject) {
		this.subject = subject;
	}



	void getInfo(){
		System.out.println("Name: "+ name +"; Subject: "+subject);
	}

}
