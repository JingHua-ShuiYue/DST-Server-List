package com.example.serverlist.dao;

import com.example.serverlist.pojo.ServerInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServerDao {
    List<ServerInfo> selectServices();
}
