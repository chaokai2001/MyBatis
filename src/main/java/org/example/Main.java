package org.example;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.Pojo.Mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        1.加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        2.获取sql对象
        SqlSession sqlSession= sqlSessionFactory.openSession();

//        3.执行sql
       List<Mybatis> Mybatis= sqlSession.selectList("test.selectBlog");
        System.out.println(Mybatis);
        System.out.println(1111);
        System.out.println(1111);
        System.out.println(1111);
//        4.释放资源
        sqlSession.close();
    }
}