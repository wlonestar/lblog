package com.wjl.lblog.service.intf;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: wjl
 * @time: 2022/5/2 16:35
 */
public interface RedisService {

    /**
     * set expire time
     *
     * @param key  key
     * @param time time
     * @return state
     */
    boolean expire(String key, long time);

    /**
     * get expire time
     *
     * @param key key
     * @return time
     */
    Long getExpire(String key);

    /**
     * key if exists
     *
     * @param key key
     * @return state
     */
    Boolean hasKey(String key);

    /**
     * delete cache
     *
     * @param key key
     */
    void del(String... key);

    // ============================== string ==================================

    /**
     * get value by key
     *
     * @param key key
     * @return value
     */
    Object get(String key);

    /**
     * set data
     *
     * @param key   key
     * @param value value
     * @return state
     */
    boolean set(String key, Object value);

    /**
     * set data and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    boolean set(String key, Object value, long time);

    /**
     * increase
     *
     * @param key   key
     * @param delta delta > 0
     * @return long
     */
    Long incr(String key, long delta);

    /**
     * decrease
     *
     * @param key   key
     * @param delta delta > 0
     * @return long
     */
    Long decr(String key, long delta);

    // ================================ map ===================================

    /**
     * HashGet
     *
     * @param key  key - Notnull
     * @param item item - NotNull
     * @return data
     */
    Object hget(String key, String item);

    /**
     * get keys of hashKey
     *
     * @param key key
     * @return map
     */
    Map<Object, Object> hmget(String key);

    /**
     * HashSet
     *
     * @param key key
     * @param map map
     * @return state
     */
    boolean hmset(String key, Map<String, Object> map);

    /**
     * HashSet and time
     *
     * @param key  key
     * @param map  map
     * @param time time
     * @return state
     */
    boolean hmset(String key, Map<String, Object> map, long time);

    /**
     * set data into a hash table
     *
     * @param key   key
     * @param item  item
     * @param value value
     * @return state
     */
    boolean hset(String key, String item, Object value);

    /**
     * set data into a hash table
     *
     * @param key   key
     * @param item  item
     * @param value value
     * @param time  time
     * @return state
     */
    boolean hset(String key, String item, Object value, long time);

    /**
     * delete value in hash table
     *
     * @param key  key
     * @param item item
     */
    void hdel(String key, Object... item);

    /**
     * if value exist in hash table
     *
     * @param key  key
     * @param item item
     * @return state
     */
    boolean hHasKey(String key, String item);

    /**
     * hash increase
     *
     * @param key  key
     * @param item item
     * @param by   by
     * @return double
     */
    double hincr(String key, String item, double by);

    /**
     * hash decrease
     *
     * @param key  key
     * @param item item
     * @param by   by
     * @return double
     */
    double hdecr(String key, String item, double by);

    // ================================ set ===================================

    /**
     * get value in set by key
     *
     * @param key key
     * @return set
     */
    Set<Object> sGet(String key);

    /**
     * query by value in set
     *
     * @param key   key
     * @param value value
     * @return state
     */
    Boolean sHashKey(String key, Object value);

    /**
     * set data into set
     *
     * @param key    key
     * @param values values
     * @return long
     */
    Long sSet(String key, Object... values);

    /**
     * set data into set
     *
     * @param key    key
     * @param time   time
     * @param values values
     * @return long
     */
    Long sSetAndTime(String key, long time, Object... values);

    /**
     * get length of set
     *
     * @param key key
     * @return length
     */
    Long sGetSetSize(String key);

    /**
     * remove key of value
     *
     * @param key    key
     * @param values values
     * @return long
     */
    Long setRemove(String key, Object... values);

    /**
     * get data of list
     *
     * @param key   key
     * @param start start
     * @param end   end
     * @return list
     */
    List<Object> lGet(String key, long start, long end);

    /**
     * get length of list
     *
     * @param key key
     * @return length
     */
    Long lGetListSize(String key);

    /**
     * get value by key
     *
     * @param key   key
     * @param index index
     * @return object
     */
    Object lGetIndex(String key, long index);

    /**
     * set list
     *
     * @param key   key
     * @param value value
     * @return state
     */
    boolean lSet(String key, Object value);

    /**
     * set list and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    boolean lSet(String key, Object value, long time);

    /**
     * set list
     *
     * @param key   key
     * @param value value
     * @return state
     */
    boolean lSet(String key, List<Object> value);

    /**
     * set list and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    boolean lSet(String key, List<Object> value, long time);

    /**
     * update data by index
     *
     * @param key   key
     * @param index index
     * @param value value
     * @return state
     */
    boolean lUpdateIndex(String key, long index, Object value);

    /**
     * remove value
     *
     * @param key   key
     * @param count count
     * @param value value
     * @return long
     */
    Long lRemove(String key, long count, Object value);

}
