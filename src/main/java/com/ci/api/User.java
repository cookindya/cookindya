package com.ci.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.ci.data.UserInfo;
import com.ci.data.dao.CiUserInfoHome;


@Path("/user")
public class User {

	//@Path("{userid}")
	@GET
	@Produces("application/json")
	public Response getUser(/*@PathParam("{userid}")*/ int userId) throws JSONException {
		
		CiUserInfoHome cUserInfo = new CiUserInfoHome();
		
		//UserInfo userInfo = cUserInfo.findById(1);

		
		return Response.status(200).entity("@Produces(\"application/json\")").build();
	}
}
