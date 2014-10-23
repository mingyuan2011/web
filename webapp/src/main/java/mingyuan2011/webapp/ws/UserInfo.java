package mingyuan2011.webapp.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("UserInfoService")
public class UserInfo {
	
	@GET
	@Path("/name/{i}")
	@Produces(MediaType.TEXT_XML)
	public String username(@PathParam("i") String name){
		return "<User><Name>" + name + "</Name></User>";
	}
	
	@GET
	@Path("/age/{j}")
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j")String age){
		return "<User><Age>" + age + "</Age></User>";
	}
}
