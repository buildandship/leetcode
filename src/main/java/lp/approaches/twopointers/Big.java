package lp.approaches.twopointers;

@lombok.NoArgsConstructor
@lombok.Data
public class Big {

  @com.fasterxml.jackson.annotation.JsonProperty("id")
  private String id;

  @com.fasterxml.jackson.annotation.JsonProperty("name")
  private String name;

  @com.fasterxml.jackson.annotation.JsonProperty("category")
  private String category;
}
