package com.library.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public interface AdminDao {

    public int getMatchCount(@Param("admin_id") long admin_id, @Param("password") String password);

    public int resetPassword(@Param("admin_id") long admin_id, @Param("password") String password);

    public String getPassword(long admin_id);

    public String getUsername(long admin_id);

}
