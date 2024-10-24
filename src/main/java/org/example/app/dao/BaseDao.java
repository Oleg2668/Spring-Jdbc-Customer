package org.example.app.dao;

import java.util.List;
import java.util.Optional;

public interface BaseDao<T,S> {
    boolean create(S request);
    Optional<List<T>> fetchAll();
    Optional<T> fetchById(Long id);
    boolean updateById(Long id, S request);
    boolean deleteById(Long id);
}
