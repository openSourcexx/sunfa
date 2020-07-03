package demo.zhujie;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Column {
    String columnName();

    String columnType() default "varchar";

    int columnLength() default 20;

    String columnTraint() default "";
}
