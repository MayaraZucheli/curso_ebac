package table;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {LOCAL_VARIABLE})
public @interface anotation {

    String[] tabela();

}