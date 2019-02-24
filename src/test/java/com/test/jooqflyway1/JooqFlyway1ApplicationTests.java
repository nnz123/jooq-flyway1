package com.test.jooqflyway1;

import com.generator.tables.Author;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JooqFlyway1ApplicationTests {

    @Test
    public void contextLoads() {
       String  username = "root";
       String password = "root";
       String url = "jdbc:mysql://localhost:3306/jooq_flyway";
       String driver = "com.mysql.jdbc.Driver";
      try {

         // Class.forName(driver);
          Connection connection = DriverManager.getConnection(url,username,password);
          DSLContext dsl = DSL.using(connection, SQLDialect.MYSQL);

          List<com.generator.tables.pojos.Author> list = dsl.select().from(Author.AUTHOR).fetchInto(com.generator.tables.pojos.Author.class);
          System.out.println(list);
          connection.close();
      }catch (Exception e){
          e.printStackTrace();
      }





    }

}
