package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 21:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class DeviceInfoCondition extends AbstractBaseCondition {
    private Integer enabled;
    private String point;

    public DeviceInfoCondition() {
    }

    public DeviceInfoCondition(int page, int size) {
        super(page, size);
    }

    public DeviceInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}