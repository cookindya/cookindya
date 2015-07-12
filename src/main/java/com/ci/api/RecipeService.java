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

import com.ci.data.Recipe;
import com.ci.data.UserInfo;
import com.ci.data.dao.RecipeDao;
import com.ci.data.dao.RecipeDaoImpl;
import com.google.gson.Gson;

@Path("/recipe")
public class RecipeService {

	@Path("{recipeId}")
	@GET
	@Produces("application/json")
	public String getRecipe(@PathParam("{recipeId}") long recipeId) throws JSONException {

		RecipeDao recipeDAO = new RecipeDaoImpl(Recipe.class);
		
		Recipe recipe = recipeDAO.getById(recipeId);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Cooks UserName", recipe.getRecipeName());
		
		//return Response.status(200).entity("@Produces(\"application/json\")"+jsonObject).build();
		return "@Produces(\"application/json\")"+jsonObject;
	}
	
	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createRecipe(InputStream recipeIn) {
		StringBuilder inputBuffer=new StringBuilder();
		Recipe recipe = null;
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(recipeIn));
			String line = null;
			while ((line = in.readLine()) != null) {
				
				inputBuffer.append(line);
			}
			
			Gson gson = new Gson();
			
			recipe = gson.fromJson(inputBuffer.toString(),Recipe.class);
			
			RecipeDao recipeDAO = new RecipeDaoImpl(Recipe.class);
			
			recipeDAO.create(recipe);
			
		} catch (Exception e) {
			//TODO Log
		}
		//TODO LOG
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(recipe).build();
	}
}
