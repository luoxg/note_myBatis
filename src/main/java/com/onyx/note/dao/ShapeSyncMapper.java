package com.onyx.note.dao;

import com.onyx.note.entity.ShapeModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lxg on 2019/1/29.
 */

public interface ShapeSyncMapper {
    List<ShapeModel> getAllShapeModel();
    ShapeModel getShapeModel(@Param("shapeUniqueId") String shapeUniqueId);
    List<ShapeModel> getShapeModels(@Param("documentUniqueId") String documentUniqueId);
    void addShapeModel(List<ShapeModel> noteModels);
    void deleteShapeModel(@Param("shapeUniqueId") String shapeUniqueId);
    void batchDeleteModel(List<String> shapeUniqueIds);
    void updateShapeModel(List<ShapeModel> shapeModels);
    void addOrUpdateShapeModel(List<ShapeModel> shapeModels);
}
