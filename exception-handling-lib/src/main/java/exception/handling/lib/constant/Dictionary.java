package exception.handling.lib.constant;

public interface Dictionary {
    /**
     *  字典代码
     * @return
     */
    String getCode();

    /**
     * 字典名称
     * @return
     */
    String getName();

    /**
     * 判断字典代码是否相同
     * @param code
     * @return
     */
    default boolean equalsCode(String code) {
        return getCode().equals(code);
    }
}