package com.socrates.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * The enum Nivel enum.
 */
@Getter
public enum NivelEnum {

    /**
     * Basico nivel enum.
     */
    BASICO("Basico"), /**
     * Intermedio nivel enum.
     */
    INTERMEDIO("Intermedio"), /**
     * Avanzado nivel enum.
     */
    AVANZADO("Avanzado") ;

    private String tipoPersona;

    private NivelEnum(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    @Override
    @JsonValue
    public String toString() {
        return tipoPersona;
    }


    /**
     * Create nivel enum.
     *
     * @param value the value
     * @return the nivel enum
     */
    @JsonCreator
    public static NivelEnum create(String value) {
        System.out.println("in json creator "+value);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (NivelEnum v : values()) {
            if (value.equals(v.tipoPersona)) {
                return v;
            }
        }
        throw new IllegalArgumentException();
    }
}
