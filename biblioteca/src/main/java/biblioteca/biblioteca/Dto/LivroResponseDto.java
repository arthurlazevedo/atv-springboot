package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AutorResponseDto {
    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("autor_id")
    private Long autor_id;

    @JsonProperty("ano")
    private String ano;

    @JsonProperty("edicao")
    private Date edicao;
}