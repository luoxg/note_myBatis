package com.onyx.note.entity;

import java.util.List;

/**
 * Created by lxg on 2019/2/18.
 */

public class ScribbleSyncModel {
    private NoteSyncModel noteSyncModel;
    private List<ShapeModel> addShapeSyncModels;
    private List<String> delShapeUniqueIDs;

    public NoteSyncModel getNoteSyncModel() {
        return noteSyncModel;
    }

    public void setNoteSyncModel(NoteSyncModel noteSyncModel) {
        this.noteSyncModel = noteSyncModel;
    }

    public List<ShapeModel> getAddShapeSyncModels() {
        return addShapeSyncModels;
    }

    public void setAddShapeSyncModels(List<ShapeModel> addShapeSyncModels) {
        this.addShapeSyncModels = addShapeSyncModels;
    }

    public List<String> getDelShapeUniqueIDs() {
        return delShapeUniqueIDs;
    }

    public void setDelShapeUniqueIDs(List<String> delShapeUniqueIDs) {
        this.delShapeUniqueIDs = delShapeUniqueIDs;
    }
}
