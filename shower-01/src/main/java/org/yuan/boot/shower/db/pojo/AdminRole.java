package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class AdminRole extends BaseEntity implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * enabled
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;
}