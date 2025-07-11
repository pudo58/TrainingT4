package com.diemdt.trainingT4.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T> {
    T findById(long id);

    List<T> findAll();

    T save(T t);

    void deleteById(long id);

    Page<T> findAll(T model, Pageable pageable);
}
