package com.gaj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 通讯录主表
 * </p>
 *
 * @author Jan
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TMember对象", description="通讯录主表")
public class TMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userid;

    private String name;

    private String mobile;

    private String department;

    private String sort;

    private String position;

    @ApiModelProperty(value = "性别(0:未知,1:男,2:女)")
    private String gender;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "小程序openId")
    private String isLeaderInDept;

    @ApiModelProperty(value = "头像url")
    private String avatar;

    @ApiModelProperty(value = "头像缩略图url")
    private String thumbAvatar;

    @ApiModelProperty(value = "座机")
    private String telephone;

    @ApiModelProperty(value = "别名")
    private String alias;

    @ApiModelProperty(value = "激活状态")
    private String status;

    @ApiModelProperty(value = "扩展属性")
    private String extattr;

    @ApiModelProperty(value = "员工个人二维码")
    private String qrCode;

    @ApiModelProperty(value = "成员对外属性")
    private String externalProfile;

    @ApiModelProperty(value = "对外职务")
    private String externalPosition;

    @ApiModelProperty(value = "地址")
    private String address;

    private String hideMobile;

    private String englishName;

    @ApiModelProperty(value = "open_userid")
    private String openUserid;

    @ApiModelProperty(value = "主部门")
    private String mainDepartment;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "1:有效;2无效")
    private String isValid;

    @ApiModelProperty(value = "1:同步;2不同步")
    private String syncFlag;

    @ApiModelProperty(value = "第三方头像")
    private String userAvatar;

    @ApiModelProperty(value = "第三方头像缩略图")
    private String userThumbAvatar;


}
