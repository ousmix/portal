package com.baeldung.spring.dao;


import java.util.List;
import java.util.Map;

public interface GenericDao<E,K> {

    public void add(E entity);

    public void saveOrUpdate(E entity) ;

    public void update(E entity) ;

    public void delete(E entity);

    public E find(K key);

    public List<E> getAll();
}