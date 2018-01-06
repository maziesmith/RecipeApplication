package liamcottrell.recipeapplication.datamodel.Matches;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Matches {

@SerializedName("criteria")
@Expose
private Criteria criteria;
@SerializedName("matches")
@Expose
private List<Match> matches = null;
@SerializedName("facetCounts")
@Expose
private FacetCounts facetCounts;
@SerializedName("totalMatchCount")
@Expose
private Integer totalMatchCount;
@SerializedName("attribution")
@Expose
private Attribution attribution;

public Criteria getCriteria() {
return criteria;
}

public void setCriteria(Criteria criteria) {
this.criteria = criteria;
}

public List<Match> getMatches() {
return matches;
}

public void setMatches(List<Match> matches) {
this.matches = matches;
}

public FacetCounts getFacetCounts() {
return facetCounts;
}

public void setFacetCounts(FacetCounts facetCounts) {
this.facetCounts = facetCounts;
}

public Integer getTotalMatchCount() {
return totalMatchCount;
}

public void setTotalMatchCount(Integer totalMatchCount) {
this.totalMatchCount = totalMatchCount;
}

public Attribution getAttribution() {
return attribution;
}

public void setAttribution(Attribution attribution) {
this.attribution = attribution;
}

}