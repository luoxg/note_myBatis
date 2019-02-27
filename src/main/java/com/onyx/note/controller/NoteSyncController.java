package com.onyx.note.controller;

import com.onyx.note.entity.NoteModel;
import com.onyx.note.entity.ResultReturn;
import com.onyx.note.service.NoteSyncService;
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
@RequestMapping("/note")
public class NoteSyncController {

    @Autowired
    private NoteSyncService syncService;

    @GetMapping("/all")
    public ResultReturn getAllNoteModel() throws IOException {
        return new ResultReturn(syncService.getAllNoteModel());
    }

    @RequestMapping("/single")
    public ResultReturn getNoteModel(String pin,  String uniqueId) throws IOException {
        return new ResultReturn(syncService.getNoteModel(pin, uniqueId));
    }

    @RequestMapping("/add")
    public ResultReturn addNoteModel(@RequestBody NoteModel noteModel) throws IOException {
        return new ResultReturn(syncService.addNoteModel(noteModel));
    }

    @RequestMapping("/delete")
    public ResultReturn deleteNoteModel(String uniqueId) throws IOException {
        syncService.deleteNoteModel(uniqueId);
        return new ResultReturn();
    }

    @RequestMapping("/batchDelete")
    public ResultReturn batchDeleteModel(List<String> uniqueIds) throws IOException {
        syncService.batchDeleteModel(uniqueIds);
        return new ResultReturn();
    }

    @RequestMapping("/update")
    public ResultReturn updateNoteModel(@RequestBody NoteModel noteModel) throws IOException {
        syncService.updateNoteModel(noteModel);
        return new ResultReturn();
    }

    @RequestMapping("/addOrUpdate")
    public ResultReturn addOrUpdate(@RequestBody List<NoteModel> noteModel) throws IOException {
        syncService.addOrUpdateNoteModel(noteModel);
        return new ResultReturn();
    }
}
