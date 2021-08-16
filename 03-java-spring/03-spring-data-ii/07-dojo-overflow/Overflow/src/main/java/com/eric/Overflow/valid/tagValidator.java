package com.eric.Overflow.valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.eric.Overflow.models.Question;

@Component
public class tagValidator {
	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
	}
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		
		String[] tags = question.getTagsFrontEnd().split(", ");
		if(tags.length > 3) {
			errors.rejectValue("tagsFrontEnd", "Too Many", "Must have 3 tags or less");
		}
	}

}
