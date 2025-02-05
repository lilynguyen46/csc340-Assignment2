package csc340.demo;

import org.springframework.web.context.annotation.ApplicationScope;

import java.lang.instrument.Instrumentation;

public class Cocktails {
    // Data
    private String name;
    private Glass glass;
    private Instructions instructions;
    private Ingredients ingredients;

    //Argumented constructor
    public Cocktails(String name, Glass glass,Instructions instructions, Ingredients ingredients) {
        this.name = name;
        this.glass = glass;
        this.instructions = instructions;
        this.ingredients = ingredients;
    }


    // Getter method
    public String getName() {
        return name;
    }

    public Glass getGlass() {
        return glass;
    }

    public Instructions getInstructions() {
        return instructions;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }


    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public void setInstructions(Instructions insturctions) {
        this.instructions = insturctions;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    // Objects
    public static class Name {
        private String name;

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }
    }

    public static class Glass {
        private Glass glass;

        public Glass getGlass() {
            return glass;
        }

        public void setGlass() {
            this.glass = glass;
        }
    }

    public static class Instructions {
        private Instructions instructions;

        public Instructions getInstructions() {
            return instructions;
        }

        public void setInstructions() {
            this.instructions = instructions;
        }
    }

    public static class Ingredients {
        private Ingredients ingredients;

        public Ingredients getIngredients() {
            return ingredients;
        }

        public void setIngredients() {
            this.ingredients = ingredients;
        }
    }




}
