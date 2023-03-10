package org.example.Mapper;

import org.example.Pojo.Mybatis;

import java.util.List;

public interface UserMapper {
    List<Mybatis> selectAll();
}
