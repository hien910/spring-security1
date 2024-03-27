package com.example.springsecurity1.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Integer id;
    String email;
    String password;
    List<String> roles;
}
