package com.beanscopesannotations;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Motor {
    private int putere;
    private String nume;
    private int numarCilindri;
}
