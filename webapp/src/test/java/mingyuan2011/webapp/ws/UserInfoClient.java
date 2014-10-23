package mingyuan2011.webapp.ws;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class UserInfoClient {
	
	public static String BASE_URL = "http://localhost:8080/webapp";
	public static String PATH_NAME = "/UserInfoService/name/";
	public static String PATH_AGE = "/UserInfoService/age/";
	
	public static void main(String[] args) {
		String name = "mingyuan2011";
		int age = 25;
		
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(BASE_URL);
		
		WebResource nameResource = resource.path("rest").path(PATH_NAME + name);
		System.out.println(getClientResponse(nameResource));
		System.out.println(getResponse(nameResource));
		
		WebResource ageResource = resource.path("rest").path(PATH_AGE + age);
		System.out.println(getClientResponse(ageResource));
		System.out.println(getResponse(ageResource));
	}
	
	private static String getClientResponse(WebResource resource){
		return resource.accept(MediaType.TEXT_XML).get(ClientResponse.class).toString();
	}
	
	private static String getResponse(WebResource resource){
		return resource.accept(MediaType.TEXT_XML).get(String.class);
	}
}
