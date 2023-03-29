package med.voll.api.medico;

import jakarta.validation.constraints.*;
import med.voll.api.endereco.DadosEndereco;

/**
 *
 * @author screamersam
 */
public record DadosAtualizacaoMedico(
        @NotNull
        Long id, 
        String nome, 
        String telefone, 
        DadosEndereco endereco
        ) {}
