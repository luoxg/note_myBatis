package com.onyx.note.controller;

import com.onyx.note.entity.NoteModel;
import com.onyx.note.entity.NoteSyncModel;
import com.onyx.note.entity.ResultReturn;
import com.onyx.note.entity.ScribbleSyncModel;
import com.onyx.note.service.NoteSyncService;
import com.onyx.note.service.ShapeSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lxg on 2019/2/20.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/scribble")
public class ScribbleSyncController {

    @Autowired
    private NoteSyncService noteSyncService;
    @Autowired
    private ShapeSyncService shapeSyncService;

    @RequestMapping("/upload")
    public ResultReturn upload(@RequestBody ScribbleSyncModel syncModel) throws IOException {
        if (checkRequestBody(syncModel)) {
            noteSyncService.addOrUpdateNoteModel(Arrays.asList(syncModel.getNoteSyncModel()));
            shapeSyncService.addOrUpdateShapeModel(syncModel.getAddShapeSyncModels());
            shapeSyncService.batchDeleteModel(syncModel.getDelShapeUniqueIDs());
        }
        return new ResultReturn();
    }

    @RequestMapping("/download")
    public ResultReturn download() throws IOException {
        List<ScribbleSyncModel> syncModels = new ArrayList<>();
        List<NoteModel> allNoteModel = noteSyncService.getAllNoteModel();
        for (NoteModel noteModel : allNoteModel) {
            ScribbleSyncModel syncModel = new ScribbleSyncModel();
            syncModel.setNoteSyncModel(new NoteSyncModel(noteModel));
            syncModel.setAddShapeSyncModels(shapeSyncService.getShapeModels(noteModel.getUniqueId()));
            syncModels.add(syncModel);
        }
        return new ResultReturn(syncModels);
    }

    private boolean checkRequestBody(ScribbleSyncModel syncModel) {
        if (syncModel == null) {
            return false;
        }
        if (syncModel.getNoteSyncModel() == null) {
            return false;
        }
        return true;
    }
}
