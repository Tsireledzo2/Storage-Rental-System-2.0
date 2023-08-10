

/**
 *  StorageUnit.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */

package za.ac.cput.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class StorageUnit implements Serializable {

 @Id
    private String unitId;
    private String unitSizeDescription;
    @Embedded
    private StorageUnitType storageUnitType;
    public StorageUnit() {
    }
    private StorageUnit(Builder builder) {
        this.unitId = builder.unitId;
        this.unitSizeDescription = builder.unitSizeDescription;

    }

    public String getUnitId() {

        return unitId;
    }
    public String getDescription() {

        return unitSizeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageUnit that = (StorageUnit) o;
        return Objects.equals(unitId, that.unitId) && Objects.equals(unitSizeDescription, that.unitSizeDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, unitSizeDescription);
    }

    @Override
    public String toString() {
        return "StorageUnit{" +
                "unitId='" + unitId + '\'' +
                ", description='" + unitSizeDescription + '\'' +

                '}';
    }

    public static class Builder {
        private String unitId;
        private String unitSizeDescription;


        public Builder setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder setUnitSizeDescription(String unitSizeDescription) {
            this.unitSizeDescription = unitSizeDescription;
            return this;
        }


        public Builder copy(StorageUnit storageUnit) {
            this.unitId = storageUnit.unitId;
            this.unitSizeDescription = storageUnit.unitSizeDescription;
            return this;

        }

        public StorageUnit build() {
            return new StorageUnit(this);
        }

    }
}

