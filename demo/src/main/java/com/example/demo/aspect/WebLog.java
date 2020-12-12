package com.example.demo.aspect;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * 日志描述信息
     * ①：什么时候使用该注解，我们定义为运行时；
     * ②：注解用于什么地方，我们定义为作用于方法上；
     * ③：注解是否将包含在 JavaDoc 中；
     * ④：注解名为 WebLog;
     * ⑤：定义一个属性，默认为空字符串；
     * @return
     */
    String description() default "";
}
