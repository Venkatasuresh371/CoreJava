package java8Features.src.programes;

import java.util.Arrays;
import java.util.Optional;

public class LastElementOfAnArray
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to java 8 features");
        Integer[] a = {10,40,20,40,50};
        Arrays.stream(a).skip(a.length - 1).findFirst().ifPresent(System.out::println);
       // Optional<Integer> opt = Arrays.stream(a).skip(a.length - 1).findFirst();
        //opt.ifPresent(System.out::println);
    }
}
