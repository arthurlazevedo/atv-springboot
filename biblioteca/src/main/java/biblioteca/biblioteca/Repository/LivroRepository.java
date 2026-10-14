package biblioteca.biblioteca.Repository;

import biblioteca.biblioteca.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    public List<Livro> findByIsbnContaining(String isbn);

    public List<Livro> findByTituloContaining(String titulo);

    public List<Livro> findByIsbnContainingAndTituloContaining(String isbn, String titulo);
}