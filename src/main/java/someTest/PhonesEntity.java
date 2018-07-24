package someTest;

import javax.persistence.*;

@Entity
@Table(name = "phones", schema = "wp_schema")
public class PhonesEntity {
    private int idPhones;
    private String name;
    private Integer size;

    @Id
    @Column(name = "idPhones", nullable = false)
    public int getIdPhones() {
        return idPhones;
    }

    public void setIdPhones(int idPhones) {
        this.idPhones = idPhones;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhonesEntity that = (PhonesEntity) o;

        if (idPhones != that.idPhones) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPhones;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhonesEntity{" + "idPhones=" + idPhones + ", name='" + name + '\'' + ", size=" + size + '}';
    }
}
