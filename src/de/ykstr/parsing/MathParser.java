package de.ykstr.parsing;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.variables.Variable;
import de.ykstr.entities.functions.binary.*;
import de.ykstr.entities.functions.unary.Braces;

public class MathParser {

    static char[] braces = {'(',')'};
    static char[] multiplication = {'*','/','%'};
    static char[] addition = {'+','-'};

    /*
     * Multiplication outside of braces before braces before addition
     */
    public static Calculable parse(String raw){
        int index = findGlobal(raw, addition);
        if(index >= 0){
            Calculable left = parse(raw.substring(0,index));
            Calculable right = parse(raw.substring(index+1,raw.length()));
            switch (raw.charAt(index)){
                case '+':
                    return new Plus(left, right);
                case '-':
                    return new Minus(left, right);
                default:
                    throw new IllegalStateException();
            }
        }

        index = findGlobal(raw, multiplication);
        if(index >= 0){
            Calculable left = parse(raw.substring(0,index));
            Calculable right = parse(raw.substring(index+1,raw.length()));
            switch (raw.charAt(index)){
                case '*':
                    return new Multiplication(left, right);
                case '/':
                    return new Division(left, right);
                case '%':
                    return new Modulus(left, right);
                default:
                    throw new IllegalStateException();
            }
        }

        if(raw.charAt(0) == '('){
            return new Braces(parse(raw.substring(1,raw.length()-1)));
        }
        return new Variable(raw);
    }

    public static int findGlobal(String s, char[] checks){
        int openBrackets = 0;
        int closedBrackets = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                openBrackets++;
            }else if(c == ')'){
                closedBrackets++;
            }else{
                for(char o : checks){
                    if(c == o && openBrackets == closedBrackets)return i;
                }
            }
        }
        return -1;
    }

    public static int findClosingBracket(String raw, int beginIndex, int endIndex){
        int openBraces = 0;
        int closingBraces = 0;
        for(int i = beginIndex;i<endIndex;i++){
            if(raw.charAt(i) == '('){
                openBraces++;
            }else if(raw.charAt(i) == ')'){
                closingBraces++;
            }
            if(openBraces == closingBraces){
                return i;
            }
        }
        return -1;
    }

}
