package ua.itea.less16;

public class ConCon {
	
	private String host;
	private String user;
	private String psw;
	
	public void setHost(String host) {
		this.host = host;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getInfo(){
		return "Host: "+host+", User: "+user+", Password: "+psw;
	}
	
}
