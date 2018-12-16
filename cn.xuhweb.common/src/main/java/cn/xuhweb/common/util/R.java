package cn.xuhweb.common.util;

import java.io.Serializable;

/**
 * Created by xuh
 * DATE 2018/12/16 17:14.
 * version 1.0
 */
public class R<T> implements Serializable {

    private static final int SUCCESS = 200;

    private static final int FAIL = 500;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    public R() {
        super();
    }

    public R(T data){
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }

    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
