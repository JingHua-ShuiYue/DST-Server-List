package com.example.serverlist.controller;

import com.example.serverlist.R.R;
import com.example.serverlist.dao.ServerDao;
import com.example.serverlist.pojo.ServerInfo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
@Service
@RestController
public class MyController {

    @Resource
    private ServerDao serverDao;
    @ResponseBody
    @GetMapping("/getInfo")
    public R<Object> getInfo(){
        List<ServerInfo> serverInfos = serverDao.selectServices();
        R r = new R();
        r.add("serverInfos",serverInfos);
        return r;
    }
}
