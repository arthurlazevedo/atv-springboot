package biblioteca.biblioteca.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@Table(name = "tb_autor")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "ds_isbn", nullable = false)
    @JsonProperty("isbn")
    private String isbn;

    @Column(name = "ds_titulo", nullable = false)
    @JsonProperty("titulo")
    private String titulo;

    @Column(name = "ds_ano", nullable = false)
    @JsonProperty("ano")
    private String ano;

    @Column(name = "ds_edicao")
    @JsonProperty("edicao")
    private Date edicao;

    @ManyToOne() // tem que ter alguma coisa aqui
    @JoinColumn(name = "autor_id")
    private Autor autor;

}