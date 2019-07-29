import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author epochong
 * @date 2019/7/13 11:46
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 不是RUNTIME的注解，无法用反射获取注解信息，必须用注解处理器去获取
 * 类级别的注解，只存在于字节码文件中(编译时期)，运行时是没有的
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ClassAnnotation {
    String value();
}
