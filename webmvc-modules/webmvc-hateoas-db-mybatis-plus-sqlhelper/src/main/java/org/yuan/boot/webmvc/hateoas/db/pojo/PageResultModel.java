package org.yuan.boot.webmvc.hateoas.db.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.Link;
import org.yuan.boot.webmvc.db.pojo.PageResult;
import org.yuan.boot.webmvc.hateoas.pojo.PageIterableDataResultModel;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanEnZhi
 * @create: 2019-12-27 20:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageIterableDataResultModel<T> {
    public <E extends IPage<T>> PageResultModel(E iPage) {
        super(iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResultModel(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(PagingResult<T> result) {
        super(result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public <E extends IPage<T>> PageResultModel(E iPage, Link link) {
        super(iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages(), link);
    }

    public PageResultModel(PageInfo<T> pageInfo, Link link) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), link);
    }

    public PageResultModel(PagingResult<T> result, Link link) {
        super(result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount(), link);
    }

    public <E extends IPage<T>> PageResultModel(E iPage, List<Link> links) {
        super(iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages(), links);
    }

    public PageResultModel(PageInfo<T> pageInfo, List<Link> links) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), links);
    }

    public PageResultModel(PagingResult<T> result, List<Link> links) {
        super(result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount(), links);
    }

    public <E extends IPage<T>> PageResultModel(Integer code, String message, E iPage) {
        super(code, message, iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResultModel(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public <E extends IPage<T>> PageResultModel(int code, String message, E iPage, Link initialLink) {
        super(code, message, iPage.getRecords(), initialLink, iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResultModel(int code, String message, PageInfo<T> pageInfo, Link initialLink) {
        super(code, message, pageInfo.getList(), initialLink, pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(int code, String message, PagingResult<T> result, Link initialLink) {
        super(code, message, result.getItems(), initialLink, result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public <E extends IPage<T>> PageResultModel(int code, String message, E iPage, List<Link> initialLinks) {
        super(code, message, iPage.getRecords(), initialLinks, iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResultModel(int code, String message, PageInfo<T> pageInfo, List<Link> initialLinks) {
        super(code, message, pageInfo.getList(), initialLinks, pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(int code, String message, PagingResult<T> result, List<Link> initialLinks) {
        super(code, message, result.getItems(), initialLinks, result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public PageResultModel(PageResult<T> result) {
        super(result);
    }

    public PageResultModel(PageResult<T> result, Link initialLink) {
        super(result, initialLink);
    }

    public PageResultModel(PageResult<T> result, List<Link> initialLinks) {
        super(result, initialLinks);
    }
}