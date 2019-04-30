package com.phs.hospital.core.dal.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.phs.hospital.core.common.base.BaseModel;
import com.baomidou.mybatisplus.annotations.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("phs_section")
public class PhsSection extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 科室总编号
     */
    @TableId("section_number")
    private Integer sectionNumber;
    /**
     * 科室总名称
     */
    @TableField("section_name")
    private String sectionName;
    /**
     * 科室楼层号
     */
    @TableField("section_floor")
    private String sectionFloor;
    /**
     * 科室门牌号
     */
    @TableField("section_door")
    private String sectionDoor;
    /**
     * 字段为0表示不显示，即删除
     */
    @TableField("secton_delete")
    private String sectonDelete;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
