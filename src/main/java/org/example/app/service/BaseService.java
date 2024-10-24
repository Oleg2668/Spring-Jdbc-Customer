package org.example.app.service;

import java.util.List;

public interface BaseService<T,S> {
    T create(S request);
    List<T> fetchAll();
    T fetchById(Long id);
    T updateById(Long id, S request);
    boolean deleteById(Long id);
}
