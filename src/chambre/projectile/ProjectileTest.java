package chambre.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void getX(){
        Projectile xTest = new Projectile(45, 80);
        xTest.incTime(1);
        assertEquals(56.568542494923804, xTest.getX());
        xTest.incTime(1);
        assertEquals(113.13708498984761, xTest.getX());
    }

    @Test
    public void getY(){
        Projectile yTest = new Projectile(45, 80);
        yTest.incTime(1);
        assertEquals(51.6685424949238, yTest.getY());
        yTest.incTime(1);
        assertEquals(93.53708498984759, yTest.getY());
    }

}