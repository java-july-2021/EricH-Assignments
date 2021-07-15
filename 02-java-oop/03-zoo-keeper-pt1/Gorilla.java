public class Gorilla extends Mammal{

    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("The gorilla just threw someting!");
        this.energyLevel -= 5;
        // decrease energy by 5
    }
    
    public void eatBananas(){
        System.out.println("Gorilla is eatting a banana");
        this.energyLevel += 10;
        // increase energyby 10
    }
    
    public void climb() {
        System.out.println("Gorilla is climbing a wall!");
        this.energyLevel -= 10;
        // decease energy by 10
    }
    
}