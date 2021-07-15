public class Bat{

    protected int energyLevel;

    public Bat (int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Bats enregy level" + this.energyLevel);
        return this.energyLevel;
    }

    public void fly(){
        System.out.println("The bat is flying!");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("The bat just ate someone! Run!!");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("The town is ablaze!");
        this.energyLevel -= 100;
    }
}