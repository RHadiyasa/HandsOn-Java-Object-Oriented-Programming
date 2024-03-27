package rafi.hadiyasa.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE) // Bisa digunakan di Class, Interface, Enum
@Retention(RetentionPolicy.RUNTIME) // Value tidak wajib, bisa langsung seperti ini
public @interface Description {
    String name();
    String[] tags() default {}; // Tipe data array dengan default array kosong
}
