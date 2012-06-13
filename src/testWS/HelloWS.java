package testWS;

import javax.jws.WebService;

@WebService(endpointInterface ="testWS.Hello")
public class HelloWS implements Hello {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return ("Hello "+name);
	}
	
}
