package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public final class SysRole extends BaseEntity<SysRole> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;

    /**
     * authority
     */
    private String authority;

    /**
     * name
     */
    private String name;

    /**
     * createUser
     */
    private String createUser;

    /**
     * updateUser
     */
    private String updateUser;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    /**
     * enabled
     */
    private Integer enabled;

    public static SysRoleBuilder builder() {
        return new SysRoleBuilder();
    }
}