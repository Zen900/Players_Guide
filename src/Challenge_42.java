public class Challenge_42 {
    enum Material{
        WOOD,
        BRONZE,
        IRON,
        STEEL,
        BINARIUM
    }
    enum Gemstone{
        EMERALD,
        AMBER,
        SAPPHIRE,
        DIAMOND,
        BITSTONE,
        NO_GEMSTONE
    }

    public record Sword (Material material, Gemstone gemstone, int length, int width){
        Sword withMaterial(Material material){
            return new Sword(material, gemstone, length, width);
        }
        Sword withGemstone(Gemstone gemstone){
            return new Sword(material, gemstone, length, width);
        }
        Sword withLength(int length){
            return new Sword(material,gemstone,length,width);
        }
        Sword withWidth(int width){
            return new Sword(material, gemstone, length, width);
        }
        public String toString(){
            String text = material.toString().toLowerCase() + " sword of " + length + " centimetres long, a crossguard width of " + width + " cm";
            if (gemstone == Gemstone.NO_GEMSTONE){
                return "a plain " + text;
            }
          return "a " + text + ", and an embedded " + gemstone.toString().toLowerCase();
        }
    }

    public static void main(String[] args) {
        int length = 80;
        int width = 15;
        Sword original = new Sword(Material.IRON, Gemstone.NO_GEMSTONE, length, width);
        Sword sword1 = original.withMaterial(Material.BINARIUM);
        Sword sword2 = original.withGemstone(Gemstone.EMERALD).withLength(85).withWidth(19);
        System.out.println(original);
        System.out.println(sword1);
        System.out.println(sword2);
    }
}