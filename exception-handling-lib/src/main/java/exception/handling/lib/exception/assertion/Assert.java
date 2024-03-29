package exception.handling.lib.exception.assertion;


import exception.handling.lib.exception.BaseException;

/**
 * 仿照 unit test 断言的写法
 */
public interface Assert {
    BaseException newException(Object... args);

    BaseException newException(Throwable throwable, Object... args);

    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw newException(obj);
        }
    }
}
