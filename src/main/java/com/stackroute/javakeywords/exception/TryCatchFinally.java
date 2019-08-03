package com.stackroute.javakeywords.exception;

public class TryCatchFinally {

    public static String riskyAction(){
        try{
            System.out.println("Started executing try block");
            return "returning from try block";
        }catch(Exception e){
            return "returning from catch blcok";
        }finally{
            System.out.println("print statement from finally");
        }
    }
}