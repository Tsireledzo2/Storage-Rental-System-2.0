

/**
 * This is the StorageUnit class
 * Author Ruvimbo Ndoro 220128871
 * Date 8May 2023
 */

package za.ac.cput.domain;

import java.io.Serializable;
import java.util.Objects;

public class StorageUnit implements Serializable {


    private String unitId;
    private String unitSizeDescription;



    private StorageUnit() {
    }

    private StorageUnit(Builder builder) {
        this.unitId = builder.unitId;
        this.unitSizeDescription = builder.description;

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
        private String description;


        public Builder setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Builder copy(StorageUnit storageUnit) {
            this.unitId = storageUnit.unitId;
            this.description = storageUnit.unitSizeDescription;
            return this;

        }

        public StorageUnit build() {
            return new StorageUnit(this);
        }

    }
}

