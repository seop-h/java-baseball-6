package baseball.validator;

import java.util.List;

public class NewOrQuitValidator implements Validator{

    private static final NewOrQuitValidator VALIDATOR = new NewOrQuitValidator();

    private NewOrQuitValidator() {
    }

    public static void execute(String input){
        VALIDATOR.validate(input);
    }

    @Override
    public void validate(String input) {
        List<String> possibleNumber = List.of("1", "2");
        if (!possibleNumber.contains(input)) throw new IllegalArgumentException("1(재시작) 또는 2(종료) 이외의 입력입니다.");
    }
}
