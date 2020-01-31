package volha.spring.recipe.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
