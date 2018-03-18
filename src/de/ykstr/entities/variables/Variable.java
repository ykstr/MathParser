package de.ykstr.entities.variables;

import de.ykstr.entities.Calculable;

public class Variable implements Calculable {
    private String name;
    private Double value;
    private static final char[] NUMERIC = {'1','2','3','4','5','6','7','8','9','0','.'};


    public Variable(double value){
        this.value = value;
    }

    public Variable(String value){
        if(isNumeric(value)){
            setValue(Double.parseDouble(value));
        }else{
            setName(value);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public double calculate(){
        return value;
    }

    public static boolean isNumeric(String s){
        for(char c: s.toCharArray()){
            if(!isNumeric(c))return false;
        }
        return true;
    }

    public static boolean isNumeric(char c){
        for(char n : NUMERIC){
            if(c == n)return true;
        }
        return false;
    }

    @Override
    public void setVariable(String name, double value){
        if(this.name != null && this.name.equals(name)){
            setValue(value);
        }
    }

    @Override
    public String toString() {
        if(value == null){
            return name;
        }else{
            if(value % 1 == 0){
                return String.format("%1.0f",value);
            }else{
                return Double.toString(value);
            }
        }
    }
}
