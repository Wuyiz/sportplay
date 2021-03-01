package com.wuyiz.sportplay.util;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 0:25
 * @description: 返回结果类
 */
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result(ResultCode resultCode) {
        this.code = resultCode.code();
        this.msg = resultCode.message();
    }

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.code();
        this.msg = resultCode.message();
        this.data = data;
    }

    /**
     * 返回成功，不带数据对象
     * @return
     */
    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 返回成功，携带数据对象
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return new Result(ResultCode.SUCCESS, data);
    }

    /**
     * 返回失败，不携带数据对象
     * @return
     */
    public static Result failure() {
        return new Result(ResultCode.FAILURE);
    }

    /**
     * 返回失败，携带数据对象
     * @param data
     * @return
     */
    public static Result failure(Object data) {
        return new Result(ResultCode.FAILURE, data);
    }

    /**
     * 用户账户不存在或密码错误
     * @return
     */
    public static Result userLoginError() {
        return new Result(ResultCode.USER_LOGIN_ERROR);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
