package com.szdhc.common.service;

/**
 * @author zouke
 */
public interface Function<T,E> {
    public T callback(E e);
}
