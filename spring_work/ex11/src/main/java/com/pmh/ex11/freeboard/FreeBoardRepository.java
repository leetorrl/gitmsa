package com.pmh.ex11.freeboard;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FreeBoardRepository  extends JpaRepository<FreeBoard,Long> {

    @Modifying
    @Transactional
    @Query(value = "delete from FreeBoard db WHERE db.idx = :idx")
    void cusDeleteByIdx(@Param("idx") Long idx);
//    @Query(value = "delete * from FreeBoard db WHERE db.idx = :idx", nativeQuery = true)
}
