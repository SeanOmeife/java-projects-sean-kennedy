So in this chapter I learned how to format strings when returning the output of a script

1. You can use this method:
        String name;
        int age;
        System.out.println(String.format("My name is %s and I am %dyrs old", name, age));

    or

2. This method (I prefer this)
        String name;
        int age;
        System.out.printf("My name is %s and I am %d years old", name, age);

Both methods are used to create formatted strings with placeholders (where %s is used for string, and %d is used for integers).
The placeholders are replaced with the corresponding variable in the order they appear.