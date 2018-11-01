package com.newer.test;

import com.newer.dao.BookMapper;
import com.newer.pojo.Book;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author shining
 */
public class BookTest {

    @Test
    public void test1(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        BookMapper dao=sqlSession.getMapper(BookMapper.class);

        Book book=dao.findById(3);
        System.out.println(book.getTitle());

        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void test2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        BookMapper dao=sqlSession.getMapper(BookMapper.class);

        List<Book> list=dao.findAll2();

        list.forEach(book -> System.out.println(book.getTitle()+" "+book.getAuthor().getName()));

        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
