package com.socrates.commons;

import java.util.List;

/**
 * The interface Abstract mapper.
 *
 * @param <O> the origin type parameter
 * @param <T> the target type parameter
 */
//@Mapper(componentModel = "spring")
public interface AbstractMapper<O, T> {
    /**
     * Direct mapping t.
     *
     * @param origin the origin
     * @return the t
     */
    T directMapping(O origin);

    /**
     * Inverse mapping o.
     *
     * @param target the target
     * @return the o
     */
    O inverseMapping(T target);

    /**
     * Direct mapping list.
     *
     * @param origin the origin
     * @return the list
     */
    List<T> directMapping(List<O> origin);

    /**
     * Inverse mapping list.
     *
     * @param target the target
     * @return the list
     */
    List<O> inverseMapping(List<T> target);
}
