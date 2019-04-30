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
@TableName("phs_patientinfo")
public class PhsPatientinfo extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 病人id
     */
    @TableId(value = "patient_id", type = IdType.AUTO)
    private Integer patientId;
    /**
     * 病人姓名
     */
    @TableField("patient_name")
    private String patientName;
    private Integer sex;
    private Integer age;
    /**
     * 身份证号
     */
    private String identity;
    /**
     * 手机号码/用户名
     */
    @TableField("cellphone_number")
    private String cellphoneNumber;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 身高
     */
    private Double height;
    /**
     * 体重
     */
    private Double weight;
    /**
     * 病情描述
     */
    @TableField("sick_desc")
    private String sickDesc;
    /**
     * 科室id
     */
    @TableField("section_num")
    private Integer sectionNum;
    /**
     * 当前时间
     */
    @TableField("local_time")
    private Date localTime;
    /**
     * 选择医生
     */
    @TableField("doctor_num")
    private Integer doctorNum;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
