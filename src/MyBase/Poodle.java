package MyBase;

class Poodle implements Dog
{
    private int weight = 0;

    public Poodle () {
        System.out.print("Instantiating Poodle is expensive, please wait 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ok finished");
    }

    public String getType() { return "Poodle"; };

    public void speak()
    {
        System.out.println("The Poodle says \"arf\", " + sit() + ", he weighs " + weight + " pounds");
    }

    public int getWeight () { return weight; };

    public void setWeight(int w) {
        if (w > 0 && w < 20) {
            weight = w;
        }
    }

    public String sit() {
        return "he knows how to sit";
    }
}