package com.pmh.ex11.file;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "freeboardFiles")
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String Name;
    private String path;
    private String desc;
}
