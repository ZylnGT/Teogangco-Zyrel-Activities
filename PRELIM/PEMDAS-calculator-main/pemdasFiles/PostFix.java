package pemdasFiles;
public class PostFix {
    private StackChar stack;
    private String newExpression;

    public PostFix(){
        stack = new StackChar();    //create a stack for operators
        newExpression = "";
    }

    public String converToPostFix(String exp){
        return toPostFix(exp);
    }

    private void updateExpression(char x){
        newExpression += x;
    }

    private int checkPriority(char x){ //a method to check hierarchy in PEMDAS
        switch(x){
            case '(':
                return 0;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case 'u':
                return 3;
            case '^':
                return 4;
        }
        return -1;
    }

    public String toPostFix(String exp){
        char previous = '_';
        for(int i = 0; i < exp.length(); i++){
            char x = exp.charAt(i);
            switch(x){
                case ' ': 
                    break;
                case '(':
                    if(isNumber(previous) || previous == ')'){ // added multiplication using parentheses
                        updateExpression('_'); //separator from operator
                        stack.push('*');
                    }
                    stack.push(x);
                    break;
                case ')':
                    char n;
                    while((n = stack.pop()) != '('){
                        updateExpression(n);
                    }
                    break;
                default:
                    if(isNumber(x)){
                        updateExpression(x);
                    }
                    else{
                        if(x == '-' && (previous == '_' || previous == '(' || checkPriority(previous) > 0) ){ //check for unary minus
                            // updateExpression(x);
                            stack.push('u');          
                        }
                        else{                 
                            updateExpression('_'); //separator
                            while(checkPriority(stack.peek()) >= checkPriority(x)){
                                updateExpression(stack.pop());
                            }
                            stack.push(x);
                        }

                    }
                    break;
            }
            if(x == ' ') previous = '_';
            else previous = x;
        }

        //after loop has ended pop the remaining operators
        while( stack.getTop()!= 0){
            updateExpression(stack.pop());
        }
        return newExpression;
    }

    private boolean isNumber(char x){
        return Character.isDigit(x);
    }
}
