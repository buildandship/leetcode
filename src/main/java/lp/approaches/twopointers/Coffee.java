package lp.approaches.twopointers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Coffee {

  @JsonProperty("coffee")
  private CoffeeDTO coffee;

  @JsonProperty("brewing")
  private BrewingDTO brewing;

  @NoArgsConstructor
  @Data
  public static class CoffeeDTO {
    @JsonProperty("region")
    private List<RegionDTO> region;

    @JsonProperty("country")
    private CountryDTO country;

    @NoArgsConstructor
    @Data
    public static class CountryDTO {
      @JsonProperty("id")
      private Integer id;

      @JsonProperty("company")
      private String company;
    }

    @NoArgsConstructor
    @Data
    public static class RegionDTO {
      @JsonProperty("id")
      private Integer id;

      @JsonProperty("name")
      private String name;
    }
  }

  @NoArgsConstructor
  @Data
  public static class BrewingDTO {
    @JsonProperty("region")
    private List<RegionDTO> region;

    @JsonProperty("country")
    private CountryDTO country;

    @NoArgsConstructor
    @Data
    public static class CountryDTO {
      @JsonProperty("id")
      private Integer id;

      @JsonProperty("company")
      private String company;
    }

    @NoArgsConstructor
    @Data
    public static class RegionDTO {
      @JsonProperty("id")
      private Integer id;

      @JsonProperty("name")
      private String name;
    }
  }
}
