package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.vo.MainVo;

public interface MainService {

   List<Map<String, Object>> selectTest();

List<MainVo> getBlogList();

Map<String, Object> getDetail(int number);

int save(Map<String, Object> dto);
   
}