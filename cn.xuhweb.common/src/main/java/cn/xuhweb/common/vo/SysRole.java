package cn.xuhweb.common.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by xuh
 * DATE 2018/12/16 20:31.
 * version 1.0
 */
@Data
public class SysRole {

    private Integer roleId;

    private String roleName;

    private String roleCode;

    private String roleDesc;

    private Date createTime;

    private Date updateTime;

    private String delFlag;

    @Override
    public String toString() {
        return "SysRole{" +
                ", roleId=" + roleId +
                ", roleName=" + roleName +
                ", roleCode=" + roleCode +
                ", roleDesc=" + roleDesc +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", delFlag=" + delFlag +
                "}";
    }
}
