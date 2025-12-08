public class Child {

    private String name;
    private int numCandies;

    //Constructor: sets candies to two && gives a name
    public Child(String name) {
        this.name = name;
        this.numCandies = 2;
    }

    //Giving candies void method
    public void givesCandieTo(Child other) {
        if (this.numCandies > 0) {
            this.numCandies = this.numCandies - 1;
            other.numCandies = other.numCandies + 1;
        } else {
            System.out.println("No candies to give :( ");
        }
    }

    //Find the child by name
    public static Child getChildByName(Child[] children, String name) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].name.equals(name)) {
                return children[i];
            }
        }
        return null;
    }

    //Display everyone
    public static void printChildren(Child[] children) {
        for (int i = 0; i < children.length; i++) {
            System.out.print("(" + children[i].name + ", " + children[i].numCandies + " candies) ");
        }
    }

}
