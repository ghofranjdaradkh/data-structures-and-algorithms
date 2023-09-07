package stack.queue.brackets;

public class Library {
    public static void main(String[] args) {
        validateBrackets validator = new validateBrackets();

        System.out.println(validator.validBracket("{}"));
        System.out.println(validator.validBracket("{}(){}"));
        System.out.println(validator.validBracket("()[[Extra Characters]]"));
        System.out.println(validator.validBracket("{}{Code}[Fellows](())"));
        System.out.println(validator.validBracket("[({}]"));
        System.out.println(validator.validBracket("(]("));
        System.out.println(validator.validBracket("{(})"));
    }

}
