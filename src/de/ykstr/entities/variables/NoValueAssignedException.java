package de.ykstr.entities.variables;

public class NoValueAssignedException extends RuntimeException {

    private String variableName;

    public NoValueAssignedException(String variableName){
        this.variableName = variableName;
    }

    @Override
    public String getMessage() {
        return "The variable "+variableName+" has no assigned value";
    }
}
