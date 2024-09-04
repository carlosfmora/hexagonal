package com.example.jakartavalidations.application.port.in.validateinputusecase;

import com.example.jakartavalidations.application.port.in.validateinputusecase.validators.ValidIntegerList;
import com.example.jakartavalidations.application.port.in.validateinputusecase.validators.ValidSimpleObjectVO;
import com.example.jakartavalidations.domain.AggregatedObject;
import com.example.jakartavalidations.domain.SimpleObjectVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

import static com.example.jakartavalidations.shared.Validation.validate;

public class ValidateInputCommand {

    @NotNull
    @ValidSimpleObjectVO
    private SimpleObjectVO simpleObjectVO;

    @NotNull
    @ValidIntegerList
    //  -   el path del atributo queda : value/1
    //  -   el atributo del commando es quien lleva la anotacion
    //  -   Si hay que hacer varias validaciones en el objeto de la lista, sera mas complejo hacer el validador
    //  -   si se hacen varios validadores, sera un poco menos eficiente ya que por cada validador se recorre la lista
    private List<Integer> values;

    @NotNull
    @Valid
    //  -   el path del atributo queda: value[1]
    //  -   el objeto de negocio tiene la anotacion de la validacion
    //  -   si en dado caso se necesita otra validacion en otra parte, puede existir conflicto por validacion, para esto ultimo lo ideal seria que fuera un objeto diferente y cada uno con su responsabilidad?
    private List<AggregatedObject> aggregatedObjects;

    public ValidateInputCommand(int simpleValue, List<Integer> values, List<AggregatedObject> objs) {
        this.simpleObjectVO = SimpleObjectVO.fromValue(simpleValue);
        this.values = values;
        this.aggregatedObjects = objs;
        validate(this);
    }
}
