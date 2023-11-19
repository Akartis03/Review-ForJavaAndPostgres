package org.HEI_prog3.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Book {
    private int id;
    private String bookName;
    private int pageNumbers;
    private List<String> topic;

}
