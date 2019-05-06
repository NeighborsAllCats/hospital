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
@TableName("phs_fam_his")
public class PhsFamHis extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 病人id
     */
    @TableId("sick_id")
    private Integer sickId;
    /**
     * 成员编号
     */
    @TableField("family_id")
    private Integer familyId;
    /**
     * 成员身份
     */
    @TableField("family_relative")
    private String familyRelative;
    /**
     * 成员姓名
     */
    @TableField("family_name")
    private String familyName;
    /**
     * 病情内容
     */
    @TableField("history_content")
    private String historyContent;
    /**
     * 是否治愈成功
     */
    @TableField("cure_success")
    private String cureSuccess;
    /**
     * 患病时间
     */
    @TableField("illness_time")
    private Date illnessTime;
    /**
     * 治愈时间
     */
    @TableField("cure_time")
    private Date cureTime;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
