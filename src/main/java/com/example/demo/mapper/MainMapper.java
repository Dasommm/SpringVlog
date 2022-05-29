package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.MainVo;
@Mapper
@Repository
public interface MainMapper {

   List<Map<String, Object>> selectTest();

List<MainVo> getBlogList();

Map<String, Object> getDetail(int number);

int saveList(Map<String, Object> dto);
   
}