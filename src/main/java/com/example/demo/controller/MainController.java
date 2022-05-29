package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MainService;
import com.example.demo.vo.MainVo;
@RestController
@RequestMapping("/api/v1")
public class MainController {
   
   @Autowired
   MainService service;

   @GetMapping("/test1")
   public Map<String, Object> test1() {
      System.out.println("=== test1 ===");
      Map<String, Object> result = new HashMap<>();
      result.put("res", service.selectTest());
      return result; 
   }
   
   @PostMapping("/test2")
   public Map<String, Object> test2() {
      System.out.println("=== test2 ===");
      Map<String, Object> result = new HashMap<>();
      result.put("res", "완료");
      return result; 
   }
   
   @PostMapping("/getBlogList")
   public List<MainVo> getBlogList (){
	   System.out.println("=====블로그 글======");
	   List<MainVo> blogList = service.getBlogList();
	   
	   return blogList;
   }
   
   @GetMapping("/getDetail/{number}")
   public ResponseEntity<Map<String,Object>> getDetail(@PathVariable("number") int number) {
	   System.out.println("넘버"+number);
      return ResponseEntity.ok().body(service.getDetail(number));
   }
   
   @PostMapping("/save")
   public ResponseEntity save(@RequestBody Map<String,Object> dto) {
	   System.out.println("dto:"+ dto);
      return ResponseEntity.ok().body(service.save(dto));
   } 
}