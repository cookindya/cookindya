package com.ci.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
import com.ci.data.UserInfo;
import com.ci.data.dao.UserDao;
import com.ci.data.dao.UserDaoImpl;
import com.google.gson.Gson;


@Path("/user")
public class UserService {

	@Path("{userid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUser(@PathParam("{userid}") long userId) throws JSONException {

		UserDao userDAO = new UserDaoImpl(UserInfo.class);
		
		UserInfo userInfo = userDAO.getById(new Long(650001));
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Cooks UserName", userInfo.getUserName());
		
		//return Response.status(200).entity("@Produces(\"application/json\")"+jsonObject).build();
		return "@Produces(\"application/json\")"+jsonObject;
	}
	
	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(InputStream userInfo) {
		StringBuilder inputBuffer=new StringBuilder();
		UserInfo ui = null;
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(userInfo));
			String line = null;
			while ((line = in.readLine()) != null) {
				
				inputBuffer.append(line);
			}
			
			Gson gson = new Gson();
			
			ui = gson.fromJson(inputBuffer.toString(),UserInfo.class);
			
			UserDao userDAO = new UserDaoImpl(UserInfo.class);
			
			userDAO.create(ui);
			
		} catch (Exception e) {
			//TODO Log
		}
		//TODO LOG
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(ui).build();
	}
}
