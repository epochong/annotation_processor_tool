/**
 * @author epochong
 * @date 2019/7/13 11:45
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
/**
 * 只含有一个属性时
 * 等价于@ClassAnnotation("类级别的注释")
 */
@ClassAnnotation(value = "类级别的注解")
class A {

}
public class Main {
    public static void main(String[] args) {
        ClassAnnotation annotation = A.class.getAnnotation(ClassAnnotation.class);
        if (annotation != null) {
            System.out.println(annotation.value());
        }
    }
}
