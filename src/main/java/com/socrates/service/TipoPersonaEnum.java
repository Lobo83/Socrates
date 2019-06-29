package com.socrates.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * The enum Tipo persona enum.
 */
@Getter
public enum TipoPersonaEnum {
    /**
     * Alumno tipo persona enum.
     */
    ALUMNO("Alumno"), /**
     * Profesor tipo persona enum.
     */
    PROFESOR("Profesor");

    private String tipoPersona;

    private TipoPersonaEnum(String tipoPersona) {
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
     * Create tipo persona enum.
     *
     * @param value the value
     * @return the tipo persona enum
     */
    @JsonCreator
    public static TipoPersonaEnum create(String value) {
        System.out.println("in json creator "+value);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        for (TipoPersonaEnum v : values()) {
            if (value.equals(v.tipoPersona)) {
                return v;
            }
        }
        throw new IllegalArgumentException();
    }
}
