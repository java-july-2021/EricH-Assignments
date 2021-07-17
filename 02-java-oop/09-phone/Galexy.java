public class Galexy extends Phone implements Ringable{
    public Galexy (String versionNumber, int batterPercentage, String carrier, String ringTone){
        super (versionNumber, batterPercentage, carrier, ringTone);
    }
    @Override
    public String ring(){
        return this.getRingTone();
    }

    @Override
    public String unlock(){
        return "Unlocked by faceID";
    }

    @Override
    public void displayInfo(){
        System.out.println("Version Number" + this.getVersionNumber());
        System.out.println("Battery Percent" + this.getBatteryPercentage());
        System.out.println("Carrier" + this.getCarrier());
        System.out.println("Ring Tone" + this.getRingTone());
    }

}