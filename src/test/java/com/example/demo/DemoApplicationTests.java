package com.example.demo;

import com.example.Domain.Role;
import com.example.Domain.User;
import com.example.Mapper.UserMapper;
import com.example.ServiceImp.RoleServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class DemoApplicationTests {
    @Resource
    private UserMapper mapper;
    @Test
    void contextLoads() {
    }


    @Test
    public void aInsert() {
        User user = new User();
        user.setUsername("小羊");
        user.setPassword("111111");
        user.setPhone("123789");
        user.setEmail("abc@mp.com");
        assertThat(mapper.insert(user)).isGreaterThan(0);
        // 成功直接拿会写的 ID
        assertThat(user.getId()).isNotNull();
        log.info("id:"+user.getId().toString());

    }

    @Autowired
    private RoleServiceImp roleServiceImp;
    @Test
    public void testMybatis(){
        List<Role> list = roleServiceImp.findAll();
        log.info("list:"+list);
    }

}
