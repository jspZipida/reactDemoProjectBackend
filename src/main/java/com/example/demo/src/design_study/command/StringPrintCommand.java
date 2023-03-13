package com.example.demo.src.design_study.command;

public class StringPrintCommand implements Command{

    protected String str;

    public StringPrintCommand(String str){
        this.str = str;
    }

    @Override
    public int compareTo(Command o){
        StringPrintCommand other = (StringPrintCommand) o;
        return this.str.length() - other.str.length();
    }

    @Override
    public void excute() {
        System.out.println(this.str);
    }

}
