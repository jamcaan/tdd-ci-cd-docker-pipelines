package com.hoaxify.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericResponse {
    private String message;

    public GenericResponse(String message){
        this.message = message;
    }

    //getting cannot deserialize from Object value to solve this add no argument constructor
    //by either adding not argument constructor by yourself directly to the code or by using lombok NoArgsConstructor
}
