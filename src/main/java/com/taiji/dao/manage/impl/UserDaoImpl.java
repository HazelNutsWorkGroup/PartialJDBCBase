package com.taiji.dao.manage.impl;

import com.taiji.dao.manage.UserDao;
import com.taiji.entity.manage.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Sleeb on 2017/4/25.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String MATCH_USER_SQL = "SELECT * FROM t_manage_user "
            + " WHERE userId=? ";


    @Override
    public UserEntity getUser(final Long userId) {

        return jdbcTemplate.queryForObject(MATCH_USER_SQL, new Object[]{userId}, new BeanPropertyRowMapper<UserEntity>(UserEntity.class));
    }
}