package org.nnn4eu.cicdcircleci.web.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FieldValidationError {
    private String field;
    private String message;
}
