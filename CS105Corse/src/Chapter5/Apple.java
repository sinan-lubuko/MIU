package Chapter5;

public class Apple {
        // Data Members
        private String color;
        private double weight;
        private double price;
        //Constructor - Default
        public Apple() {
            color = "Red";
            weight = 0.88;
            price = 0.75;
        }
        //Parameterized Constructor
        public Apple(String color, double weight, double price) { // Formal arguments/ Local variable.
            // Here - instance fields and arguments have the same name
            //color = color; // It consider only argument color, both left and right not instance fiedl
            // I want to assign the argument to the instance field, if names are same
            // Use the keyword this. Means that referring the current instance/object
            // Because you don't have any object name. Can call data, methods, constructors.
            this.color = color; // The argument value assigne to the instance data color
            this.price = price;
            this.weight = weight;
        }

        // Override the toString() method from the Object class - Helps to print status of your object
        @Override
        public String toString() {
		/*String res = "This Apple has the color " + color + " with the weight " + weight +
				" and the price is  " + price;
		return res;*/
            return  "This Apple has the color " + color + " with the weight " + weight +
                    " and the price is  " + price;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }




    }
