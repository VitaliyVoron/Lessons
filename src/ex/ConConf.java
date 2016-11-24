package ex;

public class ConConf {
	String host=null;
	String user=null;
	String password=null;
	ConConf(String host,String user,String password){
		this.host=host;
		this.user=user;
		this.password=password;
	}
	void getCon(){
		System.out.println("Host: "+host+"; user="+user+"; password="+password);
	}
	
}
