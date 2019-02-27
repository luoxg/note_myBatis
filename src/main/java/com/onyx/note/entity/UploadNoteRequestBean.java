package com.onyx.note.entity;

import java.util.List;

/**
 * Created by lxg on 2019/2/26.
 */

public class UploadNoteRequestBean {
    private NoteModel noteModel;
    private ShapeData shapeData;

    public NoteModel getNoteModel() {
        return noteModel;
    }

    public void setNoteModel(NoteModel noteModel) {
        this.noteModel = noteModel;
    }

    public ShapeData getShapeData() {
        return shapeData;
    }

    public void setShapeData(ShapeData shapeData) {
        this.shapeData = shapeData;
    }

    public static class ShapeData {
        private List<ShapeModel> add;
        private List<String> del;

        public List<ShapeModel> getAdd() {
            return add;
        }

        public void setAdd(List<ShapeModel> add) {
            this.add = add;
        }

        public List<String> getDel() {
            return del;
        }

        public void setDel(List<String> del) {
            this.del = del;
        }
    }
}
