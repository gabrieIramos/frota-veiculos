package com.empresaxwz.frota_veiculos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoRequestDTO {
    @NotBlank(message = "Modelo é obrigatório.")
    private String modelo;

    @NotBlank(message = "Fabricante é obrigatório.")
    private String fabricante;

    @Min(value = 1850, message = "Ano deve ser posterior a 1900.")
    @NotNull(message = "Ano é obrigatório.")
    private Integer ano;

    @NotNull(message = "Preço é obrigatório.")
    @Min(value = 0, message = "Preço deve ser positivo.")
    private Double preco;
}
