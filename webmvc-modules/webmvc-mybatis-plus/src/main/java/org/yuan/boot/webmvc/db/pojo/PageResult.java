package org.yuan.boot.webmvc.db.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.yuan.boot.webmvc.pojo.PageIterableResult;

public class PageResult<T> extends PageIterableResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public <E extends IPage<T>> PageResult(E iPage) {
        super(iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResult(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public <E extends IPage<T>> PageResult(Integer code, String message, E iPage) {
        super(code, message, iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }
}
