package com.onyx.note.service;

import com.onyx.note.dao.ShapeSyncMapper;
import com.onyx.note.entity.ShapeModel;
import com.onyx.note.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lxg on 2019/1/29.
 */

@Service
public class ShapeSyncService {

    @Autowired
    private ShapeSyncMapper syncMapper;

    public List<ShapeModel> getAllShapeModel() {
        return syncMapper.getAllShapeModel();
    }

    public ShapeModel getShapeModel(String shapeUniqueId) {
        return syncMapper.getShapeModel(shapeUniqueId);
    }

    public long addShapeModel(ShapeModel shapeModel) {
        syncMapper.addShapeModel(Arrays.asList(shapeModel));
        return shapeModel.getId();
    }

    public void deleteShapeModel(String shapeUniqueId) {
        syncMapper.deleteShapeModel(shapeUniqueId);
    }

    public void batchDeleteModel(String shapeUniqueId) {
        syncMapper.batchDeleteModel(Arrays.asList(shapeUniqueId));
    }

    public void updateShapeModel(ShapeModel shapeModel) {
        syncMapper.updateShapeModel(Arrays.asList(shapeModel));
    }

    public void addOrUpdateShapeModel(List<ShapeModel> shapeModels) {
        if (CollectionUtils.isNullOrEmpty(shapeModels)) {
            return;
        }
        syncMapper.addOrUpdateShapeModel(shapeModels);
    }
}
