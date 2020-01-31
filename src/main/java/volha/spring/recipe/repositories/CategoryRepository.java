package volha.spring.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import volha.spring.recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
