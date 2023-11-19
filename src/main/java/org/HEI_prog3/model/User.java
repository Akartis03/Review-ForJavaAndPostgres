package org.HEI_prog3.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private char sex;
}
