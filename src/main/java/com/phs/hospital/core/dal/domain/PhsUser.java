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
@TableName("phs_user")
public class PhsUser extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @TableId("user_id")
    private Integer userId;
    /**
     * 密码
     */
    @TableField("user_password")
    private String userPassword;
    /**
     * 管理员权限0表示离职，1在职
     */
    @TableField("user_permission")
    private Integer userPermission;
    private String reserve1;
    private String reserve2;

}
