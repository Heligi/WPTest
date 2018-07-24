package someTest;

import jdk.Exported;

import javax.persistence.*;

@Entity
@Table(name = "test", schema = "wp_schema")
public class TestK {
    private int idT;
    private String some1;
    private String some2;
    private Integer some3;

    @Id
    @Column(name = "idT", nullable = false)
    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    @Basic
    @Column(name = "some1", nullable = true, length = 20)
    public String getSome1() {
        return some1;
    }

    public void setSome1(String some1) {
        this.some1 = some1;
    }

    @Basic
    @Column(name = "some2", nullable = true, length = 20)
    public String getSome2() {
        return some2;
    }

    public void setSome2(String some2) {
        this.some2 = some2;
    }

    @Basic
    @Column(name = "some3", nullable = true, length = 20)
    public Integer getSome3() {
        return some3;
    }

    public void setSome3(Integer some3) {
        this.some3 = some3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestK that = (TestK) o;

        if (idT != that.idT) return false;
        if (some1 != null ? !some1.equals(that.some1) : that.some1 != null) return false;
        if (some2 != null ? !some2.equals(that.some2) : that.some2 != null) return false;
        if (some3 != null ? !some3.equals(that.some3) : that.some3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idT;
        result = 31 * result + (some1 != null ? some1.hashCode() : 0);
        result = 31 * result + (some2 != null ? some2.hashCode() : 0);
        result = 31 * result + (some3 != null ? some3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestK{" + "idT=" + idT + ", some1='" + some1 + '\'' + ", some2='" + some2 + '\'' + ", some3=" + some3 + '}';
    }
}
