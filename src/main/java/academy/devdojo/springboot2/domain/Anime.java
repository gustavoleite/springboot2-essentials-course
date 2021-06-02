package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// Modelo referente ao banco de dados
public class Anime {
    private Long id;
    private String name;
}
