package com.example;
import java.util.List;

public interface InterfaceFeline {
    int getKittens();

    int getKittens(int kittensCount);

    List<String> getFood(String animalKind) throws Exception;
}
