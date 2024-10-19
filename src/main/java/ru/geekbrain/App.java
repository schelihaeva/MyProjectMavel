package ru.geekbrain;

/**
 * Hello world!
 *
 */
import  com.google.common.base.Joiner;
public class App 
{
    public static void main( String[] args )
    {

        String[] words = {"Hello", "World"};
        String message= Joiner.on (" , ").join(words);

        System.out.println(message);
    }
}
