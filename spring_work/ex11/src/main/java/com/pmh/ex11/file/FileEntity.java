package com.pmh.ex11.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.ex11.freeboard.FreeBoard;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "freeBoardFile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private String path;
    private String fileDesc;

    @ManyToOne
//    @JoinColumn(name = "free_Board_idx")
    @JsonIgnore
    private FreeBoard freeBoard;

    @Override
    public String toString() {
        return "FileEntity{" +
                "idx=" + idx +
                ", Name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", fileDesc='" + fileDesc +
                '}';
    }
}
