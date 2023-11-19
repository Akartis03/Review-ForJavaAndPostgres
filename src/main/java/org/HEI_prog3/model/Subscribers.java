package org.HEI_prog3.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Subscribers extends User{
    public Subscribers(int id, String name, char sex) {
        super(id, name, sex);
    }
}
