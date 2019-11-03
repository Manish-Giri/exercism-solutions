class Twofer {
    String twofer(String name) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        /*if(name == null) {
            return "One for you, one for me.";
        }
        else {
            return String.format("One for %s, one for me.", name);
        }*/

        return name == null ? "One for you, one for me." : String.format("One for %s, one for me.", name);
    }
}
