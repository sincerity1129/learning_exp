package learning_exp.java;

class string_change {

    public static void main(String[] args) {
        String exp = "This sentence is example.";

        // text replace
        System.out.println(String.format("origin sentence: %s", exp));
        System.out.println(exp.replace("This", "The"));
        // Remove text based on the index.
        System.out.println(exp.substring(5));
        // ETC remove(indexOf reference -> string_controller)
        System.out.println(exp.substring(exp.indexOf(" ")));
        // Index setting
        System.out.println(exp.substring(exp.indexOf(" "), exp.indexOf("example")));
        // string concat
        String exp2 = " This sentence is concat.";
        System.out.println(exp.concat(exp2));
        // string equals, equ
        System.out.println(exp.equals(exp));
        // ignore upper lower
        System.out.println(exp.equalsIgnoreCase(exp));
    }
}