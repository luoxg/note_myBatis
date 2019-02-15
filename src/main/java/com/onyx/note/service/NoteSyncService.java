package com.onyx.note.service;

import com.onyx.note.dao.NoteSyncMapper;
import com.onyx.note.entity.NoteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lxg on 2019/1/29.
 */

@Service
public class NoteSyncService {

    @Autowired
    private NoteSyncMapper syncMapper;

    public List<NoteModel> getAllNoteModel() {
        return syncMapper.getAllNoteModel();
    }

    public NoteModel getNoteModel(String pin,  String uniqueId) {
        return syncMapper.getNoteModel(pin ,uniqueId);
    }

    public long addNoteModel(NoteModel noteModel) {
        syncMapper.addNoteModel(Arrays.asList(noteModel));
        return noteModel.getId();
    }

    public void deleteNoteModel(String pin, String uniqueId) {
        syncMapper.deleteNoteModel(pin, uniqueId);
    }

    public void batchDeleteModel(String uniqueId) {
        syncMapper.batchDeleteModel(Arrays.asList(uniqueId));
    }

    public void updateNoteModel(NoteModel noteModel) {
        syncMapper.updateNoteModel(Arrays.asList(noteModel));
    }

    public void addOrUpdateNoteModel(List<NoteModel> noteModel) {
        syncMapper.addOrUpdateNoteModel(noteModel);
    }
}
