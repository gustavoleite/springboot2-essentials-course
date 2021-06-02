package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;

import java.util.List;

// Diz quais são as queries que podem ser feitas com esse modelo no banco de dados
public interface AnimeRepository {
    List<Anime> listAll();
}
