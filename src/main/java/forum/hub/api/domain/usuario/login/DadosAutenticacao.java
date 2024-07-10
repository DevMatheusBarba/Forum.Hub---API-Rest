package forum.hub.api.domain.usuario.login;

import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao (
        @NotBlank
        String email,
        @NotBlank
        String senha
){
}
