package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.MainMapper;
import com.example.demo.vo.MainVo;
@Repository
public class MainDao {

   @Autowired
    private MainMapper mapper;
   
   public List<Map<String, Object>> selectTest(){ 
      return mapper.selectTest(); 
   }

public List<MainVo> getBlogList() {
	// TODO Auto-generated method stub
	return mapper.getBlogList();
}

public Map<String, Object> getDetail(int number) {
	// TODO Auto-generated method stub
	return mapper.getDetail(number);
}


public int saveList(Map<String, Object> dto) {
	// TODO Auto-generated method stub
	return mapper.saveList(dto);
}
}