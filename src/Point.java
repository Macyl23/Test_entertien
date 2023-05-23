public class Point {
    
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void incrementerY(){
        if(aspirateurHeurteMurNord()){
            System.err.println("Aspirateur se heurte au mur");
            System.exit(1);
        }
        this.y++;
        
    }

    public void decrementerY(){
        if(aspirateurHeurteMurSud()){
            System.err.println("Aspirateur se heurte au mur");
            System.exit(1);
        }
        this.y--;
    }

    public void incrementerX(){
        if(aspirateurHeurteMurEst()){
            System.err.println("Aspirateur se heurte au mur");
            System.exit(1);
        }
        this.x++;
    }

    public void decrementerX(){
        if(aspirateurHeurteMurWest()){
            System.err.println("Aspirateur se heurte au mur");
            System.exit(1);
        }
        this.x--;
    }
    public int getX() {
        return x;
    }
     
    public int getY() {
        return y;
    }

    private boolean aspirateurHeurteMurNord(){
        return this.y + 1 > Grille.getDimensionY();
    }
    private boolean aspirateurHeurteMurEst(){
        return this.x + 1 > Grille.getDimensionX();
    }
    private boolean aspirateurHeurteMurWest(){
        return this.x - 1 < 0;
    }
    private boolean aspirateurHeurteMurSud(){
        return this.y - 1 < 0;
    }

    public String toString(){
        return "("+x+","+y+",";
    }
}
