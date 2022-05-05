package com.library.dao;

import com.library.bean.Lend;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LendDao {

    public int returnBookOne(@Param("book_id") long book_id, @Param("reader_id") long reader_id);

    public int returnBookTwo(long book_id);

    public int lendBookOne(@Param("book_id") long book_id, @Param("reader_id") long reader_id);

    public int lendBookTwo(long book_id);

    public ArrayList<Lend> lendList();

    public ArrayList<Lend> myLendList(long reader_id);

    public int deleteLend(long ser_num);
}
