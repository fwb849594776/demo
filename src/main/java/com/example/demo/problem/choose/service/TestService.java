package com.example.demo.problem.choose.service;

import com.example.demo.problem.choose.domain.Test;

import java.util.List;

public interface TestService {
    List<Test> findTestById(int id);
    List<Test> Test(String subject);
    List<Test> findAllTest(Test test);
    int addTest(Test test);
    int editTest(Test test);
    int delTest(int id);
}
