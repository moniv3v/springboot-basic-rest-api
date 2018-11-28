package com.tw.apistackbase.controller;

import com.tw.apistackbase.Object.Company;
import com.tw.apistackbase.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
//    @Autowired
//    CompanyService companyService;
//    @GetMapping(path = "", produces = {"application/json"})
//    public ResponseEntity<List<Company>> getAllCompany() {
//        List<Company> companyList = companyService.getAllCompany();
//        return ResponseEntity.ok(companyList);
//    }
//
//    @GetMapping(path = "/{numOfCompany}", produces = {"application/json"})
//    public ResponseEntity<List<Company>> getCompanyWithNumber(@PathVariable int numOfCompany) {
//        List<Company> companyList = companyService.getCompanyWithNumber();
//        return ResponseEntity.ok(companyList);
//    }
}
