package one.innovation.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.innovation.personapi.enums.UsoTelefone;

import javax.persistence.*;

@Entity                 //* jpa: marca como entidade
@Data                   //* lombok: cria getters e setters
@Builder                //*
@AllArgsConstructor     //* cria construtor
@NoArgsConstructor      //* cria construtor
public class Phone {

    @Id                 //* jpa: marca como chave
    @GeneratedValue(strategy = GenerationType.IDENTITY) //* identity = gera na inclusão
    private Long id;

    @Enumerated(EnumType.STRING)    //* jpa: usa enum
    @Column(nullable = false)       //* jpa: not null
    private UsoTelefone type;       //* jpa: nome do enum = nome atributo

    @Column(nullable = false, unique = true)    //* jpa: not null + indice unico
    private String number;
}
