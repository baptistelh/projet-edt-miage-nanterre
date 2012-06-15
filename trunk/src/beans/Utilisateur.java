package beans;
import java.io.Serializable;


public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5184854990150118971L;
	private String login;
	private String pwd;
	
	public Utilisateur(){
		super();
	}
	
	public Utilisateur(String login, String pwd){
		this();
		this.setLogin(login);
		this.setPwd(pwd);
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
