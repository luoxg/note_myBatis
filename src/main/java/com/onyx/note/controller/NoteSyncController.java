package com.onyx.note.controller;

import com.onyx.note.entity.NoteModel;
import com.onyx.note.entity.NoteModelParameter;
import com.onyx.note.entity.ResultReturn;
import com.onyx.note.service.NoteSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by User on 2019/1/29.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/note")
public class NoteSyncController {

    @Autowired
    private NoteSyncService syncService;

    @GetMapping("/all")
    public ResultReturn getAllNoteModel() throws IOException {
        return new ResultReturn(syncService.getAllNoteModel());
    }

    @RequestMapping("/single")
    public ResultReturn getNoteModel(NoteModelParameter parameter) throws IOException {
        return new ResultReturn(syncService.getNoteModel(parameter));
    }

    @RequestMapping("/upload")
    public ResultReturn addNoteModel(NoteModel noteModel) throws IOException {
        return new ResultReturn(syncService.addNoteModel(noteModel));
    }

    @RequestMapping("/delete")
    public ResultReturn addNoteModel(String pin, String uniqueId) throws IOException {
        syncService.deleteNoteModel(pin, uniqueId);
        return new ResultReturn();
    }

    @RequestMapping("/batchDelete")
    public ResultReturn batchDeleteModel(String uniqueId) throws IOException {
        syncService.batchDeleteModel(uniqueId);
        return new ResultReturn();
    }

    @RequestMapping("/update")
    public ResultReturn updateNoteModel(NoteModel noteModel) throws IOException {
        syncService.updateNoteModel(noteModel);
        return new ResultReturn();
    }

    @RequestMapping("/addOrUpdate")
    public ResultReturn addOrUpdate(NoteModel noteModel) throws IOException {
        syncService.addOrUpdateNoteModel(noteModel);
        return new ResultReturn();
    }
}
