package com.library.dao;

import com.library.bean.ReaderInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


public interface ReaderInfoDao {
    public ArrayList<ReaderInfo> getAllReaderInfo();

    public ReaderInfo findReaderInfoByReaderId(long reader_id);

    public int deleteReaderInfo(long reader_id);

    public int editReaderInfo(ReaderInfo readerInfo);

    public int editReaderCard(ReaderInfo readerInfo);

    public long addReaderInfo(ReaderInfo readerInfo);
}
