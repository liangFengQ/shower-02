package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class DeviceInfoCondition extends BaseCondition {
    private Long id;
    private String code;
    private Integer enabled;

    public DeviceInfoCondition() {
    }

    public DeviceInfoCondition(int page, int size) {
        super(page, size);
    }

    public DeviceInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}