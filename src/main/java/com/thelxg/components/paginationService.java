package com.thelxg.components;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Ijiekhuamen Rex
 * on 4/6/2017.
 */

public interface paginationService<E> {

    PagedListHolder pagedListImpl(int size, HttpServletRequest request, List<E> pageSource);
}
