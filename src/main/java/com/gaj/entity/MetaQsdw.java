package com.gaj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="MetaQsdw对象", description="")
public class MetaQsdw implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "qsdwid", type = IdType.ID_WORKER)
    private Integer qsdwid;

    private String dm;

    private String qc;

    private String jc;

    private Integer jb;

    private String ssxzqdm;

    @TableField(exist = false)
    private List<MetaQsdw> metaQsdwChildren = new ArrayList<>();

    @TableField(exist = false)
    private List<SyqDlfx> syqDlfxChildren = new ArrayList<>();

    public void add(MetaQsdw metaQsdw) {
        metaQsdwChildren.add(metaQsdw);
    }

    public void add(SyqDlfx syqDlfx) {
        syqDlfxChildren.add(syqDlfx);
    }


}
