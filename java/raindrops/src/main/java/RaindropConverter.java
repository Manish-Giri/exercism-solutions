class RaindropConverter {
    String convert(int number) {
        boolean hasFactor = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                if (i == 3) {
                    sb.append("Pling");
                    hasFactor = true;
                }
                if ( i == 5) {
                    sb.append("Plang");
                    hasFactor = true;
                }
                if (i == 7) {
                    sb.append("Plong");
                    hasFactor = true;
                }
            }
        }
        if (!hasFactor) {
            sb.append(number);
        }
        return sb.toString();
    }
}
