package lab8.the.java.collections.framework.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {

        /* TODO: write code to test program */
        init();

        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();

        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();

        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }
                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into
                * CountryArrayManager here.
                */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                Country country = null;

                switch (continent) {
                    case "Africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "Asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                }
                if (country != null) {
                    countryManager.append(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }
        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath =
                "src/main/java/lab8/the/java/collections/framework/countryarraymanager/data/countries.csv";        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country country = countryManager.filterNorthAmericaCountry();
        System.out.println(country.name);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country country = countryManager.filterOceaniaCountry();
        System.out.println(country.name);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country country = countryManager.filterSouthAmericaCountry();
        System.out.println(country.name);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(1);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }
}
