import java.util.*;

class Asset {
    String name;
    double returnRate;
    double volatility;

    Asset(String n, double r, double v) {
        name = n; returnRate = r; volatility = v;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class Main {

    public static void mergeSort(List<Asset> list) {
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
    }

    public static void quickSort(List<Asset> list) {
        list.sort((a, b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });
    }

    public static void main(String[] args) {
        List<Asset> list = List.of(
                new Asset("AAPL", 12, 5),
                new Asset("TSLA", 8, 7),
                new Asset("GOOG", 15, 4)
        );

        List<Asset> copy1 = new ArrayList<>(list);
        mergeSort(copy1);
        System.out.println(copy1);

        List<Asset> copy2 = new ArrayList<>(list);
        quickSort(copy2);
        System.out.println(copy2);
    }
}