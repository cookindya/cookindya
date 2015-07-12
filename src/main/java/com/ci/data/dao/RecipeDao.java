package com.ci.data.dao;

import java.util.List;

import com.ci.api.constants.RecipeCategory;
import com.ci.data.Recipe;

public interface RecipeDao extends CookIndyaDao<Recipe>{
	
	List<Recipe> getAllRecipiesByCategory(RecipeCategory recipeCategory);

}
