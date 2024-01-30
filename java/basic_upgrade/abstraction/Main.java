package basic_upgrade.abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Watermelon watermelon = new Watermelon();
        // apple.taste();
        // watermelon.taste();
        // apple.state();

        // 추상화 활용하면 이와 같이 리스트로 묶어서 함수를 같이 활용할 수 있음
        ArrayList<Fruits> foods = new ArrayList<>();
        foods.add(apple);
        foods.add(watermelon);

        for(Fruits food:foods) {
            food.taste();
        }
    }
}
