package com.cognizant.dio.springbootjwt.data;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter @NoArgsConstructor
public class UserData implements Serializable {

    private String userName;
    private String password;
}
