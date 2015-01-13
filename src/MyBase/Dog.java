package MyBase;

interface Dog
{
    public String getType ();
    public void speak ();
    public int getWeight();
    public void setWeight(int w);
}

enum DogTypes {
    POODLE ("Poodle"), ROTTWEILER ("Rottweiler"), SIBERIANHUSKY ("SiberianHusky"), MUTT ("Mutt");

    private String name;

    DogTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
