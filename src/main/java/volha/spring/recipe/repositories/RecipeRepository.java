package volha.spring.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import volha.spring.recipe.domain.Recipe;
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
