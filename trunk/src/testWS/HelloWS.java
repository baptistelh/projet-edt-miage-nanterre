package testWS;

import javax.jws.WebService;

@WebService(endpointInterface ="testWS.Hello")
public class HelloWS implements Hello {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return ("Hello ");
	}
	
}
