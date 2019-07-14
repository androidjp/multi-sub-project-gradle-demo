package greeter.exception.assertion;

import greeter.constant.IResponseEnum;
import greeter.exception.BaseException;
import greeter.exception.BusinessException;

import java.text.MessageFormat;

public interface BusinessExceptionAssert extends Assert, IResponseEnum {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable throwable, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg, throwable);
    }
}
