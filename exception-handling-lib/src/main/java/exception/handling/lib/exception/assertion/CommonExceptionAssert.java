package exception.handling.lib.exception.assertion;


import exception.handling.lib.constant.IResponseEnum;
import exception.handling.lib.exception.ArgumentException;
import exception.handling.lib.exception.BaseException;

import java.text.MessageFormat;

public interface CommonExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new ArgumentException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new ArgumentException(this, args, msg, t);
    }

}