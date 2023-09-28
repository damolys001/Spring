package com.cardex.forms;

import lombok.Data; 

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public @Data class User {
    @NotNull 
    @Size(min = 2, max = 20)
    private String userid;
    @NotNull
    @Size(min = 8, max = 30)
    private String password;
}
