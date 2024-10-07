package com.pmh.org.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.org.freeboard.FreeBoard;
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
    @JsonIgnore //양방향 지명할때 n+1 이슈가 안뜨도록 루프 안되게 해줌...
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
