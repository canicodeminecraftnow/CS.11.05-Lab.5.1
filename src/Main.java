import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {

        Arrays.sort(retailEstimatesTonnesPerYear);
        int l = retailEstimatesTonnesPerYear.length;
        if(l%2 == 0){
            return (retailEstimatesTonnesPerYear[l / 2 - 1] + retailEstimatesTonnesPerYear[l / 2]) / 2;

        }
        else{
            return retailEstimatesTonnesPerYear[l / 2];
        }


    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        Arrays.sort(countries);
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int c = 0;
        int n = 0;
        for(int i = 0;i<countries.length;i++){
            if(country == countries[i]){
                c = i;
                return c;

            }

        }
;


        for (int i = 0;i<totalWasteKgPerCapitaPerYear.length;i++){
            if(c == totalWasteKgPerCapitaPerYear[i]) {
                n = totalWasteKgPerCapitaPerYear[i];
            }

        }
        return n;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {

        String c = "";
        for(int i = 0; i<totalWasteKgPerCapitaPerYear.length;i++){
            if(totalWasteKgPerCapitaPerYear[i] >= totalWasteKgPerCapitaPerYear[i-1]){
                int n = totalWasteKgPerCapitaPerYear[i];
                c = countries[n];
                return c;

                


            }

        }
        return c;
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        String c = "";
        for(int i = 0; i<percentagesShareInPoverty.length;i++){
            if(percentagesShareInPoverty[i] >= percentagesShareInPoverty[i-1]){
                double n = percentagesShareInPoverty[i];
                int d = (int)n;

                c = countries[d];






            }


        }
        return new String[]{c};
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        String[] c;
        c = new String[confidences.length];


        for(int i = 0; i<confidences.length;i++){
            if(countries[i] == "high"){
                int counter = 0;

                c[counter+1] = confidences[i];






            }


        }
        return c;
    }
}

