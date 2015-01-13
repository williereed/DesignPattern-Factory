package MyBase;

class Rottweiler implements Dog
{
    private int weight = 0;

    public Rottweiler () {
        System.out.print("Instantiating Rottweiler is very expensive, please wait 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ok finished");
    }

    public String getType() { return "Rottweiler"; }

    public void speak()
    {
        System.out.println("The Rottweiler says \"woof!\", " + attack() + ", he weighs " + weight + " pounds");
    }

    public int getWeight () { return weight; };

    public void setWeight(int w) {
        if (w > 0 && w < 100) {
            weight = w;
        }
    }

    public String attack() {
        return "he can attack";
    }
}
