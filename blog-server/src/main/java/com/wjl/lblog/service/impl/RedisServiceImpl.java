package com.wjl.lblog.service.impl;

import com.wjl.lblog.service.intf.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author: wjl
 * @time: 2022/5/2 16:39
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    /**
     * set expire time
     *
     * @param key  key
     * @param time time
     * @return state
     */
    @Override
    public boolean expire(String key, long time) {
        return false;
    }

    /**
     * get expire time
     *
     * @param key key
     * @return time
     */
    @Override
    public Long getExpire(String key) {
        return null;
    }

    /**
     * key if exists
     *
     * @param key key
     * @return state
     */
    @Override
    public Boolean hasKey(String key) {
        return null;
    }

    /**
     * delete cache
     *
     * @param key key
     */
    @Override
    public void del(String... key) {

    }

    /**
     * get value by key
     *
     * @param key key
     * @return value
     */
    @Override
    public Object get(String key) {
        return null;
    }

    /**
     * set data
     *
     * @param key   key
     * @param value value
     * @return state
     */
    @Override
    public boolean set(String key, Object value) {
        return false;
    }

    /**
     * set data and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    @Override
    public boolean set(String key, Object value, long time) {
        return false;
    }

    /**
     * increase
     *
     * @param key   key
     * @param delta delta > 0
     * @return long
     */
    @Override
    public Long incr(String key, long delta) {
        return null;
    }

    /**
     * decrease
     *
     * @param key   key
     * @param delta delta > 0
     * @return long
     */
    @Override
    public Long decr(String key, long delta) {
        return null;
    }

    /**
     * HashGet
     *
     * @param key  key - Notnull
     * @param item item - NotNull
     * @return data
     */
    @Override
    public Object hget(String key, String item) {
        return null;
    }

    /**
     * get keys of hashKey
     *
     * @param key key
     * @return map
     */
    @Override
    public Map<Object, Object> hmget(String key) {
        return null;
    }

    /**
     * HashSet
     *
     * @param key key
     * @param map map
     * @return state
     */
    @Override
    public boolean hmset(String key, Map<String, Object> map) {
        return false;
    }

    /**
     * HashSet and time
     *
     * @param key  key
     * @param map  map
     * @param time time
     * @return state
     */
    @Override
    public boolean hmset(String key, Map<String, Object> map, long time) {
        return false;
    }

    /**
     * set data into a hash table
     *
     * @param key   key
     * @param item  item
     * @param value value
     * @return state
     */
    @Override
    public boolean hset(String key, String item, Object value) {
        return false;
    }

    /**
     * set data into a hash table
     *
     * @param key   key
     * @param item  item
     * @param value value
     * @param time  time
     * @return state
     */
    @Override
    public boolean hset(String key, String item, Object value, long time) {
        return false;
    }

    /**
     * delete value in hash table
     *
     * @param key  key
     * @param item item
     */
    @Override
    public void hdel(String key, Object... item) {

    }

    /**
     * if value exist in hash table
     *
     * @param key  key
     * @param item item
     * @return state
     */
    @Override
    public boolean hHasKey(String key, String item) {
        return false;
    }

    /**
     * hash increase
     *
     * @param key  key
     * @param item item
     * @param by   by
     * @return double
     */
    @Override
    public double hincr(String key, String item, double by) {
        return 0;
    }

    /**
     * hash decrease
     *
     * @param key  key
     * @param item item
     * @param by   by
     * @return double
     */
    @Override
    public double hdecr(String key, String item, double by) {
        return 0;
    }

    /**
     * get value in set by key
     *
     * @param key key
     * @return set
     */
    @Override
    public Set<Object> sGet(String key) {
        return null;
    }

    /**
     * query by value in set
     *
     * @param key   key
     * @param value value
     * @return state
     */
    @Override
    public Boolean sHashKey(String key, Object value) {
        return null;
    }

    /**
     * set data into set
     *
     * @param key    key
     * @param values values
     * @return long
     */
    @Override
    public Long sSet(String key, Object... values) {
        return null;
    }

    /**
     * set data into set
     *
     * @param key    key
     * @param time   time
     * @param values values
     * @return long
     */
    @Override
    public Long sSetAndTime(String key, long time, Object... values) {
        return null;
    }

    /**
     * get length of set
     *
     * @param key key
     * @return length
     */
    @Override
    public Long sGetSetSize(String key) {
        return null;
    }

    /**
     * remove key of value
     *
     * @param key    key
     * @param values values
     * @return long
     */
    @Override
    public Long setRemove(String key, Object... values) {
        return null;
    }

    /**
     * get data of list
     *
     * @param key   key
     * @param start start
     * @param end   end
     * @return list
     */
    @Override
    public List<Object> lGet(String key, long start, long end) {
        return null;
    }

    /**
     * get length of list
     *
     * @param key key
     * @return length
     */
    @Override
    public Long lGetListSize(String key) {
        return null;
    }

    /**
     * get value by key
     *
     * @param key   key
     * @param index index
     * @return object
     */
    @Override
    public Object lGetIndex(String key, long index) {
        return null;
    }

    /**
     * set list
     *
     * @param key   key
     * @param value value
     * @return state
     */
    @Override
    public boolean lSet(String key, Object value) {
        return false;
    }

    /**
     * set list and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    @Override
    public boolean lSet(String key, Object value, long time) {
        return false;
    }

    /**
     * set list
     *
     * @param key   key
     * @param value value
     * @return state
     */
    @Override
    public boolean lSet(String key, List<Object> value) {
        return false;
    }

    /**
     * set list and time
     *
     * @param key   key
     * @param value value
     * @param time  time
     * @return state
     */
    @Override
    public boolean lSet(String key, List<Object> value, long time) {
        return false;
    }

    /**
     * update data by index
     *
     * @param key   key
     * @param index index
     * @param value value
     * @return state
     */
    @Override
    public boolean lUpdateIndex(String key, long index, Object value) {
        return false;
    }

    /**
     * remove value
     *
     * @param key   key
     * @param count count
     * @param value value
     * @return long
     */
    @Override
    public Long lRemove(String key, long count, Object value) {
        return null;
    }
}
