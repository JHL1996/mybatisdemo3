package com.newer.dao;

import com.newer.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author shining
 */
public interface BookMapper {

    @Insert("insert into bookinfo values (null,#{title},#{price}," +
            "#{auid})")
    int addBook(Book book);

    @Update("update bookinfo set title=#{title},price=#{price}," +
            "auid=#{auid} where bookid=#{bookId}")
    int updateBook(Book book);

    @Delete("delete from bookinfo where bookid=#{bookId}")
    int deleteBook(@Param("bookId")int bookId);

    @Select("select * from bookinfo where bookid=#{bookId}")
    Book findById(@Param("bookId")int bookId);

    @Results(value = {@Result(id = true,property = "bookId",column = "bookid"),
                        @Result(property = "title",column = "title"),
                        @Result(property = "price",column = "price"),
                        @Result(property = "author",column = "auid",
                                javaType = com.newer.pojo.Author.class,
                                one = @One(select = "com.newer.dao.AuthorMapper.findById"))})
    @Select("select * from bookinfo")
    List<Book> findAll();

    @ResultMap(value = "com.newer.dao.BookMapper.book1")
    @Select("SELECT bookid,title,price,b.auid,name FROM" +
            "         bookinfo b JOIN author a ON b.auid=a.auid")
    List<Book> findAll2();
}
