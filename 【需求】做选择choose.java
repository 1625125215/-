import java.util.Random;

public class choose {
    public static void main(String[] args) {
        random();
    }
    private static void random() {
        double random = Math.random();//产生一个[0，1)之间的随机数
        System.out.println("生成的数是："+random);
        System.out.println("----------------");
        if (random <= 0.3) {
            System.out.println("不学习");
        } else if (random >= 0.3 && random <= 0.6) {
        System.out.println("学习木吉他");}
        else if (random>=0.6&&random<=1){
            System.out.println("学习电吉他");
        }
    }
}
