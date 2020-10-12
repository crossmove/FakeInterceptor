package finalCheckOne;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class Teacher {

    @JsonProperty("id")
    private Long mID;

    @JsonProperty("name")
    private String mName;

    @JsonProperty("age")
    private Integer mAge;

    public Teacher() {

    }

    public Integer getAge() {
        return mAge;
    }

    public String getName() {
        return mName;
    }

    public Long getID() {
        return mID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "mID=" + mID +
                ", mName='" + mName + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}
