package by.it.kharevich.Test;

import org.apache.commons.lang3.StringUtils;

public class Hello {
    public static void main(String[] args) {
        for (String arg: args){
            if(StringUtils.isAllLowerCase(arg)){
                System.out.println(arg);
            }
        }
    }
}
