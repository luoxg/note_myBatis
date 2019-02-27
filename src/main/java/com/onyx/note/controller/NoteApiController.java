package com.onyx.note.controller;

import com.onyx.note.entity.*;
import com.onyx.note.service.NoteSyncService;
import com.onyx.note.service.ShapeSyncService;
import com.onyx.note.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lxg on 2019/2/22.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/api/note")
public class NoteApiController {

    @Autowired
    private NoteSyncService syncService;
    @Autowired
    private ShapeSyncService shapeSyncService;

    @RequestMapping("/upload")
    public ResultReturn upload(@RequestBody UploadNoteRequestBean requestBean) throws IOException {
        if (!checkRequestBody(requestBean)) {
            return new ResultReturn(ResultReturn.FAILURE, "没有上传数据");
        }
        syncService.addOrUpdateNoteModel(requestBean.getNoteModel());
        UploadNoteRequestBean.ShapeData shapeData = requestBean.getShapeData();
        if (shapeData != null) {
            shapeSyncService.addOrUpdateShapeModel(shapeData.getAdd());
            shapeSyncService.batchDeleteModel(shapeData.getDel());
        }
        return new ResultReturn();
    }

    @RequestMapping("/download")
    public ResultReturn download() throws IOException {
        List<DownloadNoteResultData> resultBeans = new ArrayList<>();
        List<NoteModel> allNoteModel = syncService.getAllNoteModel();
        for (NoteModel noteModel : allNoteModel) {
            DownloadNoteResultData resultBean = new DownloadNoteResultData();
            resultBean.setNoteModel(noteModel);
            List<ShapeModel> shapeModels = shapeSyncService.getShapeModels(noteModel.getUniqueId());
            DownloadNoteResultData.ShapeData data = new DownloadNoteResultData.ShapeData();
            data.setAdd(shapeModels);
            resultBean.setShapeData(data);
            resultBeans.add(resultBean);
        }
        return new ResultReturn(resultBeans);
    }

    @RequestMapping("/delete")
    public ResultReturn delete(@RequestBody List<String> uniqueIDs) throws IOException {
        if (CollectionUtils.isNullOrEmpty(uniqueIDs)) {
            return new ResultReturn();
        }
        syncService.batchDeleteModel(uniqueIDs);
        shapeSyncService.deleteByDocumentUniqueId(uniqueIDs);
        return new ResultReturn();
    }

    private boolean checkRequestBody(UploadNoteRequestBean requestBean) {
        if (requestBean == null) {
            return false;
        }
        if (requestBean.getNoteModel() == null) {
            return false;
        }
        return true;
    }
}
