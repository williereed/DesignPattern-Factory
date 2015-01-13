package MyBase;

class Mutt implements Dog {

    private int weight = 0;

    public Mutt () {
        System.out.print("Instantiating Mutt is very expensive, please wait 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ok finished");
    }

    public String getType() { return "Mutt"; }

    public void speak() {
        System.out.println("The Mutt doesn't say anything he's mute, " + rollOver() + ", he weighs " + weight + " pounds");
    }

    public int getWeight () { return weight; };

    public void setWeight(int w) {
        if (w > 0 && w < 50) {
            weight = w;
        }
    }

    public String rollOver() {
        return " he can roll over";
    }
}