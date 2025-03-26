package com.boleto.apivalidacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em vazio")
    @Pattern(regexp = "\\d{16}", message = "A agência deve possuir 16 digitos")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em vazio")
    @Size(min=3, max=100, message = "Digite o seu nome completo")
    private String titular;

    @NotNull(message = "O valor não pode estar em vazio")
    @DecimalMin(value = "10", message = "Digite um valor maior que  10")
    @DecimalMax(value = "5000", message = "Digite um valor menor que 5000")
    private Double valor;

    @NotNull(message = "O data não pode estar no passado")
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O email não pode estar em vazio")
    @Email(message = "O e-mail deve ser válido.")
    private String emailContato;
}
