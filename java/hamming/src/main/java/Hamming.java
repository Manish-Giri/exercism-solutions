class Hamming {
    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        getHammingDistance();
    }

    int getHammingDistance() {
        if(leftStrand.isEmpty() && rightStrand.isEmpty()) {
            return 0;
        }
        if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        else {
            int distance = 0;
            for (int i = 0; i < leftStrand.length(); i++) {
                if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    distance++;
                }
            }
            return distance;
        }
    }
}
