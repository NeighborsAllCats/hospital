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
@TableName("phs_evaluate")
public class PhsEvaluate extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 评价编号
     */
    @TableId(value = "evaluate_id", type = IdType.AUTO)
    private Integer evaluateId;
    /**
     * 评价医生编号
     */
    @TableField("evaluate_docnum")
    private Integer evaluateDocnum;
    /**
     * 医生考评分数
     */
    @TableField("evaluate_docscore")
    private Integer evaluateDocscore;
    /**
     * 医生评价内容
     */
    @TableField("evaluate_doccontent")
    private String evaluateDoccontent;
    /**
     * 评价科室编号
     */
    @TableField("evaluate_secnum")
    private Integer evaluateSecnum;
    /**
     * 科室考评分数
     */
    @TableField("evaluate_secscore")
    private Integer evaluateSecscore;
    /**
     * 科室评价内容
     */
    @TableField("evaluate_seccontent")
    private String evaluateSeccontent;
    /**
     * 评价时间
     */
    @TableField("evaluate_time")
    private Date evaluateTime;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
