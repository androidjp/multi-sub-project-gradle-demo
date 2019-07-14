package exception.handling.lib.exception;


import exception.handling.lib.constant.IResponseEnum;

/**
 * 校验异常
 * 调用接口时，参数格式不合法可以抛出该异常
 */
public class ValidationException extends BaseException {
    private static final long serialVersionUID = 1L;

    public ValidationException(IResponseEnum responseEnum, Object[] args, String msg) {
        super(responseEnum, args, msg);
    }

    public ValidationException(IResponseEnum responseEnum, Object[] args, String msg, Throwable cause) {
        super(responseEnum, args, msg, cause);
    }
}
