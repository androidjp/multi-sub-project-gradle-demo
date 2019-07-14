package greeter.exception;


import greeter.constant.IResponseEnum;

/**
 * 参数异常：
 * 在处理业务过程中校验参数出现错误，可以抛出异常
 * 编写工具类方法时，入参检查不通过，也能抛异常
 */
public class ArgumentException extends BaseException {
    private static final long serialVersionUID = 1L;

    public ArgumentException(IResponseEnum responseEnum, Object[] args, String msg) {
        super(responseEnum, args, msg);
    }

    public ArgumentException(IResponseEnum responseEnum, Object[] args, String msg, Throwable cause) {
        super(responseEnum, args, msg, cause);
    }
}
