public class Discount {
    public static void main(String[] args) {
        // On the bus you receive a discount if you are a senior citizen (-15%), a dog (-20%) or a student (-10%).
        // The full prize for a bus ticket is 3,20 Euros.








       // 2. In a bookshop you receive a discount if you buy more than 2 non-fiction books and
        // at least one fiction book (-10%).
       // How much can Edna (a senior citizen), her dog Lola, and her grandson Paul save if
        // they take the bus in both directions and buy a fiction (for 15 and 18 Euros)
        // and a non-fiction (for 23 and 28 Euros) book each?

  boolean isSenior = true;
  boolean isDog  = true;
  boolean isStudent = true;

  double fullBusPrice = 3.2;

  double busTicketEdna = getBusDiscountPrice( fullBusPrice, true, false, false);
  double busTicketLola = getBusDiscountPrice( fullBusPrice, false, true, false);
  double busPricePaul = getBusDiscountPrice( fullBusPrice, false, false, true);


  double totalBusPriceDiscounted = 2 *  ( busPricePaul + busTicketEdna + busTicketLola);
  double totalBusPriceNoDiscount = 6 * 3.2;
  int fiction = 2;
  int nonFiction =2;
  double fullBookPriceNoDiscounted = 15 + 18 + 23 + 28;


  double totalBookPriceDiscounted = getBookDiscountPrice(fullBookPriceNoDiscounted, fiction, nonFiction);
  double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPriceNoDiscounted) - ( totalBusPriceDiscounted +totalBookPriceDiscounted);
        System.out.println( "Edna, Lola, and Paul saved a total of " + totalSavedMoney);

    }
    public static double getBusDiscountPrice (double fullPrice, boolean isSenior, boolean isDog, boolean isStudent) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = fullPrice * 0.85;

        } else if ((isDog)) {
            discountedPrice = fullPrice * 0.8;

        } else if (isStudent) {
            discountedPrice = fullPrice * 0.9;

        } else {
            discountedPrice = fullPrice;
        }
        return discountedPrice;
    }
    public static double getBookDiscountPrice (double fullBookPrice, int fiction, int nonFiction) {
        double discountedBookPrice;
        if (fiction>=1 && nonFiction > 2) {
            discountedBookPrice = fullBookPrice * 0.9;
        }
        else {
            discountedBookPrice = fullBookPrice;
        }
        return  discountedBookPrice;

        }
    }



