package com.onyx.note.dao;

import com.onyx.note.entity.TestData;

import java.util.List;

public interface TestMapper {
    List<TestData> getAllData();
    void addTestData(TestData testData);
}