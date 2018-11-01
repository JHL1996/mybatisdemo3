package com.newer.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author shining
 * mybatis与数据库创建连接的工具类
 */
public class SqlSessionUtil {
    //用于生成连接的工厂对象
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            //读取主配置文件
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            //通过读取主配置文件生成sqlSessionFactory
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
     * 获取SqlSession的方法
     * SqlSession相当于mybatis版的Connection
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    /*
     * 关闭连接的方法
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }



}
