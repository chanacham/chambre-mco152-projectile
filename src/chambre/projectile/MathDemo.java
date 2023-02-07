package chambre.projectile;

public class MathDemo {
    public static void main(String[] args) {
        Projectile rocket = new Projectile(45, 80);
        for (int i = 0; i <= 11; i++) {
            System.out.println("t = " + rocket.getTime() + ": (" + rocket.getX() + ", " + rocket.getY() + ")");
            rocket.incTime(1);
        }
    }
}
