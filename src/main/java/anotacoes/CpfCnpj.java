package anotacoes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.validacao.CpfCnpjValidator;

/**
 * 
 * @author wallyson = wallyson.connect3@gmail.com
 *
 */
@Constraint(validatedBy = { CpfCnpjValidator.class })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface CpfCnpj {
	String message() default "CPF/CNPJ inválido";

	  Class<?>[] groups() default {};

	  Class<? extends Payload>[] payload() default {};
}
