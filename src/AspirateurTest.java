import static org.junit.Assert.assertEquals;

import org.junit.*;

public class AspirateurTest {

    @Test
    public void testDeplacementVersNord(){
        Position pos = new Position(new Point(1, 0), 'N');
        pos.deplacerHaut();
        assertEquals(pos.getCoordInitiales().getY(),1);
    }

    @Test
    public void testDeplacementVersSud(){
        Position pos = new Position(new Point(1, 1), 'N');
        pos.deplacerBas();
        assertEquals(pos.getCoordInitiales().getY(),0);
    }

    @Test
    public void testDeplacementVersEst(){
        Position pos = new Position(new Point(1, 0), 'N');
        pos.deplacerDroite();
        assertEquals(pos.getCoordInitiales().getX(),2);
    }

    @Test
    public void testDeplacementVersWest(){
        Position pos = new Position(new Point(1, 0), 'N');
        pos.deplacerGauche();
        assertEquals(pos.getCoordInitiales().getX(),0);
    }

    @Test 
    public void testChangementOrientation(){
        Position pos = new Position(new Point(1, 0), 'N');
        pos.changerOrientation('D');
        assertEquals(pos.getOrientation(), 'E');
    }
    
}
