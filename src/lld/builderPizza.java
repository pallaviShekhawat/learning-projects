package lld;

//Builder Pattern is used to create complex objects step-by-step, especially when many optional parameters are involved, without exposing construction logic.
//✔ Object complex ho
//✔ Bahut saare optional parameters ho
//✔ Constructor overloading avoid karna ho
//✔ Immutable object banana ho


public class builderPizza {
    // Mandatory field

    private final String size ;

    // Optional fields

    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushroom;
    private final boolean extraToppings;

    // Private constructor (To restrict object creation only through Builder.)

    private builderPizza(PizzaBuilder builder){
        this.size = builder.size;
        this.cheese =builder.cheese;
        this.pepperoni =builder.pepperoni;
        this.mushroom = builder.mushroom;
        this.extraToppings = builder.extraToppings;

    }

    // Static Builder class


    public static class PizzaBuilder {
        // Mandatory

        private final String size ;
        // Optional

        private boolean cheese;
        private boolean pepperoni;
        private boolean mushroom;
        private boolean extraToppings;

        // Mandatory value through constructor

        public PizzaBuilder (String size){
            this.size = size;
        }
        public PizzaBuilder addCheese(){
            this.cheese = true ;
            return this; //return this ⇒ method chaining
        }

        public PizzaBuilder addPepperoni(){
            this.pepperoni = true;
            return this;
        }
        public PizzaBuilder addMushroom(){
            this.mushroom =true ;
            return this;
        }
        public PizzaBuilder addExtraToppings(){
            this.extraToppings = true;
            return this;
        }
        // Final object creation

        public builderPizza build (){
            return new builderPizza(this);
        }
    }

    @Override
    public String toString(){
        return "builderPizza {" +"size='" +size + '\'' +
                 ", Cheese=" +cheese +
                 ", Pepperoni=" +pepperoni +
                 ", Mushroom=" +mushroom +
                 ", ExtraToppings=" +extraToppings + '}';
    }
}

class pizzaOrder {
    public static void main(String[] args) {
        builderPizza vegPizza = new builderPizza.PizzaBuilder("Medium")
                .addCheese()
                .addMushroom()
                .build();
        builderPizza nonVegPizza = new builderPizza.PizzaBuilder("Large")
                .addCheese()
                .addPepperoni()
                .addExtraToppings()
                .build();

        System.out.println(vegPizza);
        System.out.println(nonVegPizza);

    }
}
