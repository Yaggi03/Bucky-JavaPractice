class NestedIfStatements2 {
    public static void main(String[] args) {
        int age = 60;

        if (age < 50) {
            System.out.println("You are Young!");
        }else{
            System.out.println("You are old");
            if (age > 75) {
                System.out.println("You are really old!");
            }else{
                System.out.println("Dont worry you arent really that old");
            }
        }

    }
}