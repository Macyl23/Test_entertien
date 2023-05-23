public class Position {
    

    private Point coordInitiales;
    private char orientation;

    public char getOrientation() {
        return orientation;
    }

    public Position(Point pos, char orientation){
        this.coordInitiales = pos;
        this.orientation = orientation;
    }

    public void deplacerHaut(){
        coordInitiales.incrementerY();
    }

    public void deplacerBas(){
        coordInitiales.decrementerY();
    }

    public void deplacerGauche(){
        coordInitiales.decrementerX();
    }

    public void deplacerDroite(){
        coordInitiales.incrementerX();
    }

    public void changerOrientation(char direction){
        switch(orientation){
            case 'N':
                if(direction == 'D')
                    orientation = 'E';
                else
                    orientation = 'W';
                break;
            case 'E':
                if(direction == 'D')
                    orientation = 'S';
                else
                    orientation = 'N';
                break;
            case 'W':
                if(direction == 'D')
                    orientation = 'N';
                else
                    orientation = 'S';
                break;
            case 'S':
                if(direction == 'D')
                    orientation = 'W';
                else
                    orientation = 'E';
                break;
        }
    }


    public Point getCoordInitiales() {
        return coordInitiales;
    }
    public String toString(){
        return coordInitiales.toString()+ orientation +")";
    }
}
