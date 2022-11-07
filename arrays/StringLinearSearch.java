public class StringLinearSearch {

    public static int linearSearch(String cities[], String key){
        for(int i=0; i<cities.length; i++){
            if(cities[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String cities[] = { "patna", "jaipur", "delhi", "mumbai" };
        String key = "delhi";

        int index = linearSearch(cities, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index : " + index);
        }

    }
}
