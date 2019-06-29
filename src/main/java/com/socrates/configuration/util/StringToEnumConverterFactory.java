package com.socrates.configuration.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * The type String to enum converter factory.
 */

public class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {

    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnumConverter(targetType);
    }

    private final class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

        private Class<T> enumType;

        /**
         * Instantiates a new String to enum converter.
         *
         * @param enumType the enum type
         */
        public StringToEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        @Override
        public T convert(String source) {
            T result = null;
            for(T enumValue:enumType.getEnumConstants()){
                if(source.equals(enumValue.toString())){
                    result= enumValue;
                }
            }
            return result;
        }
    }
}
