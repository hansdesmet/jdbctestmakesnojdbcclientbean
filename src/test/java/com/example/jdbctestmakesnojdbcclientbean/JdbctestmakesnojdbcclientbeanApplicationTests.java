package com.example.jdbctestmakesnojdbcclientbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;

@JdbcTest
class JdbctestmakesnojdbcclientbeanApplicationTests {
    @Autowired
    private JdbcClient jdbcClient;

    @Test
    void test() {
    }

}
