package com.newer.dao;

import com.newer.pojo.Author;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author shining
 */
public interface AuthorMapper {

    @Select("select * from author where auid=#{auid}")
    Author findById(@Param("auid")int auid);


}
