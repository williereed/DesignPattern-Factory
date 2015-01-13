package MyBase;

import java.util.HashMap;

class DogFactory
{
    private static HashMap<String, Dog> RegisteredDogs = new HashMap();

    // register dogs which have been instantiated outside the getDogs method
    public static void Register(Dog dog) {
        if (!RegisteredDogs.containsKey(dog)) {
            RegisteredDogs.put(dog.getType(), dog);
            System.out.println("Registered " + dog.getType());
        }
    }

    // the getDogs method was written before SiberianHusky and Mutt were created
    public static Dog getDog(String type)
    {
        if (RegisteredDogs.containsKey(type)) {
            return RegisteredDogs.get(type);
        }
        else {
            DogTypes types = DogTypes.valueOf(type.toUpperCase());
            switch (types) {
                case POODLE:
                    RegisteredDogs.put("Poodle", new Poodle());
                    return RegisteredDogs.get("Poodle");

                case ROTTWEILER:
                    RegisteredDogs.put("Rottweiler", new Rottweiler());
                    return RegisteredDogs.get("Rottweiler");
            }
            return null;
        }
    }
}