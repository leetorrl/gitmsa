package com.pmh.org.file;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<FileEntity,Long> {

    //select*from free_board_file where free_board_idx=?
    List<FileEntity> findByFreeBoardIdx(Long freeBoardIdx);

}
