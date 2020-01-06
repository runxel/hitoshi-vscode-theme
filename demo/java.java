/*
 * Everyone likes milkshakes!
 */
public class MilkShake {
    /*
    * Go get some vitamins or what not
    * @param fruits the fruits to mix
    * @return a collection of mixed fruits
    */
  private List<Fruit> mixProteins(List<Fruit> fruits) {

      return fruits.stream()
          .filter(fruit -> fruit.equals(Fruitlist.BANANA))
          .forEach(banana -> yogurt(banana))
          .collect(Collectors.toList());
  }
}
