package sample.Domain;

import java.security.SecureRandom;

/**
 * Created by thabomoopa on 12/05/2018.
 */
public class Play {

    //private Map<String,String> animals;

    private String name;
    private String image;

    SecureRandom random = new SecureRandom();
//
//    public PlayController(Map animals)
//    {
//        this.animals = animals;
//    }

//    public Map<String, String> getAnimals() {
//        return animals;
//    }
//
//    public void setAnimals(Map<String, String> animals) {
//        this.animals = animals;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    public void populateAnimals()
//    {
//       animals = new HashMap<String, String>();
//        animals.put("Lion", "lion.png");
//        animals.put("Elephant", "elephant.png");
//        animals.put("Rhinoceros", "rhino.png");
//        animals.put("Leopard", "leopard.png");
//        animals.put("Buffalo", "buffalo.png");
//    }
}
