package MyBase;

class SiberianHusky implements Dog {

    private int weight = 0;

    public SiberianHusky () {
        System.out.print("Instantiating SiberianHusky is very expensive, please wait 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ok finished");
    }

    public String getType() { return "SiberianHusky"; }

    public void speak() {
        System.out.println("The SiberianHusky says \"what's up?\", " + stay() + ", he weighs " + weight + " pounds");
    }

    public int getWeight () { return weight; };

    public void setWeight(int w) {
        if (w > 0 && w < 200) {
            weight = w;
        }
    }

    public String stay() {
        return "he can stay";
    }
}