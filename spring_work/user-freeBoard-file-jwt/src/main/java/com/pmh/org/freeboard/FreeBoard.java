package com.pmh.org.freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.org.file.FileEntity;
import com.pmh.org.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "free_board")
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //프라이머리키 오토인크리먼트(자동증가) 요청
    private Long idx;

    private String title;
    private String content;



    @CreatedBy
    @Column(updatable = false)
    private String creAuthor;

    @LastModifiedBy
    private String modAuthor;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int view_count;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "freeBoard", cascade = CascadeType.ALL, orphanRemoval = true) //orp는 고아객체가 될시 삭제되도록..
    private List<FileEntity> list = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user; // User와 양방향 맵핑




    @Override
    public String toString() {
        return "FreeBoard{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creAuthor='" + creAuthor + '\'' +
                ", modAuthor='" + modAuthor + '\'' +
                ", regDate=" + regDate +
                ", modDate=" + modDate +
                ", view_count=" + view_count +
                ", list=" + list +

                '}';
    }
}
