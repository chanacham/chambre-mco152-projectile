package Chambre.Projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void getX(){
        //given
        Projectile projectile = new Projectile(39, 77, 6);

        //when
        double x = projectile.getX();

        //then
        assertEquals(359.0414, x,0.0001);
    }

}