package com.pandawork.mapper;

import com.pandawork.common.entity.Image;
import org.apache.ibatis.annotations.Param;

public interface ImageMapper {

    public boolean addImage(@Param("image") Image image) throws Exception;
}
