package com.gaj.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jan
 * @since 2020-10-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SyqDlfx对象", description="")
public class SyqDlfx implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    private String xzqh;

    private String mjbhqs;

    private Double mjbhsz;

    private String slbhqs;

    private Double slbhsz;

    private Date updateTime;

    private Date createTime;

    private Date tbrq;

    private String code;

}
