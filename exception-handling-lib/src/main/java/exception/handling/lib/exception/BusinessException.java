package exception.handling.lib.exception;

import exception.handling.lib.constant.IResponseEnum;

/**
 * 业务异常
 */
public class BusinessException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BusinessException(IResponseEnum responseEnum, Object[] args, String msg) {
        super(responseEnum, args, msg);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String msg, Throwable cause) {
        super(responseEnum, args, msg, cause);
    }
}
