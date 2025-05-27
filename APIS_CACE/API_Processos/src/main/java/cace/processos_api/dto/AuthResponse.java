package cace.processos_api.dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private Integer nivelAcesso;
    private boolean precisaRedefinirSenha; // nova flag
}