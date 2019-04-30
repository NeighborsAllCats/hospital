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
@TableName("phs_appointment")
public class PhsAppointment extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 预约编号
     */
    @TableId("appointment_id")
    private Integer appointmentId;
    /**
     * 预约病人编号
     */
    @TableField("appointment_patnum")
    private Integer appointmentPatnum;
    /**
     * 当前时间
     */
    @TableField("local_time")
    private Date localTime;
    /**
     * 预约开始时间
     */
    @TableField("appointment_starttime")
    private Date appointmentStarttime;
    /**
     * 预约医生编号
     */
    @TableField("appointment_docnum")
    private Integer appointmentDocnum;
    /**
     * 预约状态为0表示预约失败初始值为0
     */
    @TableField("appointment_status")
    private String appointmentStatus;
    /**
     * 预约结束时间
     */
    @TableField("appointment_endtime")
    private Date appointmentEndtime;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private String reserve4;

}
