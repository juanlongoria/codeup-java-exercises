package warmups;


//01/06
public class Penguin {
        private String name;
        private int weight;
        private String species;
        private char sex;


    public static boolean canFly() {
        return false;
    }

    public static boolean areEvil() {
        return true;
    }

    public Penguin() {
    }

    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
//        public static boolean canFly

//        public String toString() {
//            return String.format("{%nname: %s;%nage: %d;%nweight: %d;%nspecies: %d;%nsex: %d;%n}", name, age, weight, species, sex);
//        }

//        public String getName() {
//            return name;
//        }
//
//        public String getSpecies() {
//            return name;
//        }
//
//        public String setName() {
//            return name;
//        }
//
//        public String setSpecies() {
//            return name;
//        }
}
