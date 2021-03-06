package volha.spring.recipe.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import volha.spring.recipe.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void findByDescription() {

        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uom.get().getDescription());

    }

    @Test
    public void findByDescriptionCup(){

        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", uom.get().getDescription());

    }
}
