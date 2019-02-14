package com.onyx.note.controller;

import com.onyx.note.dao.TestMapper;
import com.onyx.note.entity.ResultReturn;
import com.onyx.note.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by User on 2019/1/28.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/getAll")
    public ResultReturn getAll() throws IOException {
        return new ResultReturn(testMapper.getAllData());
    }

    @RequestMapping("/add")
    public void add(@RequestBody TestData testData) throws IOException {
        testMapper.addTestData(testData);
    }
}
