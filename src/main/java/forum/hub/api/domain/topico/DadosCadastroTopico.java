package forum.hub.api.domain.topico;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotNull
        Long idautor,
        @NotNull
        Long idcurso
) {
}
