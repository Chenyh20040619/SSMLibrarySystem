package com.library.dao;

import com.library.bean.ReaderCard;
import com.library.bean.ReaderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface ReaderCardDao {

    public int getIdMatchCount(@Param("reader_id") long reader_id, @Param("password") String password);

    public ReaderCard findReaderByReaderId(long reader_id);

    public int resetPassword(@Param("reader_id") long reader_id, @Param("newPassword") String newPassword);

    public int addReaderCard(@Param("readerInfo") ReaderInfo readerInfo, @Param("password") String password);
    public String getPassword(long reader_id);

    public int deleteReaderCard(long reader_id);
}
