/*
    In the name of Allah, the Gracious, the Merciful
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author ibrahim
 */
public class Actions {
    
    
    private boolean isClicked;
    private int value;
    private int value2;
    private char operation;
    private boolean isOperationExist;
    

    //Constructor
    public Actions(){
        isClicked = false;
        value = 0;
        value2 = 0;
        operation = ' ' ;
    }
    
    //Setter and getter for isClicked
    public void setIsClicked(boolean isClicked){
        this.isClicked = isClicked;
    }
    public boolean getIsClicked(){
        return isClicked;
    }
    
    //Setter and getter for Value
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        if(isClicked){
            this.value *= 10;
            this.value += value;
        }else{
            this.value = value;
        }
    }
    
    //Setter and getter for value2
    public void setValue2(int value2){
        if(isClicked){
            this.value2 *= 10;
            this.value2 += value2;
        }else{
            this.value2 = value2;
        }        
    }
    public int getValue2(){
        return value2;
    }
    
    //setter and getter for operation
    public void setOperation(char Char){
        operation =  Char;
        isOperationExist = true;
    }
    public char getOperation (){
        return operation;
    }
    
    //getter for isOperationExist
    public boolean getIsOperationExist(){
        return isOperationExist;
    }
    
    public int calculation(){
        int result = 0;
        switch(operation){
            
            case '+': result = value + value2;
            break;
            
            case '-': result = value - value2;
            break;
            
            case '*': result = value * value2;
            break;
            
            case '/': result = value / value2;
            break;
            
        }
        return result;
    }
}
