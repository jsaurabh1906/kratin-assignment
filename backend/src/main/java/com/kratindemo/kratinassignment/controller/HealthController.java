package com.kratindemo.kratinassignment.controller;

import com.kratindemo.kratinassignment.service.impl.HealthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class HealthController {
    private HealthServiceImpl healthService;
@Autowired
public HealthController(HealthServiceImpl healthService){
  this.healthService=healthService;}
    @GetMapping("/health-tips")
    public Map<String,String> getHealthTips(){
        return healthService.getHealthTips();
    }
}
