package com.ci.data.dao;

import java.util.List;

import javax.persistence.Query;

import com.ci.api.constants.RecipeCategory;
import com.ci.data.Recipe;

public class RecipeDaoImpl extends CookIndyaDaoImpl<Recipe> implements
		RecipeDao {

	public RecipeDaoImpl(Class<Recipe> clasInput) {
		super(clasInput);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recipe> getAllRecipiesByCategory(RecipeCategory recipeCategory) {
		Query getAllCooks = (Query) this.getCurrentSession()
				.getNamedQuery("getAllRecipiesByCategory")
				.setString(1, recipeCategory.ordinal() + "");
		return (List<Recipe>) getAllCooks.getResultList();

	}

}
