package others;

public class MecExzm {

    public static void main(String[] args){
        /*MecExzm mecExzm = new MecExzm();

        System.out.println(mecExzm.check("12345"));
        System.out.println(mecExzm.check("123456"));
        System.out.println(mecExzm.check(null));*/

       // Cat c = new Cat();
        //Cat newCat = new Animal();


    }

    private boolean check(String s){
        try{
            return s.length() >5;
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return false;
        }


    }


}

class Animal {
    public static void show()
    {
        System.out.println("In Animal");

    }
}

class Cat extends Animal {
    public static void show()
    {
        System.out.println("In Cat");

    }
}
