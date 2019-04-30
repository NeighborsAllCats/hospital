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
@TableName("phs_doctorinfo")
public class PhsDoctorinfo extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 数据编号
     */
    @TableId(value = "doctor_id", type = IdType.AUTO)
    private Integer doctorId;
    /**
     * 医生编号
     */
    @TableField("doctor_deptnum")
    private Integer doctorDeptnum;
    /**
     * 医生姓名
     */
    @TableField("doctor_name")
    private String doctorName;
    /**
     * 账户密码
     */
    @TableField("doctor_password")
    private String doctorPassword;
    private Integer sex;
    private Integer age;
    /**
     * 医生职位
     */
    private String position;
    /**
     * 科室编号
     */
    @TableField("section_number")
    private Integer sectionNumber;
    /**
     * 工作时间
     */
    @TableField("work_time")
    private Date workTime;
    /**
     * 擅长领域(根据内容推送)
     */
    private String adept;
    /**
     * 荣誉描述
     */
    @TableField("honor_desc")
    private String honorDesc;
    /**
     * 医生状态0表示离职
     */
    @TableField("doctor_delete")
    private String doctorDelete;
    /**
     * 是否接受预约
     */
    @TableField("doctor_notice")
    private Integer doctorNotice;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
