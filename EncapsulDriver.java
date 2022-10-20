public class EncapsulDriver {
    public static void main(String[] args) {
        Encapsul e = new Encapsul();
        e.setHt(4);
        e.setWt(3);
        System.out.println("The height is: "+e.getHt());
        System.out.println("The height is: "+e.getWt());
        System.out.println("The area is: "+e.area());
        System.out.println("The perimeter is: "+e.perimeter());
    }

}
