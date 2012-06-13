package testWS;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
	public static final String URI="http://localhost:8888/hello";
	
	public static void main(String[] args) {
		HelloWS ws = new HelloWS();
		
		Endpoint endpoint = Endpoint.publish(URI, ws);
		
		boolean status = endpoint.isPublished();
		System.out.println("WS dispo? "+ status);
		
		
	}
}
