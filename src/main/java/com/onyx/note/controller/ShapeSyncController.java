package com.onyx.note.controller;

import com.onyx.note.entity.ResultReturn;
import com.onyx.note.entity.ShapeModel;
import com.onyx.note.service.ShapeSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by lxg on 2019/1/29.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/shape")
public class ShapeSyncController {

    @Autowired
    private ShapeSyncService syncService;

    @GetMapping("/all")
    public ResultReturn getAllShapeModel() throws IOException {
        return new ResultReturn(syncService.getAllShapeModel());
    }

    @RequestMapping("/single")
    public ResultReturn getShapeModel(String shapeUniqueId) throws IOException {
        return new ResultReturn(syncService.getShapeModel(shapeUniqueId));
    }

    @RequestMapping("/add")
    public ResultReturn addShapeModel(@RequestBody ShapeModel shapeModel) throws IOException {
        return new ResultReturn(syncService.addShapeModel(shapeModel));
    }

    @RequestMapping("/delete")
    public ResultReturn deleteShapeModel(String shapeUniqueId) throws IOException {
        syncService.deleteShapeModel(shapeUniqueId);
        return new ResultReturn();
    }

    @RequestMapping("/batchDelete")
    public ResultReturn batchDeleteModel(String shapeUniqueId) throws IOException {
        syncService.batchDeleteModel(shapeUniqueId);
        return new ResultReturn();
    }

    @RequestMapping("/update")
    public ResultReturn updateShapeModel(@RequestBody ShapeModel shapeModel) throws IOException {
        syncService.updateShapeModel(shapeModel);
        return new ResultReturn();
    }

    @RequestMapping("/addOrUpdate")
    public ResultReturn addOrUpdate(@RequestBody List<ShapeModel> shapeModel) throws IOException {
        syncService.addOrUpdateShapeModel(shapeModel);
        return new ResultReturn();
    }
}
