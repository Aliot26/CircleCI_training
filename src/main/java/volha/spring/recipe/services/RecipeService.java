package volha.spring.recipe.services;

import org.springframework.stereotype.Service;
import volha.spring.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {
    Set<Recipe> getRecipes();
}
