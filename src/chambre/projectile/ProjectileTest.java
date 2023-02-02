package chambre.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void getX(){
        Projectile projectile = new Projectile(39, 77);
        double x = projectile.getX();
        assertEquals(359.0414, x,0.0001);
    }

}