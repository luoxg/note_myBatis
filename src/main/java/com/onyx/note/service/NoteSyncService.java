package com.onyx.note.service;

import com.onyx.note.dao.NoteSyncMapper;
import com.onyx.note.entity.NoteModel;
import com.onyx.note.utils.CollectionUtils;
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

    public void deleteNoteModel(String uniqueId) {
        syncMapper.deleteNoteModel(uniqueId);
    }

    public void batchDeleteModel(List<String> uniqueIds) {
        syncMapper.batchDeleteModel(uniqueIds);
    }

    public void updateNoteModel(NoteModel noteModel) {
        syncMapper.updateNoteModel(Arrays.asList(noteModel));
    }

    public void addOrUpdateNoteModel(List<NoteModel> noteModels) {
        if (CollectionUtils.isNullOrEmpty(noteModels)) {
            return;
        }
        syncMapper.addOrUpdateNoteModel(noteModels);
    }

    public void addOrUpdateNoteModel(NoteModel noteModel) {
        if (noteModel == null) {
            return;
        }
        syncMapper.addOrUpdateNoteModel(Arrays.asList(noteModel));
    }
}
