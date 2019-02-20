package com.onyx.note.entity;

/**
 * Created by lxg on 2019/2/19.
 */

public class NoteSyncModel extends NoteModel {

    private int action;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public NoteSyncModel() {
    }

    public NoteSyncModel(NoteModel noteModel) {
        setAsyncStatus(noteModel.getAsyncStatus());
        setBackground(noteModel.getBackground());
        setCreatedAt(noteModel.getCreatedAt());
        setCurrentShapeType(noteModel.getCurrentShapeType());
        setEraserWidth(noteModel.getEraserWidth());
        setExtraAttributes(noteModel.getExtraAttributes());
        setLineLayoutBackground(noteModel.getLineLayoutBackground());
        setNoteBackground(noteModel.getNoteBackground());
        setPageNameList(noteModel.getPageNameList());
        setPageOriginHeight(noteModel.getPageOriginHeight());
        setPageOriginWidth(noteModel.getPageOriginWidth());
        setParentUniqueId(noteModel.getParentUniqueId());
        setPin(noteModel.getPin());
        setUniqueId(noteModel.getUniqueId());
        setUpdatedAt(noteModel.getUpdatedAt());
        setTitle(noteModel.getTitle());
        setSubPageName(noteModel.getSubPageName());
        setPosition(noteModel.getPosition());
        setSource(noteModel.getSource());
        setStrokeColor(noteModel.getStrokeColor());
        setStrokeWidth(noteModel.getStrokeWidth());
        setType(noteModel.getType());
    }
}
