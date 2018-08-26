package org.ming.starter.test.rest.common.util;

import net.sf.json.JSONObject;

import java.util.HashMap;

/**
 * @author MingXiangjun
 * @create 2018-08-25 15:24
 */
public class ResultJsonUtil extends HashMap {


    private static final String STATE = "state";
    private static final String STATE_SUCCESS = "success";
    private static final String STATE_FAIL = "fail";
    private static final String RET_KEY_MSG="msg";
    private static final String RET_KEY_CODE="code";

    public ResultJsonUtil() {
    }

    public static ResultJsonUtil success() {
        return new ResultJsonUtil().setSuccess().code("1");
    }

    public static ResultJsonUtil success(Object key, Object value) {
        return success().set(key, value);
    }

    public static ResultJsonUtil success(String msg){
        return success().set(RET_KEY_MSG, msg);
    }

    public static ResultJsonUtil fail() {
        return new ResultJsonUtil().setFail().code("0");
    }

    public static ResultJsonUtil fail(Object key, Object value) {
        return fail().set(key, value);
    }

    public static ResultJsonUtil fail(String msg){
        return fail().set(RET_KEY_MSG, msg);
    }

    public ResultJsonUtil code(String code){
        super.put(RET_KEY_CODE,code);
        return this;
    }

    public ResultJsonUtil setSuccess() {
        super.put(STATE, STATE_SUCCESS);
        return this;
    }

    public ResultJsonUtil setFail() {
        super.put(STATE, STATE_FAIL);
        return this;
    }

    public boolean isSuccess() {
        Object state = get(STATE);
        if (STATE_SUCCESS.equals(state)) {
            return true;
        }
        if (STATE_FAIL.equals(state)) {
            return false;
        }
        throw new IllegalStateException("调用 isSuccess() 之前，必须先调用 success()、fail() 或者 setSuccess()、setFail() 方法");
    }

    public boolean isFail() {
        Object state = get(STATE);
        if (STATE_FAIL.equals(state)) {
            return true;
        }
        if (STATE_SUCCESS.equals(state)) {
            return false;
        }
        throw new IllegalStateException("调用 isFail() 之前，必须先调用 success()、fail() 或者 setSuccess()、setFail() 方法");
    }

    public ResultJsonUtil set(Object key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getStr(Object key) {
        Object s = get(key);
        return s != null ? s.toString() : null;
    }

    public Integer getInt(Object key) {
        Number n = (Number)get(key);
        return n != null ? n.intValue() : null;
    }

    public Long getLong(Object key) {
        Number n = (Number)get(key);
        return n != null ? n.longValue() : null;
    }

    public Boolean getBoolean(Object key) {
        Object result = get(key);
        return result instanceof Boolean ? (Boolean)result : null;
    }

    /**
     * key 存在，并且 value 不为 null
     */
    public boolean notNull(Object key) {
        return get(key) != null;
    }

    /**
     * key 不存在，或者 key 存在但 value 为null
     */
    public boolean isNull(Object key) {
        return get(key) == null;
    }

    /**
     * key 存在，并且 value 为 true，则返回 true
     */
    public boolean isTrue(Object key) {
        Object value = get(key);
        return (value instanceof Boolean && ((Boolean)value));
    }

    /**
     * key 存在，并且 value 为 false，则返回 true
     */
    public boolean isFalse(Object key) {
        Object value = get(key);
        return (value instanceof Boolean && ((Boolean)value));
    }

    public String toJson() {
        return JSONObject.fromObject(this).toString();
    }

    public boolean equals(Object ret) {
        return ret instanceof ResultJsonUtil && super.equals(ret);
    }
}
