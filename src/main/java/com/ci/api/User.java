package com.ci.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.json.JSONException;
import org.json.JSONObject;

import com.ci.data.UserInfo;
import com.ci.data.dao.CiUserInfoHome;
import com.ci.data.dao.UserDao;
import com.ci.data.dao.UserDaoImpl;
import com.ci.util.HibernateUtil;
import com.sun.corba.se.impl.presentation.rmi.ExceptionHandlerImpl;


@Path("/user")
public class User {

	//@Path("{userid}")
	@GET
	@Produces("application/json")
	public String getUser(/*@PathParam("{userid}") int userId*/) throws JSONException {

		UserDao<UserInfo> userDAO = new UserDaoImpl(UserInfo.class);
		
		UserInfo userInfo = userDAO.getById(new Long(650001));
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Cooks UserName", userInfo.getUserName());
		
		//return Response.status(200).entity("@Produces(\"application/json\")"+jsonObject).build();
		return "@Produces(\"application/json\")"+jsonObject;
	}
}
