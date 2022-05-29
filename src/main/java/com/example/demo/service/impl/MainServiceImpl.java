package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MainDao;
import com.example.demo.service.MainService;
import com.example.demo.vo.MainVo;

@Service
public class MainServiceImpl implements MainService {
   
   @Autowired
   MainDao dao;
   
   @Override
   public List<Map<String, Object>> selectTest() {
      return dao.selectTest();
   }

@Override
public List<MainVo> getBlogList() {
	return dao.getBlogList();
}

@Override
public Map<String, Object> getDetail(int number) {

	return dao.getDetail(number);
}

@Override
public int save(Map<String, Object> dto) {
	// TODO Auto-generated method stub
	return dao.saveList(dto);
}


}
