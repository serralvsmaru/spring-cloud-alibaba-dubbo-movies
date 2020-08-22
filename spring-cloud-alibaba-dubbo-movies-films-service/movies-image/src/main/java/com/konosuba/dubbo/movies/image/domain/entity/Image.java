package com.konosuba.dubbo.movies.image.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_image")
public class Image {
    /**
     * 主键
     */
    @TableId(value = "image_id", type = IdType.AUTO)
    private Integer imageId;

    /**
     * 图片地址
     */
    @TableField(value = "image_address")
    private String imageAddress;

    public static final String COL_IMAGE_ID = "image_id";

    public static final String COL_IMAGE_ADDRESS = "image_address";
}