package com.ldkspringbase.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class BoardEntity {
    int id;
    String username;
    String title;
    String content;
    LocalDate data1;
    int viewcount;
}
