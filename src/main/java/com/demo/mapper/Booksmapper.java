package com.demo.mapper;

import com.demo.bean.Books;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Booksmapper {
    @Select("select * from books")
    List<Books> finAll();

    @Select("select * from books WHERE BookID=#{BookID}")
    Books booksById(Integer BookID);

    @Insert("insert into books values(#{bookID},#{bookName},#{bookCounts},#{Detail})")
    int addBooks(Books books);

    @Delete("DELETE FROM books WHERE books.bookID=#{BookID}")
    int deleteBooks(Integer BookID);

    @Select("SELECT * from user  WHERE user.name=#{name} and user.password=#{password}")
    boolean seleuser(String name, String password);

    @Update("update books set bookName=#{bookName},bookCounts=#{bookCounts},Detail=#{Detail} where bookID=#{bookID}")
    int updebooks(Books books);

}
