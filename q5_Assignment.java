package assignment;
public class OperatorPriority {

    public static int getPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
           
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        char operator1 = '+';
        char operator2 = '*';
        char operator3 = '^';

        System.out.println("Priority of " + operator1 + ": " + getPriority(operator1));
        System.out.println("Priority of " + operator2 + ": " + getPriority(operator2));
        System.out.println("Priority of " + operator3 + ": " + getPriority(operator3));
    }
}

