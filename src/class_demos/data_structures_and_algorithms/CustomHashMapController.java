package class_demos.data_structures_and_algorithms;

public class CustomHashMapController {

    public static void main(String[] args) {

        CustomHashMap<String, String> cityMap = new CustomHashMap();

        cityMap.put("Vancouver", "Canada");
        cityMap.put("Munich", "Germany");
        cityMap.put("Venice", "Italy");
        cityMap.put("Paris", "France");
        cityMap.put("Athens", "Greece");

        System.out.println(cityMap.get("Vancouver"));
        System.out.println(cityMap.get("Paris"));
        System.out.println(cityMap.get("Munich"));

        cityMap.remove("Paris");


        cityMap.contains("Paris");
        cityMap.contains("Bali");
        cityMap.contains("Venice");

    }

}
