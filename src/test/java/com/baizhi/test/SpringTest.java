package com.baizhi.test;


import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dispatcher.xml")
public class SpringTest {

    @Autowired
    private User u;

    @Test
    public void test1(){

        System.out.println(u);

    }

}
