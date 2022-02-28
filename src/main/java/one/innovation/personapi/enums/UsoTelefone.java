package one.innovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UsoTelefone {

    CELULAR("Celular"),
    CELULARTRABALHO("Celular trabalho"),
    FIXO("Fixo"),
    FIXOTRABALHO("Fixo trabalho");

    private final String description;
}
