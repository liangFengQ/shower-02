package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:16
 */
@ApiModel("角色模型")
@Data
public class SysRoleVo {
    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "名称", required = true)
    @NotEmpty
    private String name;
    @ApiModelProperty(value = "权限描述", required = true)
    @NotEmpty
    private String authority;
}