package org.yuan.boot.webmvc.db.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.webmvc.pojo.PageIterableResult;

/**
 * @param <T>
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends PageIterableResult<T> {
    public PageResult(Page<T> page) {
        super(page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(Integer code, String message, Page<T> page) {
        super(code, message, page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResult(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }
}
