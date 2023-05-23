public class Aspirateur {
    
    private Position positionInitiale;


    public Aspirateur(Position p){
        this.positionInitiale = p;
    }

    /**
     * @param instructions la séquence d'instructions entrées
     * @param tailleX
     * @param tailleY
     */
    public void execInstructions(String instructions, int tailleX, int tailleY){

        for(int i=0 ; i<instructions.length(); i++){
            if(avancerAspirateur(instructions.charAt(i))){
                switch(positionInitiale.getOrientation()){
                    case 'N':
                        positionInitiale.deplacerHaut();
                        break;
                    case 'S':
                        positionInitiale.deplacerBas();
                        break;
                    case 'E':
                        positionInitiale.deplacerDroite();
                        break;
                    case 'W':
                        positionInitiale.deplacerGauche();
                        break;
                    default:
                        System.out.println("Orientation pas prise en compte");
                }
                
            }
            else{
                positionInitiale.changerOrientation(instructions.charAt(i));
            }
        }
        
    }

    private boolean avancerAspirateur(char instruction){
        return instruction == 'A';
    }

    public String toString(){
        return positionInitiale.toString();
    }
}
