package th1_animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "cục cục cục cục ccccc :))";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
