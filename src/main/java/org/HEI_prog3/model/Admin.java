package org.HEI_prog3.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Admin extends User{
    public Admin(int id, String name, char sex) {
        super(id, name, sex);
    }
}
