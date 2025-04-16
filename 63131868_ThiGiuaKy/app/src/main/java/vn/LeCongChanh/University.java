package vn.LeCongChanh;

public class University {
    private String universityName;
    private String universityImage;

    public University(String universityName, String universityImage) {
        this.universityName = universityName;
        this.universityImage = universityImage;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityImage() {
        return universityImage;
    }

    public void setUniversityImage(String universityImage) {
        this.universityImage = universityImage;
    }
}
