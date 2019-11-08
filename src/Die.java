public class Die {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
    public Die(){

    }
    public int roll(){
        int x = (int) Math.random()*6+1;
        int y = (int) Math.random()*6+1;
        return x;
    }

}
