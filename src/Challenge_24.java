import java.util.Scanner;

class SoupStyle {
    Type myType;
    Ingredient myIngredient;
    Seasoning mySeasoning;
    enum Type {
        SOUP,
        STEW,
        GUMBO
    }
    enum Ingredient {
        MUSHROOMS,
        CHICKEN,
        CARROTS,
        POTATOES
    }
    enum Seasoning {
        SPICY,
        SALTY,
        SWEET
    }
}

public class Challenge_24 {
    public static void main(String[] args) {
        SoupStyle myObj = new SoupStyle();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count == 0){
            System.out.println("Choose one of the following options: soup, stew or gumbo");
            String user = scanner.next();
            if (user.equals("soup")){
                myObj.myType = SoupStyle.Type.SOUP;
                count++;
            }
            if (user.equals("stew")){
                myObj.myType = SoupStyle.Type.STEW;
                count++;
            }
            if (user.equals("gumbo")){
                myObj.myType = SoupStyle.Type.GUMBO;
                count++;
            }
        }
        while (count == 1){
            System.out.println("Choose one of the following options: mushrooms, chicken, carrots, potatoes");
            String user = scanner.next();
            if (user.equals("mushrooms")){
                myObj.myIngredient = SoupStyle.Ingredient.MUSHROOMS;
                count ++;
            }
            if (user.equals("chicken")){
                myObj.myIngredient = SoupStyle.Ingredient.CHICKEN;
                count++;
            }
            if (user.equals("carrots")){
                myObj.myIngredient = SoupStyle.Ingredient.CARROTS;
                count++;
            }
            if (user.equals("potatoes")){
                myObj.myIngredient = SoupStyle.Ingredient.POTATOES;
                count++;
            }
        }
        while (count == 2){
            System.out.println("Choose one of the following options: spicy, salty, sweet");
            String user = scanner.next();
            if (user.equals("spicy")){
                myObj.mySeasoning = SoupStyle.Seasoning.SPICY;
                count++;
            }
            if (user.equals("salty")){
                myObj.mySeasoning = SoupStyle.Seasoning.SALTY;
                count++;
            }
            if (user.equals("sweet")){
                myObj.mySeasoning = SoupStyle.Seasoning.SWEET;
                count++;
            }
        }
        String recipe = myObj.mySeasoning + " " + myObj.myIngredient + " " + myObj.myType;
        System.out.println(recipe);
    }
}



