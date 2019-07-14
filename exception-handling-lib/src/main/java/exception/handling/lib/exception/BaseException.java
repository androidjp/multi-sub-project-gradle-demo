package exception.handling.lib.exception;


import exception.handling.lib.constant.IResponseEnum;

/**
 * @author jpuneng
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     */
    protected IResponseEnum responseEnum;
    /**
     * 异常消息参数
     */
    protected Object[] args;

    public BaseException(int code, String msg) {
        super(msg);
        this.responseEnum = new IResponseEnum() {
            @Override
            public int getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return msg;
            }
        };
    }

    public BaseException(IResponseEnum responseEnum) {
        super(responseEnum.getMessage());
        this.responseEnum = responseEnum;
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String msg) {
        super(msg);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String msg, Throwable cause) {
        super(msg, cause);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public IResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public Object[] getArgs() {
        return args;
    }
}
