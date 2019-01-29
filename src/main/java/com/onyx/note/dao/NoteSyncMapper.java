package com.onyx.note.dao;

import com.onyx.note.entity.NoteModel;
import com.onyx.note.entity.NoteModelParameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by User on 2019/1/29.
 */

public interface NoteSyncMapper {
    List<NoteModel> getAllNoteModel();
    NoteModel getNoteModel(NoteModelParameter parameter);
    void addNoteModel(List<NoteModel> noteModels);
    void deleteNoteModel(@Param("pin") String pin, @Param("uniqueId") String uniqueId);
    void batchDeleteModel(List<String> uniqueIds);
    void updateNoteModel(List<NoteModel> noteModels);
    void addOrUpdateNoteModel(List<NoteModel> noteModels);
}
