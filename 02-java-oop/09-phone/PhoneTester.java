public class PhoneTester{
    public static void main(String[] args){
        Galexy s9 = new Galexy("S9", 99, "Verison", "ring, ring, ring!");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());
    }
}