class RandomNumbers{
    static final int[] tab = {1,2,3,4,5,6,7,8,9,0};
    public static int randomElement(){
        return tab[Math.abs(new Random().nextInt() % 10)];
    }
}