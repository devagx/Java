package onlineretailer.productsuggestion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductSuggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = -1;

    private String productDescription;
    private double recommendedPrice;
    private long estimatedAnnualSales;

    public ProductSuggestion(String productDescription, double recommendedPrice, long estimatedAnnualSales) {
        this.productDescription = productDescription;
        this.recommendedPrice = recommendedPrice;
        this.estimatedAnnualSales = estimatedAnnualSales;
    }

    public ProductSuggestion() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    public void setRecommendedPrice(double reccomendedPrice) {
        this.recommendedPrice = reccomendedPrice;
    }

    public double getEstimatedAnnualSales() {
        return estimatedAnnualSales;
    }

    public void setEstimatedAnnualSales(long estimatedAnnualSales) {
        this.estimatedAnnualSales = estimatedAnnualSales;
    }
}
