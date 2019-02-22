package com.onyx.note.controller;

import com.alibaba.fastjson.JSON;
import com.onyx.note.entity.NoteModel;
import com.onyx.note.entity.ResultReturn;
import com.onyx.note.entity.UploadRequestBean;
import com.onyx.note.service.NoteSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lxg on 2019/2/22.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/api")
public class NoteApiController {

    @Autowired
    private NoteSyncService syncService;

    @RequestMapping("/note/upload")
    public ResultReturn upload(MultipartFile file, UploadRequestBean requestBean) throws IOException {
        NoteModel noteModel = JSON.parseObject(requestBean.getNotemodel(), NoteModel.class);
        NoteModel model = syncService.getNoteModel(noteModel.getPin(), noteModel.getUniqueId());
        if (noteModel == null) {
            return new ResultReturn(ResultReturn.FAILURE);
        }
        if (model == null) {
            syncService.addNoteModel(noteModel);
        } else {
            syncService.updateNoteModel(noteModel);
        }
        file.transferTo(getFilePath(file.getOriginalFilename()));
        return new ResultReturn();
    }


    @RequestMapping("/note/download")
    public ResultReturn download() throws IOException {
        return new ResultReturn(syncService.getAllNoteModel());
    }

    private File getFilePath(String name) {
        return new File("e:/upload/" + name);
    }
}
