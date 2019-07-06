package com.socrates.controller.formatter;

import com.socrates.controller.model.ClaseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class ClaseFormatter implements Formatter<ClaseDTO> {
    @Override
    public ClaseDTO parse(String s, Locale locale) throws ParseException {
            log.info("estoy vivoooooooo {}",s);
             return new ClaseDTO();
    }

    @Override
    public String print(ClaseDTO claseDTO, Locale locale) {
        return claseDTO.toString();
    }
}
