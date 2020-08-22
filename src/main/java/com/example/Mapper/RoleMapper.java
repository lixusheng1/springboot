package com.example.Mapper;

import com.example.Domain.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    @Select("select * from t_role")
    List<Role> findAll();
}
