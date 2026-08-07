class Pokemon {
    int power;
    String type;

    Pokemon(String type, int power) {
        this.power = power;
        this.type = type;
    }
    
    Pokemon() {}

    void print() {
        System.out.println(this.power + " " + this.type);
    }

    // Added 'static' keyword
    static class LegendPokemon extends Pokemon {
        String ability;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Now valid: static nested class doesn't need outer instance
        Pokemon.LegendPokemon mewto = new Pokemon.LegendPokemon(); 
        mewto.ability = "Pressure";
        
        Pokemon pikachu = new Pokemon();
        pikachu.power = 50; // Assigning value to field

        // Access fields directly, no parentheses
        System.out.println(mewto.ability); 
        System.out.println(pikachu.power);
    }
}   