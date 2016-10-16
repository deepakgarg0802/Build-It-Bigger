package com.example;

import java.util.Random;

public class NerdyJoke {
    String jokes[];
    int num_of_jokes=3;

    public NerdyJoke(){

        jokes= new String[num_of_jokes];

        jokes[0]="What is a programmer's favourite hangout place ???? Its FOO BAR";
        jokes[1]=" A Foo walks into a bar, takes a look around and says , Hello World";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
    }

    public String getJoke(){
        Random random= new Random();
        int index= random.nextInt(num_of_jokes);

        return jokes[index];
    }
}
