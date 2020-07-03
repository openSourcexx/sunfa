package demo.angerbird;

public class BirdTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SlingShot slingshot = new SlingShot();

        Bird bird = new RedBird();
        slingshot.shoot(bird);

        bird = new YellowBird();
        slingshot.shoot(bird);

        bird = new BlueBird();
        slingshot.shoot(bird);
    }
}
